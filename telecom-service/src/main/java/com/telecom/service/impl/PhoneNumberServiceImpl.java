package com.telecom.service.impl;

import com.telecom.model.dao.PhoneNumber;
import com.telecom.service.PhoneNumberService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService {

    List<PhoneNumber> phoneNumberList = new ArrayList<PhoneNumber>();

    @Override
    public PhoneNumber addPhoneNumber(Long customerId, String phoneNumber, boolean activate) {

        PhoneNumber phoneNumberObj = new PhoneNumber();
        phoneNumberObj.setCustomerId(customerId);
        phoneNumberObj.setPhoneNumber(phoneNumber);
        phoneNumberObj.setActivate(activate);
        phoneNumberList.add(phoneNumberObj);
        return phoneNumberObj;
    }

    @Override
    public PhoneNumber activatePhoneNumber(String phoneNumberToctivate) {

        for(PhoneNumber phoneNumber : phoneNumberList) {
            if(phoneNumber!=null && phoneNumberToctivate.equals(phoneNumber.getPhoneNumber())) {
                phoneNumber.setActivate(true);
                break;
            }
            return phoneNumber;
        }
        return null;
    }

    @Override
    public List<PhoneNumber> listPhoneNumber() {

        return this.phoneNumberList;
    }

    @Override
    public List<PhoneNumber> getPhoneNumberByCustomerId(Long customerId) {
        return phoneNumberList.stream()
                .filter(phoneNumber -> phoneNumber.getCustomerId().equals(customerId))
                .collect(Collectors.toList());
    }
}
