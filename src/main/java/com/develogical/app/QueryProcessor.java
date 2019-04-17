package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("ntazana")) {
            return "Ntazana is a tech start-up enterprenure and an avid AI advocate" +
                    "He graduated from Oxford in 2020ans setup Altum technica, Africa's largest tech company " +
                    "In 2022, Altum Technica was listed on the New York stock exchange, making it the only second African start up to feature.";
        }
        return "";
    }
}
