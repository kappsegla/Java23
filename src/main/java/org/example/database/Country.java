package org.example.database;

public class Country {
    int id;
    String country_name;
    String language_code;

    public Country(int id, String country_name, String language_code) {
        this.id = id;
        this.country_name = country_name;
        this.language_code = language_code;
    }

    @Override
    public String toString() {
        return "Country{" +
               "id=" + id +
               ", country_name='" + country_name + '\'' +
               ", language_code='" + language_code + '\'' +
               '}';
    }
}
