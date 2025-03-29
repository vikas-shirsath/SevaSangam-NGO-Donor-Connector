package com.vikas.SevaSangam.service;

import com.vikas.SevaSangam.model.Donation;
import com.vikas.SevaSangam.repo.DonationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DonationService {

    @Autowired
    DonationRepo donationRepo;

    public ResponseEntity<String> createDonation(Donation donation) {
        try {
            donationRepo.save(donation);
            return new ResponseEntity<>("Donation is Raised Successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Donation didn't raised", HttpStatus.BAD_REQUEST);
        }
    }
}
