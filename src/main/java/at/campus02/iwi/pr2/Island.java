package at.campus02.iwi.pr2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Island {
    public ArrayList<Facility> facilities;
    public double facilityArea;

    public Island() {
        facilities=new ArrayList<>();
        facilityArea = 0;
    }

    public void add(Facility f){
        facilities.add(f);
        facilityArea=f.area+facilityArea;
    }

    public Facility findHighestProfit(){
        int index= 0;
        for(int i=1; i<facilities.size(); i++){
            if(facilities.get(i).calculateProfit()>facilities.get(index).calculateProfit()){
                index=i;
            }
        }return facilities.get(index);
    }

    public HashMap<String, Integer> groupFacilities() {
//        HashMap<String, Integer> erg = new HashMap<String, Integer>();
//        int vklein = 0;
//        int vmittel = 0;
//        int vgross = 0;
//        for(Facility g : facilities)
//        {
//            double profit = g.calculateProfit();
//            if(profit < 1000)
//            {
//                erg.put("Low",  ++vklein);
//            }
//            else
//            {
//                if(profit < 10000)
//                {
//                    erg.put("Average", ++vmittel);
//                }
//                else
//                {
//                    erg.put("High", ++vgross);
//                }
//            }
//        }
//        return erg;
//    }
        HashMap<String, Integer> ergMap = new HashMap<>();
        for (Facility f : facilities) {
            if (f.calculateProfit() < 1000) {
                if (!ergMap.containsKey("Low")) {
                    ergMap.put("Low", 1);
                } else ergMap.put("Low", 1 + ergMap.get("Low"));
            } else {
                if (f.calculateProfit() < 10000) {
                    if (!ergMap.containsKey("Average")) {
                        ergMap.put("Average", 1);
                    } else ergMap.put("Average", 1 + ergMap.get("Average"));
                } else {
                    if (!ergMap.containsKey("High")) {
                        ergMap.put("High", 1);
                    } else ergMap.put("High", 1 + ergMap.get("High"));
                }
            }

        }
        return ergMap;
    }


    public ArrayList<Facility> risingWaterSimulation(double waterLevel){
        ArrayList<Facility> ergList = new ArrayList<>();
        for(Facility f: facilities){
            if(f.heightAboveSealevel <= waterLevel){
                ergList.add(f);
            }
        }
        return ergList;
    }

    public void sortedPrint(){
        Collections.sort(facilities, new IslandComparator());
        for(Facility f:facilities){
            System.out.println("Sea level: "+ f.heightAboveSealevel + ", Area: "+f.area);
        }

    }
}