package com.telecom.api.controller;

import com.telecom.service.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SystemController {

    @Autowired
    private PhoneNumberService phoneNumberService;

    public void testing() throws Exception {
        System.out.println("Testing is called  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        phoneNumberService.addPhoneNumber(1L, "00441234567890", false);
        phoneNumberService.addPhoneNumber(2L, "00441234567891", false);
        phoneNumberService.addPhoneNumber(2L, "00441234567892", false);
        phoneNumberService.addPhoneNumber(1L, "00441234567893", false);
        phoneNumberService.addPhoneNumber(2L, "00441234567894", false);
        phoneNumberService.addPhoneNumber(2L, "00441234567895", false);
        phoneNumberService.addPhoneNumber(1L, "00441234567896", false);
        phoneNumberService.addPhoneNumber(2L, "00441234567897", false);
        phoneNumberService.addPhoneNumber(2L, "00441234567898", false);
        phoneNumberService.addPhoneNumber(2L, "00441234567899", false);
        phoneNumberService.addPhoneNumber(2L, "00441234567810", false);
//        phoneNumberService.addPhoneNumber(1L, "00441234567890", false);
//        phoneNumberService.listPhoneNumber();
        phoneNumberService.getPhoneNumberByCustomerId(3L);
//        phoneNumberService.activatePhoneNumber("00441234567899");

        System.out.println("Testing is ended  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

    }
}
