package com.example.dashboard.adcampaign.repository;

import com.example.dashboard.adcampaign.entity.CampaignPerformance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CampaignPerformanceRepository extends JpaRepository<CampaignPerformance, Long> {
    @Query("SELECT Sum(cp.impressions) FROM CampaignPerformance cp")
    Integer getTotalImpressions();

    @Query("SELECT SUM(cp.clicks) FROM CampaignPerformance cp")
    Integer getTotalClicks();

    @Query("SELECT SUM(cp.conversions) FROM CampaignPerformance cp")
    Integer getTotalConversions();

    @Query("SELECT SUM(cp.spend) FROM CampaignPerformance cp")
    Double getTotalSpends();

    @Query("SELECT SUM(cp.revenue) FROM CampaignPerformance cp")
    Double getTotalRevenue();



}
