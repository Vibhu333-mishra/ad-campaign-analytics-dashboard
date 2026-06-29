package com.example.dashboard.adcampaign.dashboard;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DashboardDTO {
    private  Long totalAdvertisers;

    private Long totalCampaigns;

    private Integer totalClicks;

    private Integer totalImpressions;

    private Integer totalConversions;

    private Double totalSpend;

    private Double totalRevenue;

    private Double ctr;

    private Double cpc;

    private Double cpm;

    private Double roi;
}
