package com.company;

public class Main {

    public static void main(String[] args) {

        SolarSystem andromeda = new SolarSystem();
       andromeda.sun=1;
        andromeda.planet = 2;
        andromeda.moon =4;

        featureSun mikesun = new featureSun();
        mikesun.color = "red";
        mikesun.heat = "555555555555 K";
        mikesun.temp = "22222222222 C";
        mikesun.radius = "23423593847 km";

        planet1 astronut = new planet1();
        astronut.color= "grey";
        astronut.size = "234345435";
        astronut.relation = "crazy";
        

    }
}
