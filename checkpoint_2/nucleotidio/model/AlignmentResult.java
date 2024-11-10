package com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.model;

import java.util.List;

public class AlignmentResult {
    private double distance_score;
    private double similarity_score;
    private List<String> observations;
    private int length;
    private String format;
    private String processing_time;
    private String created_at;
    private String status;

    public AlignmentResult() {}

    public double getDistance_score() {
        return distance_score;
    }

    public void setDistance_score(double distance_score) {
        this.distance_score = distance_score;
    }

    public double getSimilarity_score() {
        return similarity_score;
    }

    public void setSimilarity_score(double similarity_score) {
        this.similarity_score = similarity_score;
    }

    public List<String> getObservations() {
        return observations;
    }

    public void setObservations(List<String> observations) {
        this.observations = observations;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getProcessing_time() {
        return processing_time;
    }

    public void setProcessing_time(String processing_time) {
        this.processing_time = processing_time;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
} 