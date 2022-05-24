package at.campus02.iwi.pr2;

public class Plantation extends Facility{

    protected Fruit fruit;

    public Plantation(double area, double heightAboveSealevel, Fruit fruit) {
        super(area, heightAboveSealevel);
        this.fruit = fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }

    @Override
    public int getNrPalms() {
        if(area<=20){
            return 3;
        }
        else if(fruit==Fruit.MANGO){
            return 2;
        } return 1;
    }

    @Override
    public String toString() {
        return "Plantation:" + fruit ;
    }

    @Override
    public double calculateProfit() {
        double profit = 0;
        if(fruit==Fruit.BANANA){
            profit = 30 * area;
        }
        if(fruit == Fruit.COCONUT){
            profit = 2.5*15*area;
        }
        if(fruit == Fruit.MANGO){
            if(heightAboveSealevel<=150){
                profit = 15*3*area;
            }else profit = 10*3*area;
        }
        return profit;
    }
}