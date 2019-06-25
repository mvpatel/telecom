package com.telecom.api.controller;

import com.telecom.service.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SystemController {

    @Autowired
    private PhoneNumberService phoneNumberService;

    public void testing() {
        System.out.println("Testing is called  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        phoneNumberService.addPhoneNumber(1L, "00441234567890", false);
        phoneNumberService.addPhoneNumber(1L, "00441234567890", false);
        phoneNumberService.addPhoneNumber(2L, "00441234567890", false);
        phoneNumberService.addPhoneNumber(2L, "00441234567899", false);
//        phoneNumberService.addPhoneNumber(1L, "00441234567890", false);
        phoneNumberService.listPhoneNumber();

        System.out.println("Testing is ended  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

    }
}
