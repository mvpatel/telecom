package com.telecom.model.dao;

import lombok.Data;

import java.util.Set;

@Data
public class Customer {
    private Long id;
    private String name;
    private String surname;
    Set<PhoneNumber> phoneNumbers;

}
