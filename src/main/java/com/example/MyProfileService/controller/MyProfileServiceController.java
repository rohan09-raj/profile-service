package com.example.MyProfileService.controller;

import com.example.MyProfileService.model.Profile;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyProfileServiceController {
    @GetMapping("/health")
    public ResponseEntity health() {
        final String status = "status: UP";
        return new ResponseEntity(status, HttpStatus.OK);
    }

    @PostMapping(value = "/verification", consumes = "application/json", produces = "application/json")
    public ResponseEntity verification(@RequestBody String salt) {
        final String chainCode = "123cn1mcad";
//        System.out.println("Salt : " + salt);
        return new ResponseEntity(BCrypt.hashpw(chainCode, salt), HttpStatus.OK);
    }

    @GetMapping("/profile")
    public ResponseEntity profile() {
        Profile profile = new Profile(
                "Rohan Raj",
                "Gupta",
                "rajrohan1914@gmail.com",
                "8707745915",
                0,
                "AndWeMet",
                "SDE Intern",
                "rohan09-raj",
                "rohanrajgupta12",
                "RohanRajGupta6",
                "_.rohan09._",
                "https://lift-simulation-by-rohan.netlify.app/src/index.html"
        );
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(profile, headers, HttpStatus.OK);
    }
}
