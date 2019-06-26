package com.telecom.service;

import com.telecom.model.dao.PhoneNumber;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PhoneNumberService {

    PhoneNumber addPhoneNumber(Long customerId, String phoneNumber, boolean activate) throws Exception;

    PhoneNumber activatePhoneNumber(String PhoneNumber) throws Exception;

    List<PhoneNumber> getAllPhoneNumber();

    List<PhoneNumber> getPhoneNumberByCustomerId(Long customerId);


    void addDummyData() throws Exception;
}
