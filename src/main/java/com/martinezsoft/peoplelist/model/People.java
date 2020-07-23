package com.martinezsoft.peoplelist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class People {

    @JsonProperty("peopleDni")
    private String dni = null;

    @JsonProperty("peopleName")
    private String name = null;

    @JsonProperty("peopleDate")
    private String date = null;

    @JsonProperty("peopleAdress")
    private String adress = null;

    @JsonProperty("peopleEmail")
    private String email = null;

    @JsonProperty("peoplePhone")
    private String phone = null;

    public People(String dni, String name, String date, String adress, String email, String phone) {
        this.dni = dni;
        this.name = name;
        this.date = date;
        this.adress = adress;
        this.email = email;
        this.phone = phone;
    }

    public People(){

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People that = (People) o;
        return dni.equals(that.dni) &&
                name.equals(that.name) &&
                date.equals(that.date) &&
                adress.equals(that.adress) &&
                email.equals(that.email) &&
                phone.equals(that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, name, date, adress, email, phone);
    }

    @Override
    public String toString() {
        return "PeopleModel{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
