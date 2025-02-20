package com.epam.genai.model;

import com.epam.genai.model.CompanyDataTable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "master_table")
@Getter
@Setter
public class MasterTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(mappedBy = "masterTable", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CompanyDataTable> companyData = new HashSet<>();

    // Constructors, Getters and Setters
}