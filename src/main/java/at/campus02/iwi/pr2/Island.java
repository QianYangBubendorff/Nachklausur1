package at.campus02.iwi.pr2;

import java.util.ArrayList;

public class Island {
    public ArrayList<Facility> facilities;
    public double facilityArea;

    public Island() {
        facilities=new ArrayList<>();
        facilityArea = 0;
    }

    public void add(Facility f){
        facilities.add(f);
        facilityArea+=1;
    }

    public Facility findHighestProfti(){
        double highestProfit=0;
        for(Facility f: facilities){
            f.calculateProfit()
        }
    }
}