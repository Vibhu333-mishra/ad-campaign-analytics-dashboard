package com.example.dashboard.adcampaign.repository;

import com.example.dashboard.adcampaign.entity.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
