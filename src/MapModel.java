
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PC
 */
public class MapModel {

    private int Answ;
  
    private int rChosen;
    
          String[] mestaArray = {
            "Karlovy Vary", "Ostrov n. Ohří", "Chodov", "Sokolov", "Cheb", "Aš", "Mariánské Lázně", "Františkovy Lázně",
            "Ústí n. Labem", "Žatec", "Louny", "Chomutov", "Most", "Litvínov", "Bílina", "Teplice", "Děčín", "Litoměřice",
            "Lovosice", "Roudnice n. Labem", "Liberec", "Nový Bor", "Česká Lípa", "Doksy", "Jablonec n. Nisou", "Turnov",
            "Semily", "Jilemnice", "Hradec Králové", "Jičín", "Vrchlabí", "Trutnov", "Náchod", "Nové Město n. Metují",
            "Jaroměř", "Dvůr Králové n. Labem", "Rychnov n. Kněžnou","Pardubice", "Chrudim", "Hlinsko", "Vysoké Mýto",
            "Ústí n. Orlicí", "Litomyšl", "Česká Třebová", "Lanškroun", "Svitavy", "Moravská Třebová",
            "Jihlava", "Třebíč", "Velké Meziříčí", "Žďár n. Sázavou", "Nové Město na Moravě", "Bystřice n. Pernštejnem",
            "Havlíčkův Brod", "Humpolec", "Pelhřimov", "Chotěboř", "České Budějovice", "Jindřichův Hradec", "Český Krumlov",
            "Prachatice", "Strakonice", "Písek", "Tábor", "Třeboň", "Týn n. Vltavou", "Bechyně", "Plzeň", "Sušice",
            "Klatovy", "Domažlice", "Rokycany", "Tachov", "Kladno", "Rakovník", "Příbram", "Kralupy n. Vltavou",
            "Mělník", "Neratovice", "Brandýs n. Labem", "Nymburk", "Poděbrady", "Kolín", "Kutná Hora", "Čáslav",
            "Mladá Boleslav", "Benešov", "Vlašim", "Beroun", "Olomouc", "Jeseník", "Šumperk", "Zábřeh", "Mohelnice",
            "Litovel", "Šternberk", "Prostějov", "Přerov", "Hranice", "Mohelnice", "Ostrava", "Karviná",
            "Opava", "Bohumín", "Havířov", "Český Těšín", "Třinec", "Bruntál", "Krnov", "Frýdek-Místek", "Studénka",
            "Nový Jičín", "Kopřivnice", "Frenštát p.R.", "Zlín", "Rožnov p.R.", "Valašské Meziříčí", "Vsetín", "Holešov",
            "Kroměříž", "Otrokovice", "Luhačovice", "Uherské Hradiště", "Uherský brod",  "Brno", "Boskovice",
            "Blansko", "Tišnov", "Kuřim", "Adamov", "Vyškov", "Slavkov u B.", "Bučovice", "Kyjov", "Veselí n. Moravou",
            "Hodonín", "Břeclav", "Hustopeče", "Mikulov", "Břeclav", "Znojmo", "Moravský Krumlov", "Ivančice", "Rosice"
        };

        // Převod pole na LinkedList
        LinkedList<String> Cities = new LinkedList<>(Arrays.asList(mestaArray));
    

    public void setAnsw(int Answ) {
        this.Answ = Answ;
    }

    public void addCities(String Cities) {
        this.Cities.add(Cities);
    }

    public void setrChosen(int rChosen) {
        this.rChosen = rChosen;
    }

    public List getCities() {
        return Cities;
    }

    public int getrChosen() {
        return rChosen;
    }
    
    

    
    
    
    

    /* In MapController will be randomly 
    picked one city from LinkedList Cities , after the player send his answer
    this function will compere index of clicked city and index of acctual city
     */

    public int getAnsw() {
        return Answ;
    }

}
