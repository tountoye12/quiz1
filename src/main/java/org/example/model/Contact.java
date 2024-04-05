package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Contact {

    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumberList;
    private List<EmailAddress> emailAddressList;

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumberList = new ArrayList<>();
        this.emailAddressList = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<PhoneNumber> getPhoneNumberList() {
        return phoneNumberList;
    }

    public void setPhoneNumberList(PhoneNumber phoneNumberList) {
        this.phoneNumberList.add(phoneNumberList);
    }

    public List<EmailAddress> getEmailAddressList() {
        return emailAddressList;
    }

    public void setEmailAddressList(EmailAddress emailAddressList) {
        this.emailAddressList.add(emailAddressList);
    }
}
