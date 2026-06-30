package com.example.dashboard.adcampaign.dashboard;

import com.example.dashboard.adcampaign.repository.AdvertiserRepository;
import com.example.dashboard.adcampaign.repository.CampaignPerformanceRepository;
import com.example.dashboard.adcampaign.repository.CampaignRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DashboardService {
    private final AdvertiserRepository advertiserRepository;
    private final CampaignRepository campaignRepository;
    private final CampaignPerformanceRepository campaignPerformanceRepository;

    public DashboardService(AdvertiserRepository advertiserRepository, CampaignRepository campaignRepository, CampaignPerformanceRepository campaignPerformanceRepository)
    {
        this.advertiserRepository=advertiserRepository;
        this.campaignRepository=campaignRepository;
        this.campaignPerformanceRepository=campaignPerformanceRepository;
    }

    public  DashboardDTO getDashboardSummary(){
        DashboardDTO dashboard =new DashboardDTO();
        Long totalAdvertisers=advertiserRepository.count();
        Long totalCampaigns=campaignRepository.count();

        Integer totalImpressions=campaignPerformanceRepository.getTotalImpressions();
        Integer totalClicks=campaignPerformanceRepository.getTotalClicks();
        Integer totalConversions=campaignPerformanceRepository.getTotalConversions();

        Double totalSpend=campaignPerformanceRepository.getTotalSpends();
        Double totalRevenue= campaignPerformanceRepository.getTotalRevenue();

        dashboard.setTotalAdvertisers(totalAdvertisers);
        dashboard.setTotalCampaigns(totalCampaigns);
        dashboard.setTotalImpressions(totalImpressions);
        dashboard.setTotalClicks(totalClicks);
        dashboard.setTotalConversions(totalConversions);
        dashboard.setTotalSpend(totalSpend);
        dashboard.setTotalRevenue(totalRevenue);

        // CALCULATING KPI
        if(totalImpressions !=null && totalImpressions >0){
            dashboard.setCtr((totalClicks * 100.0)/totalImpressions);
            dashboard.setCpm((totalSpend * 100.0)/totalImpressions);
        }
        if(totalClicks !=null && totalClicks>0){
            dashboard.setCpc(totalSpend/totalClicks);
        }
        if(totalSpend !=null && totalSpend>0){
            dashboard.setRoi(((totalRevenue - totalSpend) / totalSpend) * 100);
        }
        return  dashboard;
    }
    public List<CountryRevenueDTO> getRevenueByCountry(){
        List<Objects> result= campaignPerformanceRepository.getRevenueByCountry();
    }
}
