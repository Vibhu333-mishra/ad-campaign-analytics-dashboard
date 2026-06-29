package com.example.dashboard.adcampaign.controller;

import com.example.dashboard.adcampaign.service.AdvertiserService;
import com.example.dashboard.adcampaign.entity.Advertiser;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/advertisers")
public class AdvertiserController {
    private final AdvertiserService advertiserService;

    public AdvertiserController(AdvertiserService advertiserService){
        this.advertiserService=advertiserService;
    }


    @PostMapping
    public Advertiser createAdvertiser(@RequestBody Advertiser advertiser){
        return advertiserService.saveAdvertiser(advertiser);
    }


    @GetMapping
    public List<Advertiser> getAllAdvertiser(){

        return advertiserService.getAllAdvertiser();
    }


    @GetMapping("/id")
    public Optional<Advertiser> getAdvertiserById(Long id){
        return advertiserService.getAdvertiserById(id);
    }

    // Update Advertiser
    @PutMapping("/{id}")
    public Advertiser updateAdvertiser(@PathVariable Long id,
                                       @RequestBody Advertiser advertiser) {
        return advertiserService.updateAdvertiser(id, advertiser);
    }

    // Delete Advertiser
    @DeleteMapping("/{id}")
    public String deleteAdvertiser(@PathVariable Long id) {
        advertiserService.deleteAdvertiser(id);
        return "Advertiser deleted successfully.";
    }
}
