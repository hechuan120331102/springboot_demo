package com.hc.controller;

import com.hc.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

    @Autowired
    DogService dogService;

    @RequestMapping("/dog")
    public String getDogMessage(){
        return dogService.printDogMessage();
    }
}
