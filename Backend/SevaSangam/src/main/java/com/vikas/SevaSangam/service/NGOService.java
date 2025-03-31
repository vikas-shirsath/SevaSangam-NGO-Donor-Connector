package com.vikas.SevaSangam.service;

import com.vikas.SevaSangam.model.NGO;
import com.vikas.SevaSangam.model.NGOUnauthorised;
import com.vikas.SevaSangam.repo.NGORepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NGOService {

    @Autowired
    NGORepo ngoRepo;

    public ResponseEntity<String> addNGO(NGO ngo) {
        try {
            ngoRepo.save(ngo);
            return new ResponseEntity<>("NGO added successfuly", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>("NGO didn't get added", HttpStatus.BAD_REQUEST);
    }
}
