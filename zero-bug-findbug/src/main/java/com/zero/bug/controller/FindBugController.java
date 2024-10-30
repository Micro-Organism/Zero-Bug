package com.zero.bug.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/bug")
public class FindBugController {

    @RequestMapping("/error")
    public Map<String, Object> mockError(){
        throw new RuntimeException("MockError");
    }

}