package com.example.demo;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Test {

    private List<String> tests;

    public Test() {
        this.tests = List.of("un", "deux");
    }
}
