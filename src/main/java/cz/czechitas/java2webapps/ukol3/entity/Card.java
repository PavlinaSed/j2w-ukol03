package cz.czechitas.java2webapps.ukol3.entity;

public class Card {
    private String name;
    private String company;
    private String street;
    private String municipality;
    private String zipCode;
    private String completeAddress;
    private String email;
    private String phone;
    private String web;

    public Card(String name, String company, String street, String municipality, String zipCode, String email, String phone, String web) {
        this.name = name;
        this.company = company;
        this.street = street;
        this.municipality = municipality;
        this.zipCode = zipCode;
        this.email = email;
        this.phone = phone;
        this.web = web;
    }

    public Card() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCompleteAddress() {
        return street + ", " + municipality + zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
