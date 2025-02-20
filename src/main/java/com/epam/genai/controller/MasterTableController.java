package com.epam.genai.controller;

import com.epam.genai.model.MasterTable;
import com.epam.genai.service.LegalMatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mastertable")
public class MasterTableController {

    @Autowired
    private LegalMatterService legalMatterService;

    @GetMapping
    public ResponseEntity<List<MasterTable>> getAllMasterTables() {
        List<MasterTable> masterTables = legalMatterService.getAllMasterTables();
        return ResponseEntity.ok(masterTables);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MasterTable> getMasterTableById(@PathVariable Long id) {
        return legalMatterService.getMasterTableById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<MasterTable> createMasterTable(@RequestBody MasterTable masterTable) {
        MasterTable savedMasterTable = legalMatterService.saveMasterTable(masterTable);
        return ResponseEntity.ok(savedMasterTable);
    }
}
