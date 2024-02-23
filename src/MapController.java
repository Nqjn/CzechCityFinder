
import java.util.List;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PC
 */
public class MapController {
    int spinner;


    Random rand = new Random();
    MapModel model = new MapModel();
    

    public void chooseCity() {
 //       model.setrChosen(rand.nextInt(model.getCities().size()));

        model.setrChosen(rand.nextInt(spinner + 1));

    }

    public void setSpinner(int spinner) {
        this.spinner = spinner;
    }
    
    

    public void setAnsw(int Answ) {
        model.setAnsw(Answ);

    }

    public List getCity() {
        return model.getCities();

    }

    public int getrChosen() {
        return model.getrChosen();
    }
    
        public int getAnsw() {
        return model.getAnsw();
    }

    
        public boolean isCorrect(int AnsIn) {
            if (model.getCities().get(AnsIn) == model.getCities().get(model.getrChosen())) {
                return true;
                
            }
            else{
                return false;
            }

    }


}
