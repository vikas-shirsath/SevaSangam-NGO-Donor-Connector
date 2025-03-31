package com.vikas.SevaSangam.controller;

import com.vikas.SevaSangam.model.NGO;
import com.vikas.SevaSangam.model.NGOUnauthorised;
import com.vikas.SevaSangam.service.UnauthorisedNGOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/ngo")
public class UnauthorisedNGOController {

    @Autowired
    UnauthorisedNGOService unauthorisedNGOService;

    @PostMapping("/add")
    public ResponseEntity<String> addNGO(NGOUnauthorised ngoUnauthorised) {
        return unauthorisedNGOService.addNGO(ngoUnauthorised);
    }

}
