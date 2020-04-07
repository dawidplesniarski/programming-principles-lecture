package com.company.dawidplesniarski.solid.standalone;

public class PersonValidator {
    public boolean isEmailAddressValid(String emailAddress){
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return emailAddress.matches(regex);
    }

    public boolean isPersonAdult(int age){
        return age >= 18;
    }

}
