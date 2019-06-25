package com.telecom.service;

import com.telecom.model.dao.PhoneNumber;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface PhoneNumberService {

    PhoneNumber addPhoneNumber(Long customerId, String phoneNumber, boolean activate);

    PhoneNumber activatePhoneNumber(String PhoneNumber);

    Set<PhoneNumber> listPhoneNumber();

    Set<PhoneNumber> getPhoneNumberByCustomerId(Long customerId);


}
