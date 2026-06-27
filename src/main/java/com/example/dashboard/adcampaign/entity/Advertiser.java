package com.example.dashboard.adcampaign.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="advertisers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Advertiser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advertiser_id;

    @Column(nullable = false)
    private String advertiser_name;

    private String industry;

    @Column(unique = true)
    private String contactEmail;

    private LocalDate createdAt;

    @OneToMany(mappedBy = "advertiser",
            cascade = CascadeType.ALL,
            orphanRemoval = true)

    private List<Campaign> campaigns;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDate.now();
}}
