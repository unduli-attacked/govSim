package models;

import java.util.ArrayList;
import java.util.HashMap;

public interface Citizen {
    public HashMap<Citizen, Integer> getOpinions();
    default int getOpinion(Citizen subject){
        return getOpinions().get(subject);
    }
    ArrayList<Enums.Value> getValues();
    
    Party getParty();
    void addParty();
    
    
}
