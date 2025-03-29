package com.vikas.SevaSangam.controller;


import com.vikas.SevaSangam.model.Donation;
import com.vikas.SevaSangam.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/donation")
public class DonationController {

    @Autowired
    DonationService donationService;

    @PostMapping("/add")
    public ResponseEntity<String> createDonation(Donation donation) {
        return donationService.createDonation(donation);
    }

}
