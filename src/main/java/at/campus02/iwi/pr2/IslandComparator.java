package at.campus02.iwi.pr2;

import java.util.Comparator;

public class IslandComparator implements Comparator<Facility> {

    @Override
    public int compare(Facility o1, Facility o2) {
        int result= Double.compare(o1.heightAboveSealevel, o2.heightAboveSealevel);
        if(result==0) {
            return Double.compare(o1.area, o2.area);
        }
        else return result;
    }
}