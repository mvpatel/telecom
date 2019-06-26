package com.telecom.service;

import com.telecom.model.dao.PhoneNumber;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PhoneNumberService {

    /**
     * Add Phone Number
     * @param customerId : Id of the Customer
     * @param phoneNumber : Phone number
     * @param activate : Activate
     * @return: Phone Number
     */
    PhoneNumber addPhoneNumber(Long customerId, String phoneNumber, boolean activate);

    /**
     * Activate Phone number
     * @param PhoneNumber : Phone Number
     * @return : Phone Number
     */
    PhoneNumber activatePhoneNumber(String PhoneNumber);

    /**
     * Get all Phone Number
     * @return : List for Phone Numbers
     */
    List<PhoneNumber> getAllPhoneNumber();

    /**
     * Get Phone Number by Customer Id
     * @param customerId : Customer Id
     * @return : List for Phone Numbers
     */
    List<PhoneNumber> getPhoneNumberByCustomerId(Long customerId);


    /**
     * Dummy data will be added in the List of Phone number
     */
    void addDummyData();
}
