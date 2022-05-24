package at.campus02.iwi.pr2;

public class Mine extends Facility {
    private double miningDepth;
    private RawMaterial rawMaterial;

    public Mine(double area, double heightAboveSealevel, double miningDepth, RawMaterial rawmaterial) {
        super(area, heightAboveSealevel);
        this.miningDepth = miningDepth;
        this.rawMaterial = rawmaterial;
    }

    public double getMiningDepth() {
        return miningDepth;
    }

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    @Override
    public int getNrPalms() {
        if(miningDepth>=100){
            return 3;
        }
        else if(rawMaterial== RawMaterial.TERBIUM){
            return 2;
        }else return 1;
    }

    @Override
    public String toString() {
        return "Mine:" + miningDepth +", "+ heightAboveSealevel;
    }

    @Override
    public double calculateProfit() {
       if(rawMaterial== RawMaterial.LITHIUM || rawMaterial== RawMaterial.NEODYMIUM){
           return 200*area;
       }else return 300*area;

    }
}