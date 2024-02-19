
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

    private String Answ;
    private List Cities = new LinkedList<String>();

    public void setAnsw(String Answ) {
        this.Answ = Answ;
    }

    public void addCities(List Cities) {
        this.Cities.add(Cities);
    }

    /* In MapController will be randomly 
    picked one city from LinkedList Cities , after the player send his answer
    this function will compere index of clicked city and index of acctual city
     */
    public boolean isCorrect(int AnsIn) {
        return true;

    }

}
