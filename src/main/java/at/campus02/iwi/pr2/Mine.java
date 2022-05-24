package at.campus02.iwi.pr2;

public class Mine extends Facility {
    private double miningDepth;
    private Rawmaterial rawmaterial;

    public Mine(double area, double heightAboveSealevel, double miningDepth, Rawmaterial rawmaterial) {
        super(area, heightAboveSealevel);
        this.miningDepth = miningDepth;
        this.rawmaterial = rawmaterial;
    }

    public double getMiningDepth() {
        return miningDepth;
    }

    public Rawmaterial getRawmaterial() {
        return rawmaterial;
    }

    @Override
    public int getNrPalms() {
        if(miningDepth>=100){
            return 3;
        }
        else if(rawmaterial==Rawmaterial.TERBIUM){
            return 2;
        }else return 1;
    }

    @Override
    public String toString() {
        return "Mine:" + miningDepth +", "+ heightAboveSealevel;
    }

    @Override
    public double calculateProfit() {
       if(rawmaterial==Rawmaterial.LITHIUM || rawmaterial==Rawmaterial.NEODYMIUM){
           return 200*area;
       }else return 300*area;

    }
}