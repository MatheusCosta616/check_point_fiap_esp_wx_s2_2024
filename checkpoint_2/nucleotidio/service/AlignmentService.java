package com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.service;

import com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.model.AlignmentRequest;
import com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.model.AlignmentResponse;
import com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.model.AlignmentResult;
import com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.model.Method;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class AlignmentService {
    
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
    private static final ZoneId ZONE_SP = ZoneId.of("America/Sao_Paulo");
    
    public AlignmentResponse calculateDistance(AlignmentRequest request) {
        long startTime = System.nanoTime();
        
        String seq1 = request.getSequences().get(0).getSequence();
        String seq2 = request.getSequences().get(1).getSequence();
        
        int distance = calculateHammingDistance(seq1, seq2);
        double similarity = 1.0 - ((double) distance / seq1.length());
        
        AlignmentResponse response = new AlignmentResponse();
        response.setTracing_id(request.getTracing_uuid());
        response.setAlignment_uuid(UUID.randomUUID().toString());
        response.setStatus("PROCESSED");
        
        Method method = new Method();
        method.setName("HAMMING_DISTANCE");
        method.setAbout("The Hamming Distance measures the difference between two strings of equal length by counting the number of positions where the corresponding characters differ. It is commonly used in error detection, bioinformatics, cryptography, and machine learning to assess similarity or detect changes. For example, the Hamming Distance between \"ACGT\" and \"ACGG\" is 1, as only the last character differs.");
        method.setReferences(Arrays.asList(
            "https://www.sciencedirect.com/topics/computer-science/hamming-distance",
            "https://en.wikipedia.org/wiki/Hamming_distance"
        ));
        response.setMethod(method);
        
        LocalDateTime now = LocalDateTime.now(ZONE_SP);
        String formattedDate = now.format(formatter) + " (GMT-03:00)";
        
        AlignmentResult result = new AlignmentResult();
        result.setDistance_score(distance);
        result.setSimilarity_score(similarity);
        result.setObservations(new ArrayList<>());
        result.setLength(seq1.length());
        result.setFormat(request.getFormat());
        result.setProcessing_time(String.format("%.3fs", (System.nanoTime() - startTime) / 1e9));
        result.setCreated_at(formattedDate);
        result.setStatus("PROCESSED");
        
        response.setResult(Arrays.asList(result));
        response.setCreated_at(formattedDate);
        response.setUpdated_at(formattedDate);
        
        return response;
    }
    
    private int calculateHammingDistance(String seq1, String seq2) {
        if (seq1.length() != seq2.length()) {
            throw new IllegalArgumentException("Sequences must have equal length");
        }
        
        int distance = 0;
        for (int i = 0; i < seq1.length(); i++) {
            if (seq1.charAt(i) != seq2.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }
}