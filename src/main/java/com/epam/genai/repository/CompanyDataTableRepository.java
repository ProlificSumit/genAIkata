package com.epam.genai.repository;

import com.epam.genai.model.CompanyDataTable;
import com.epam.genai.model.MasterTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDataTableRepository extends JpaRepository<CompanyDataTable, Long> {
}
