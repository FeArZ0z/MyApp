package com.example.secondtry.ui.Classes;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;

public class Caliente extends Template {

    private User userOne;
    private User userTwo;
    private String textOne;
    private String textTwo;

    public Caliente(User userOne, User userTwo, String textOne, String textTwo){
        textOne = "";
        textTwo = "";
        userOne = new User();
        userTwo = new User();
    }

    public User getUserOne() {
        return userOne;
    }

    public void setUserOne(User userOne) {
        this.userOne = userOne;
    }

    public User getUserTwo() {
        return userTwo;
    }

    public void setUserTwo(User userTwo) {
        this.userTwo = userTwo;
    }

    public String getTextOne() {
        return textOne;
    }

    public void setTextOne(String textOne) {
        this.textOne = textOne;
    }

    public String getTextTwo() {
        return textTwo;
    }

    public void setTextTwo(String textTwo) {
        this.textTwo = textTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caliente caliente = (Caliente) o;
        return userOne.equals(caliente.userOne) &&
                userTwo.equals(caliente.userTwo) &&
                textOne.equals(caliente.textOne) &&
                textTwo.equals(caliente.textTwo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userOne, userTwo, textOne, textTwo);
    }


}

