package com.example.date_range;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PriceDataModel {
    private String date;
    private String state;
    private Double rice;
    private Double wheat;
    private Double atta;
    private Double gramDal;
    private Double turArharDal;
    private Double uradDal;
    private Double moongDal;
    private Double masoorDal;
    private Double sugar;
    private Double milk;
    private Double groundnutOil;
    private Double mustardOil;
    private Double vanaspati;
    private Double soyaOil;
    private Double sunflowerOil;
    private Double palmOil;
    private Double gur;
    private Double teaLoose;
    private Double saltPack;
    private Double potato;
    private Double onion;
    private Double tomato;

    // Constructor to initialize all fields
    public PriceDataModel(String date, String state, Double rice, Double wheat, Double atta, Double gramDal, Double turArharDal, Double uradDal,
                          Double moongDal, Double masoorDal, Double sugar, Double milk, Double groundnutOil, Double mustardOil, Double vanaspati,
                          Double soyaOil, Double sunflowerOil, Double palmOil, Double gur, Double teaLoose, Double saltPack, Double potato,
                          Double onion, Double tomato) {
        this.date = date;
        this.state = state;
        this.rice = rice;
        this.wheat = wheat;
        this.atta = atta;
        this.gramDal = gramDal;
        this.turArharDal = turArharDal;
        this.uradDal = uradDal;
        this.moongDal = moongDal;
        this.masoorDal = masoorDal;
        this.sugar = sugar;
        this.milk = milk;
        this.groundnutOil = groundnutOil;
        this.mustardOil = mustardOil;
        this.vanaspati = vanaspati;
        this.soyaOil = soyaOil;
        this.sunflowerOil = sunflowerOil;
        this.palmOil = palmOil;
        this.gur = gur;
        this.teaLoose = teaLoose;
        this.saltPack = saltPack;
        this.potato = potato;
        this.onion = onion;
        this.tomato = tomato;
    }

    // Getters for all attributes
    public String getDate() {
        return date;
    }

    public String getState() {
        return state;
    }

    public Double getRice() {
        return rice;
    }

    public Double getWheat() {
        return wheat;
    }

    public Double getAtta() {
        return atta;
    }

    public Double getGramDal() {
        return gramDal;
    }

    public Double getTurArharDal() {
        return turArharDal;
    }

    public Double getUradDal() {
        return uradDal;
    }

    public Double getMoongDal() {
        return moongDal;
    }

    public Double getMasoorDal() {
        return masoorDal;
    }

    public Double getSugar() {
        return sugar;
    }

    public Double getMilk() {
        return milk;
    }

    public Double getGroundnutOil() {
        return groundnutOil;
    }

    public Double getMustardOil() {
        return mustardOil;
    }

    public Double getVanaspati() {
        return vanaspati;
    }

    public Double getSoyaOil() {
        return soyaOil;
    }

    public Double getSunflowerOil() {
        return sunflowerOil;
    }

    public Double getPalmOil() {
        return palmOil;
    }

    public Double getGur() {
        return gur;
    }

    public Double getTeaLoose() {
        return teaLoose;
    }

    public Double getSaltPack() {
        return saltPack;
    }

    public Double getPotato() {
        return potato;
    }

    public Double getOnion() {
        return onion;
    }

    public Double getTomato() {
        return tomato;
    }

    // Method to check if a data entry falls within the selected date range
    public boolean isInRange(String startDate, String endDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);
        LocalDate dataDate = LocalDate.parse(this.date, formatter);

        return (dataDate.isEqual(start) || dataDate.isAfter(start)) && (dataDate.isEqual(end) || dataDate.isBefore(end));
    }
}
