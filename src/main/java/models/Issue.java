package models;

import java.util.ArrayList;
import models.Enums.*;

public class Issue {
    String name;
    Citizen proposer;
    ArrayList<Value> valuesSupporting;
    ArrayList<Value> valuesAgainst;
    
    ArrayList<Party> partiesSupporting;
    ArrayList<Party> partiesAgainst;
    
    ArrayList<Citizen> supporting;
    ArrayList<Citizen> against;
    
    public Issue(String issueName, Citizen proposedBy, ArrayList<Value> valuesSupporting_, ArrayList<Value> valuesAgainst_){
        this.name = issueName;
        this.proposer = proposedBy;
        this.valuesSupporting = valuesSupporting_;
        this.valuesAgainst = valuesAgainst_;
        
        
    }
}
