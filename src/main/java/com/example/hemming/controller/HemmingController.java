package com.example.hemming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HemmingController {

    String msg = "Keine Nummer übergeben";

    @RequestMapping(path = "api/message")
    public String getMessage() {
        return msg;
    }
    
}
