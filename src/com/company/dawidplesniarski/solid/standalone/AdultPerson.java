package com.company.dawidplesniarski.solid.standalone;

public class AdultPerson {
    private String name;
    private String surname;
    private String emailAddress;
    private int age;

    public AdultPerson(String name, String surname, String emailAddress, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.emailAddress = emailAddress;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getAge() {
        return age;
    }
}
