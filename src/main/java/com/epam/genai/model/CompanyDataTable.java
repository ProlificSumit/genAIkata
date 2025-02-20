package com.epam.genai.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "company_data_table")
@Getter
@Setter
public class CompanyDataTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "data_entry")
    private String dataEntry;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_table_id")
    private MasterTable masterTable;

    // Constructors, Getters and Setters
}