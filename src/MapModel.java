
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
            "Jaroměř", "Dvůr Králové n. Labem", "Rychnov n. Kněžnou", 
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
