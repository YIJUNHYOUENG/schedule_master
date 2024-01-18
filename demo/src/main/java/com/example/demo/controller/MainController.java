package com.example.demo.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class MainController {

    @GetMapping("/hello")
    public List<String> test() {
        return Arrays.asList("서버 포트는 82222", "리액트 포트는 3000");
    }
}
