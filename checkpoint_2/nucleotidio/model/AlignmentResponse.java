package com.example.cp2_2.src.main.java.br.com.fiap.twoespx.nucleotidio.model;

import java.util.List;

public class AlignmentResponse {
    private String tracing_id;
    private String alignment_uuid;
    private Method method;
    private List<AlignmentResult> result;
    private String status;
    private String created_at;
    private String updated_at;

    public AlignmentResponse() {}

    public String getTracing_id() {
        return tracing_id;
    }

    public void setTracing_id(String tracing_id) {
        this.tracing_id = tracing_id;
    }

    public String getAlignment_uuid() {
        return alignment_uuid;
    }

    public void setAlignment_uuid(String alignment_uuid) {
        this.alignment_uuid = alignment_uuid;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public List<AlignmentResult> getResult() {
        return result;
    }

    public void setResult(List<AlignmentResult> result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
} 