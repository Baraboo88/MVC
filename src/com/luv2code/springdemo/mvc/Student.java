package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String [] operationSystems;

    public String[] getOperationSystems() {
        return operationSystems;
    }

    public void setOperationSystems(String[] operationSystems) {
        this.operationSystems = operationSystems;
    }

    private LinkedHashMap<String, String> countryOptions;

    public Student(){
        //populate country options: used ISO county code
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
    }

    public String getCountry() {
        return country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }
}
