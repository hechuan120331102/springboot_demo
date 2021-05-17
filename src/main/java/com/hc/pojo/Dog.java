package com.hc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@PropertySource(value = "application.properties")
public class Dog {

    @Value("${dog.name}")
    private String name;
    @Value("${dog.age}")
    private int age;
}
