package com.epam.genai.controller;

import com.epam.genai.model.CompanyDataTable;
import com.epam.genai.service.LegalMatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companydata")
public class CompanyDataTableController {

    @Autowired
    private LegalMatterService legalMatterService;

    @GetMapping
    public ResponseEntity<List<CompanyDataTable>> getAllCompanyData() {
        List<CompanyDataTable> companyData = legalMatterService.getAllCompanyData();
        return ResponseEntity.ok(companyData);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDataTable> getCompanyDataById(@PathVariable Long id) {
        return legalMatterService.getCompanyDataById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CompanyDataTable> createCompanyData(@RequestBody CompanyDataTable companyData) {
        CompanyDataTable savedCompanyData = legalMatterService.saveCompanyData(companyData);
        return ResponseEntity.ok(savedCompanyData);
    }
}
