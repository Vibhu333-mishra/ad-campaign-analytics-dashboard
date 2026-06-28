package com.example.dashboard.adcampaign.service;

import com.example.dashboard.adcampaign.entity.Campaign;
import com.example.dashboard.adcampaign.repository.CampaignRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampaignService {
    private final CampaignRepository campaignRepository;

    //Constructor method(Service layer does not directly talk with the db, they need the object of repo to map in them first)
    public CampaignService(CampaignRepository campaignRepository){
        this.campaignRepository=campaignRepository;
    }
    public Campaign SaveCampaign(Campaign campaign){
        return campaignRepository.save(campaign);
    }
    // get all the campaign
    public List<Campaign> getAllCampaign(){
        return campaignRepository.findAll();
    }
    //get the campaign by the id
    public Optional<Campaign> getCampaignById(Long id){
    return campaignRepository.findById(id);
    }
}
