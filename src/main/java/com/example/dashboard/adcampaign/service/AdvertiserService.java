package com.example.dashboard.adcampaign.service;

import com.example.dashboard.adcampaign.entity.Advertiser;
import com.example.dashboard.adcampaign.repository.AdvertiserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdvertiserService {

    public final AdvertiserRepository advertiserRepository;

    public AdvertiserService(AdvertiserRepository advertiserRepository) {
        this.advertiserRepository = advertiserRepository;
    }

    // CREATING NEW ADVERTISER(insert into advertiser.....)//
    public Advertiser saveAdvertiser(Advertiser advertiser) {
        return advertiserRepository.save(advertiser);
    }

    // GET ALL THE ADVERTISER YOU WANT//
    public List<Advertiser> getAllAdvertiser(){

        return advertiserRepository.findAll();
       }

    //GET THE ADVERTISERS BY ID//
    public Optional<Advertiser> getAdvertiserById(Long id){
        return advertiserRepository.findById(id);
       }


}
