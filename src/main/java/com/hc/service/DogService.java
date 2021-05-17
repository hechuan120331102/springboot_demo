package com.hc.service;

import com.hc.pojo.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogService {

    @Autowired
    private Dog dog;

    public String printDogMessage(){
        return dog.toString();
    }
}
