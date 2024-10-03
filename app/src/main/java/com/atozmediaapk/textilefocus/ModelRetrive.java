package com.atozmediaapk.textilefocus;

public class ModelRetrive {

    String email,surname,image;

    public ModelRetrive(String email, String surname, String image) {
        this.email = email;
        this.surname = surname;
        this.image = image;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



}