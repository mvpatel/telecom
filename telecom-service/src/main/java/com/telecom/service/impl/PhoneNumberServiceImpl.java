package com.telecom.service.impl;

import com.telecom.model.dao.PhoneNumber;
import com.telecom.service.PhoneNumberService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService {

    Set<PhoneNumber> phoneNumberSet = new HashSet<PhoneNumber>();

    @Override
    public PhoneNumber addPhoneNumber(Long customerId, String phoneNumber, boolean activate) {

        PhoneNumber phoneNumberObj = new PhoneNumber();
        phoneNumberObj.setCustomerId(customerId);
        phoneNumberObj.setPhoneNumber(phoneNumber);
        phoneNumberObj.setActivate(activate);
        phoneNumberSet.add(phoneNumberObj);
        return phoneNumberObj;
    }

    @Override
    public PhoneNumber activatePhoneNumber(String PhoneNumber) {
        return null;
    }

    @Override
    public Set<PhoneNumber> listPhoneNumber() {

        return this.phoneNumberSet;
    }

    @Override
    public Set<PhoneNumber> getPhoneNumberByCustomerId(Long customerId) {
        return null;
    }
}
