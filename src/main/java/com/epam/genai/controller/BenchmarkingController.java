package com.epam.genai.controller;

import com.epam.genai.dto.BenchmarkingResponse;
import com.epam.genai.service.BenchmarkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/benchmarking")
public class BenchmarkingController {

    @Autowired
    private BenchmarkingService benchmarkingService;

    @PostMapping("/analyze")
    public ResponseEntity<BenchmarkingResponse> analyzeSubstantiveLaw(@RequestParam String substantiveLawQuery) {
        try {
            BenchmarkingResponse response = benchmarkingService.analyzeSubstantiveLaw(substantiveLawQuery);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new BenchmarkingResponse("Error processing request: " + e.getMessage()));
        }
    }
}
