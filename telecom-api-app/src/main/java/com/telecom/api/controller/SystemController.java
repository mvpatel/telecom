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


////        phoneNumberService.getAllPhoneNumber();
//        phoneNumberService.getPhoneNumberByCustomerId(3L);
////        phoneNumberService.activatePhoneNumber("00441234567899");

        System.out.println("Testing is ended  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

    }
}
