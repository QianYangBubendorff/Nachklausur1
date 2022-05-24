package at.campus02.iwi.pr2;

public abstract class Facility implements PalmRating{
    protected double area;
    protected double heightAboveSealevel;

    public Facility(double area, double heightAboveSealevel) {
        this.area = area;
        this.heightAboveSealevel = heightAboveSealevel;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getHeightAboveSealevel() {
        return heightAboveSealevel;
    }

    public void setHeightAboveSealevel(double heightAboveSealevel) {
        this.heightAboveSealevel = heightAboveSealevel;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "area=" + area +
                ", heightAboveSealevel=" + heightAboveSealevel +
                '}';
    }

    public abstract int getNrPalms();

    public abstract double calculateProfit();
}
