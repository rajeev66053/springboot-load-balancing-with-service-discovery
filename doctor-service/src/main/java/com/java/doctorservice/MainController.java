package com.java.doctorservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${server.port}")
    private String port;

    private int counter;

    @GetMapping("/allDoctors")
    public String doctors() {
        counter ++;
        return counter + " ==> List of doctors new [ response from " + port + "]";
    }
}