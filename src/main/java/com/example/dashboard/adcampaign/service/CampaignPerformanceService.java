package com.example.dashboard.adcampaign.service;

import com.example.dashboard.adcampaign.entity.CampaignPerformance;
import com.example.dashboard.adcampaign.repository.CampaignPerformanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampaignPerformanceService {
    private final CampaignPerformanceRepository campaignPerformanceRepository;

    public CampaignPerformanceService(CampaignPerformanceRepository campaignPerformanceRepository){
        this.campaignPerformanceRepository=campaignPerformanceRepository;
    }

    public CampaignPerformance savePerformance(CampaignPerformance performance){
        return campaignPerformanceRepository.save(performance);
    }
    public List<CampaignPerformance> getAllCampaignPerformance(){
        return campaignPerformanceRepository.findAll();
    }

    public Optional<CampaignPerformance> getCampaignPerformanceById(Long id){
        return campaignPerformanceRepository.findById(id);
    }
}
