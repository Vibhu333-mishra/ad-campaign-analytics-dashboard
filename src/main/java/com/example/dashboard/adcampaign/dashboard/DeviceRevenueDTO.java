package com.example.dashboard.adcampaign.dashboard;


import com.example.dashboard.adcampaign.entity.DeviceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter@NoArgsConstructor@AllArgsConstructor
public class DeviceRevenueDTO {
    private DeviceType deviceType;
    private  double revenue;
}
