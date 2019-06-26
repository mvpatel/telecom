package com.telecom.api.controller;

import com.telecom.model.dao.PhoneNumber;
import com.telecom.service.PhoneNumberService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "Follower API", description = "The API provides REST endpoints" +
        " to Add/List Follower.")
@RestController
@RequestMapping("/api/v1")
public class PhoneNumberController {
    private final PhoneNumberService phoneNumberService;

    @Autowired
    public PhoneNumberController(PhoneNumberService phoneNumberService) throws Exception {
        this.phoneNumberService = phoneNumberService;
        this.phoneNumberService.addDummyData();
    }

    @GetMapping(
            value = "/all-phone-number",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public List<PhoneNumber> getAllPhoneNumber() {
        return this.phoneNumberService.getAllPhoneNumber();
    }



    @GetMapping(
            value = "/phone-number/{customerId}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public List<PhoneNumber> getPhoneNumberByCustomerId(@PathVariable("customerId") final Long customerId) {
        return this.phoneNumberService.getPhoneNumberByCustomerId(customerId);
    }



    @PutMapping(
            value = "/activate-phone-number/{phoneNumber}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public PhoneNumber activatePhoneNumber(@PathVariable("phoneNumber") final String phoneNumber) {
        return this.phoneNumberService.activatePhoneNumber(phoneNumber);
    }


}