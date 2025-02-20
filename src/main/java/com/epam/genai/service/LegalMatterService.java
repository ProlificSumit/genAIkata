package com.epam.genai.service;

import com.epam.genai.model.CompanyDataTable;
import com.epam.genai.model.MasterTable;
import com.epam.genai.repository.CompanyDataTableRepository;
import com.epam.genai.repository.MasterTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LegalMatterService {

    @Autowired
    private MasterTableRepository masterTableRepository;

    @Autowired
    private CompanyDataTableRepository companyDataTableRepository;

    public List<MasterTable> getAllMasterTables() {
        return masterTableRepository.findAll();
    }

    public Optional<MasterTable> getMasterTableById(Long id) {
        return masterTableRepository.findById(id);
    }

    public MasterTable saveMasterTable(MasterTable masterTable) {
        return masterTableRepository.save(masterTable);
    }

    public List<CompanyDataTable> getAllCompanyData() {
        return companyDataTableRepository.findAll();
    }

    public Optional<CompanyDataTable> getCompanyDataById(Long id) {
        return companyDataTableRepository.findById(id);
    }

    public CompanyDataTable saveCompanyData(CompanyDataTable companyData) {
        return companyDataTableRepository.save(companyData);
    }
}