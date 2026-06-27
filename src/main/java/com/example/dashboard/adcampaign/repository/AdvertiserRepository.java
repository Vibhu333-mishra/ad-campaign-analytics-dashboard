package com.example.dashboard.adcampaign.repository;

import com.example.dashboard.adcampaign.entity.Advertiser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertiserRepository extends JpaRepository<Advertiser, Long>{
}
