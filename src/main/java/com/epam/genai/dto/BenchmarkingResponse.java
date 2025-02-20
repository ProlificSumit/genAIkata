package com.epam.genai.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Component
public class BenchmarkingResponse {
    private List<LawRecord> records;
    private String message;

    public BenchmarkingResponse() {
        this.records = new ArrayList<>();
    }

    public BenchmarkingResponse(String message) {
        this.message = message;
        this.records = new ArrayList<>();
    }

    public void addLawRecord(int lawId, int companyId, int customSubsLawId, String customSubstantiveLaw) {
        records.add(new LawRecord(lawId, companyId, customSubsLawId, customSubstantiveLaw));
    }

    // Getters and Setters
}

class LawRecord {
    private int lawId;
    private int companyId;
    private int customSubsLawId;
    private String customSubstantiveLaw;

    public LawRecord(int lawId, int companyId, int customSubsLawId, String customSubstantiveLaw) {
        this.lawId = lawId;
        this.companyId = companyId;
        this.customSubsLawId = customSubsLawId;
        this.customSubstantiveLaw = customSubstantiveLaw;
    }

    // Getters and Setters
}
