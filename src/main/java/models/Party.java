package models;

import java.util.ArrayList;
import models.Enums.*;

public interface Party {
    ArrayList<Value> getValues();
    ArrayList<Value> getAntiValues();
    
    default Support isSupporting(ArrayList<Value> supporting, ArrayList<Value> against){
        int support = 0;
        int oppose = 0;
        for(Value val : supporting){
            if(getValues().contains(val) || get){
                support++;
            }
        }
        for(Value val : against){
            if(getValues().contains(val)){
                oppose++;
            }
        }
        if(support>oppose){
            return Support.FOR;
        }else if(oppose>support){
            return Support.AGAINST;
        }else{
            return Support.NEUTRAL;
        }
    }
}
