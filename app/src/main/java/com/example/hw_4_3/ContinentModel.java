package com.example.hw_4_3;

import java.io.Serializable;
import java.util.ArrayList;

public class ContinentModel implements Serializable {
    private String continent;
    private String name;
    private ArrayList<String> countries;

    public ContinentModel(String continent, String name) {
        this.continent = continent;
        this.name = name;
        this.countries = new ArrayList<>();
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<String> countries) {
        this.countries = countries;
    }
}
