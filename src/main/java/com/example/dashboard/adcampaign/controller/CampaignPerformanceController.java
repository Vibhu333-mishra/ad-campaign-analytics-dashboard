package com.example.dashboard.adcampaign.controller;

import com.example.dashboard.adcampaign.service.CampaignPerformanceService;
import com.example.dashboard.adcampaign.entity.CampaignPerformance;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/performance")
public class CampaignPerformanceController {
    private final CampaignPerformanceService campaignPerformanceService;

    public CampaignPerformanceController(CampaignPerformanceService campaignPerformanceService) {
        this.campaignPerformanceService = campaignPerformanceService;
    }

    @PostMapping
    public CampaignPerformance createPerformance(@RequestBody CampaignPerformance performance) {
        return campaignPerformanceService.savePerformance(performance);
    }
    @GetMapping
    public List<CampaignPerformance> getAllCampaignPerformance(){
        return campaignPerformanceService.getAllCampaignPerformance();
    }
    @GetMapping("/{id}")
    public Optional<CampaignPerformance> getCampaignPerformanceById(@PathVariable Long id){
        return campaignPerformanceService.getCampaignPerformanceById(id);
    }

    @PutMapping("/{id}")
    public CampaignPerformance updatePerformance(@PathVariable Long id,
                                                 @RequestBody CampaignPerformance performance) {
        return campaignPerformanceService.updatePerformance(id, performance);
    }

    // Delete Performance
    @DeleteMapping("/{id}")
    public String deletePerformance(@PathVariable Long id) {
        campaignPerformanceService.deletePerformance(id);
        return "Performance record deleted successfully!";
    }

}