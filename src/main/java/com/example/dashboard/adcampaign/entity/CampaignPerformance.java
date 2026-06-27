package com.example.dashboard.adcampaign.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "campaign_performance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampaignPerformance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long performance_id;

    private Integer impression;


    private Integer clicks;

    private Integer conversions;

    private Double spend;

    private Double revenue;

    private String country;

    @Enumerated(EnumType.STRING)
    private  DeviceType deviceType;

    @ManyToOne
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;
}
