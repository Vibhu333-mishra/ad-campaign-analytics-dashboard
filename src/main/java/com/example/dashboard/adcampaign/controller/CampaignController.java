package com.example.dashboard.adcampaign.controller;

import com.example.dashboard.adcampaign.service.CampaignService;
import com.example.dashboard.adcampaign.entity.Campaign;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Campaigns")
public class CampaignController {
    private final CampaignService campaignService;

    public CampaignController(CampaignService campaignService){
        this.campaignService=campaignService;
    }

    @PostMapping
    public Campaign createCampaign(@RequestBody Campaign campaign){
        return campaignService.SaveCampaign(campaign);
    }

    @GetMapping
    public List<Campaign> getAllCampaign(){
        return campaignService.getAllCampaign();
    }
    @GetMapping("/{id}")
    public Optional<Campaign> getCampaignById(@PathVariable Long id){
        return campaignService.getCampaignById(id);
    }


    // Update Campaign
    @PutMapping("/{id}")
    public Campaign updateCampaign(@PathVariable Long id,
                                   @RequestBody Campaign campaign) {
        return campaignService.updateCampaign(id, campaign);
    }


    // Delete Campaign
    @DeleteMapping("/{id}")
    public String deleteCampaign(@PathVariable Long id) {
        campaignService.deleteCampaign(id);
        return "Campaign deleted successfully!";
    }

}
