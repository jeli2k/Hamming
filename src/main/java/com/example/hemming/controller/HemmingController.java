package com.example.hemming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HemmingController {

    String msg = "Keine Nummer übergeben";

    @RequestMapping(path = "api/message")
    public String getMessage() {
        return msg;
    }

    @RequestMapping ("api/hemming")
    public int calculateHammingWeight(@RequestParam("number") String number) {
        msg = number;
        int hammingWeight = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '0') {
                hammingWeight++;
            }
        }
        return hammingWeight;
    }

}

