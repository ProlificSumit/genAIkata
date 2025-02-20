package com.epam.genai.repository;

import com.epam.genai.model.MasterTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterTableRepository extends JpaRepository<MasterTable, Long> {
}
