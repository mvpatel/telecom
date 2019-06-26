package com.telecom.service.impl;

import com.telecom.model.dao.PhoneNumber;
import com.telecom.model.exception.PhoneNumberActivatedException;
import com.telecom.model.exception.PhoneNumberDuplicateException;
import com.telecom.model.exception.PhoneNumberNotExistException;
import com.telecom.service.PhoneNumberService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService{

    List<PhoneNumber> phoneNumberList = new ArrayList<PhoneNumber>();


    @Override
    public PhoneNumber addPhoneNumber(Long customerId, String phoneNumber, boolean activate) {

        if(!isPhoneNumberInList(phoneNumber)) {
            PhoneNumber phoneNumberObj = new PhoneNumber();
            phoneNumberObj.setCustomerId(customerId);
            phoneNumberObj.setPhoneNumber(phoneNumber);
            phoneNumberObj.setActivate(activate);
            phoneNumberList.add(phoneNumberObj);
            return phoneNumberObj;
        }
        else {
            throw new PhoneNumberDuplicateException("Given Phone number is already added in the System");
        }
    }

    private boolean isPhoneNumberInList(String phoneNumberToCheck) {
        boolean result = false;
        for(PhoneNumber phoneNumber : phoneNumberList) {
            if(phoneNumberToCheck.equals(phoneNumber.getPhoneNumber())) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public PhoneNumber activatePhoneNumber(String phoneNumberToActivate) {

        for(PhoneNumber phoneNumber : phoneNumberList) {
            if(phoneNumberToActivate.equals(phoneNumber.getPhoneNumber())) {
                if(phoneNumber.isActivate()) {
                    throw new PhoneNumberActivatedException("Given Phone number is already activated");
                }
                else {
                    phoneNumber.setActivate(true);
                    phoneNumberList.set(phoneNumberList.indexOf(phoneNumber), phoneNumber);
                    return phoneNumber;
                }
            }
        }
        throw new PhoneNumberNotExistException("Given Phone number is not exist");
    }

    @Override
    public List<PhoneNumber> getAllPhoneNumber() {

        return this.phoneNumberList;
    }

    @Override
    public List<PhoneNumber> getPhoneNumberByCustomerId(Long customerId) {
            return phoneNumberList.stream()
                    .filter(phoneNumber -> phoneNumber.getCustomerId().equals(customerId))
                    .collect(Collectors.toList());
    }

    @Override
    public void addDummyData() {

        addPhoneNumber(1L, "00441234567890", false);
        addPhoneNumber(1L, "00441234567891", false);
        addPhoneNumber(1L, "00441234567892", false);
        addPhoneNumber(2L, "00441234567893", false);
        addPhoneNumber(2L, "00441234567894", false);
        addPhoneNumber(2L, "00441234567895", false);
        addPhoneNumber(3L, "00441234567896", false);
        addPhoneNumber(3L, "00441234567897", false);
        addPhoneNumber(3L, "00441234567898", false);
        addPhoneNumber(4L, "00441234567899", false);
        addPhoneNumber(4L, "00441234567810", false);
        addPhoneNumber(5L, "00441234567811", false);
    }
}
