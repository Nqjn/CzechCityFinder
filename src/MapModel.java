
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
    private int rChosen;
    public void setAnsw(String Answ) {
        this.Answ = Answ;
    }
    public void setrChosen(int rChosen) {
        this.rChosen = rChosen;
    }
    

    public void addCities(List Cities) {
        this.Cities.add(Cities);
        
    }

    /* In MapController will be randomly 
    picked one city from LinkedList Cities , after the player send his answer
    this function will compere index of clicked city and index of acctual city
     */
    public boolean isCorrect(String Ans) {
        if(Ans == Cities.get(rChosen)){
            return true;


        }
        return false;

    }

}
