package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.example.model.Contact;
import org.example.model.EmailAddress;
import org.example.model.PhoneNumber;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        PhoneNumber davidPhoneNumber1 = new PhoneNumber("240-133-0011", "Home");
        PhoneNumber davidPhoneNumber2 = new PhoneNumber("240-133-0011", "Mobile");

        EmailAddress davidEmailAddress1 = new EmailAddress("david@gmail.com", "Home");
        EmailAddress davidEmailAddress2 = new EmailAddress("david@gmail.com", "Work");


        PhoneNumber carlosPhoneNumber2 = new PhoneNumber("412-116-9688", "Mobile");

        EmailAddress aliEmailAddress = new EmailAddress("david@gmail.com", "Work");

        Contact david = new Contact("David", "Sangar", "Argo LLC", "Sales");

        david.setEmailAddressList(davidEmailAddress1);
        david.setEmailAddressList(davidEmailAddress2);
        david.setPhoneNumberList(davidPhoneNumber1);
        david.setPhoneNumberList(davidPhoneNumber2);

        Contact carlos = new Contact("Carlos", "Jimenez", "", "");
        carlos.setPhoneNumberList(carlosPhoneNumber2);

        Contact ali = new Contact("Ali", "Gafar", "DBMI Services", "HR Manager");
        ali.setEmailAddressList(aliEmailAddress);

        List<Contact> contactList = List.of(david, ali, carlos);

         List<Contact> sortedContacts =  sortContacts(contactList);

         printJson(sortedContacts);

    }

    private static void printJson(List<Contact> sortedContacts) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        JsonElement jsonElement = gson.toJsonTree(sortedContacts);
        String json = gson.toJson(jsonElement);
        System.out.println(json);
    }

    private static List<Contact> sortContacts(List<Contact> contactList) {
        return contactList.stream()
                .sorted(Comparator.comparing(Contact::getFirstName))
                .toList();
    }


}