package models;

public class Enums {
    enum Value{
        CARING_FOR_WEAK("Caring for the weak"), EQUITY("Equity"),
        LIB_BY_GOV("Liberty provided by the government"), EQUALITY("Equality"),
        LIB_FROM_GOV("Liberty from government control"), LOYALTY("Loyalty"), RESPECT("Respect for authority"),
        SANCTITY("Sanctity"), RULE_OF_LAW("Rule of Law"), NATIONALISM("Nationalism"),
        CAPITALISM("Capitalism"), MILITARY("National defense"), LOW_TAXES("Anti Taxation"),
        LOW_SPENDING("Low government spending"), FREE_MARKET("Free market"), PROPERTY("Right to property"),
        JUSTICE("Justice"), FREE_SPEECH("Freedom of speech"), FREE_PRESS("Freedom of the press"),
        HUMAN_RIGHTS("Human rights"), BEAR_ARMS("The right to bear arms"), FAIR_TRIAL("The right to fair trial"),
        CIVIL_RIGHTS("Civil rights");
        
        String basic;
        Value(String str_){
            this.basic = str_;
        }
        
        @Override
        public String toString(){
            return basic;
        }
    }
    
    enum Support{
        FOR(1), AGAINST(0), NEUTRAL(-1);
    
        int basic;
        Support(int bool){
            this.basic = bool;
        }
    
        @Override
        public String toString(){
            return String.valueOf(basic);
        }
    }
}
