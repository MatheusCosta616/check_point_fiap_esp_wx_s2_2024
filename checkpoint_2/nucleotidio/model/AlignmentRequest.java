package com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.model;

import java.util.List;

public class AlignmentRequest {
    private String tracing_uuid;
    private String format;
    private String method;
    private List<SequenceInput> sequences;

    public AlignmentRequest() {}

    public String getTracing_uuid() {
        return tracing_uuid;
    }

    public void setTracing_uuid(String tracing_uuid) {
        this.tracing_uuid = tracing_uuid;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<SequenceInput> getSequences() {
        return sequences;
    }

    public void setSequences(List<SequenceInput> sequences) {
        this.sequences = sequences;
    }
} 