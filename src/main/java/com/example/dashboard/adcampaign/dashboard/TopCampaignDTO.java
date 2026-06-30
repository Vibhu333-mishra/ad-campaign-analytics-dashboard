package com.example.dashboard.adcampaign.dashboard;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TopCampaignDTO {
    private String campaignName;
    private Integer clicks;
    private Double revenue;
}
