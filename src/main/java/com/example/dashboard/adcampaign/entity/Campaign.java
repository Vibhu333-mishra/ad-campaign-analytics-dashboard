package com.example.dashboard.adcampaign.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "campaigns")
@Getter
@Setter
@NoArgsConstructor

public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Campaign_id;

    @Column(nullable = false)
    private String campaignName;

    private Double  budget;
    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private CampaignStatus status;

    @ManyToOne
    @JoinColumn(name = "advertiser_id")
    private Advertiser advertiser;
    @OneToMany(mappedBy = "campaign",
            cascade = CascadeType.ALL,
            orphanRemoval = true)

    private List<CampaignPerformance> performanceList;

}
