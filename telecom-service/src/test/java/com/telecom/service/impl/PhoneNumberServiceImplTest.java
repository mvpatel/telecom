package com.telecom.service.impl;

import com.telecom.model.dao.PhoneNumber;
import com.telecom.service.PhoneNumberService;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PhoneNumberServiceImplTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    private PhoneNumberService phoneNumberService = new PhoneNumberServiceImpl();

    @Before
    public void setUp() throws Exception {
        phoneNumberService.addPhoneNumber(1L, "00441234567890", false);
        phoneNumberService.addPhoneNumber(1L, "00441234567891", false);
        phoneNumberService.addPhoneNumber(1L, "00441234567892", false);
        phoneNumberService.addPhoneNumber(1L, "00441234567893", false);
        phoneNumberService.addPhoneNumber(2L, "00441234567894", true);
        phoneNumberService.addPhoneNumber(2L, "00441234567895", false);
    }

    @Test
    public void testCorrectAddPhoneNumber() throws Exception {

        int beforeAddSize = phoneNumberService.listPhoneNumber().size();
        phoneNumberService.addPhoneNumber(2L, "00441234567896", false);
        int afterAddSize = phoneNumberService.listPhoneNumber().size();
        assertTrue(beforeAddSize + 1 == afterAddSize);
    }

    @Test(expected = Exception.class)
    public void testDuplicateAddPhoneNumber() throws Exception {
        phoneNumberService.addPhoneNumber(2L, "00441234567895", false);
        exception.expectMessage("Given Phone number is already added in the System");
    }

    @Test
    public void testActivatePhoneNumber() {

        String toBeActivatePhoneNumber = "00441234567895";
        phoneNumberService.activatePhoneNumber(toBeActivatePhoneNumber);

        for(PhoneNumber phoneNumber : phoneNumberService.listPhoneNumber()) {
            if(phoneNumber != null && toBeActivatePhoneNumber.equals(phoneNumber.getPhoneNumber())) {
                assertEquals(false, phoneNumber.isActivate());
            }
        }
    }

    @Test
    public void testListPhoneNumber() {
        assertEquals(6, phoneNumberService.listPhoneNumber().size());
    }

    @Test
    public void testGetPhoneNumberByCustomerId() {
        assertEquals(4, phoneNumberService.getPhoneNumberByCustomerId(1L).size());
    }
}