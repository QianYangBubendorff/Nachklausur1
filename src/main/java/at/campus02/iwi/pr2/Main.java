package at.campus02.iwi.pr2;

public class Main {

	public static void main(String[] args) {

		Island island = new Island();
		Mine mine1 = new Mine(200.3, 200.0, 38.3, RawMaterial.LITHIUM);
		Mine mine2 = new Mine(250.3, 300.0, 32.3, RawMaterial.NEODYMIUM);
		Mine mine3 = new Mine(308.3, 400.0, 58.3, RawMaterial.TERBIUM);
		Plantation p1 = new Plantation(2203.2, 125.23, Fruit.MANGO);
		Plantation p2 = new Plantation(1255.2, 300.23, Fruit.BANANA);
		Plantation p3 = new Plantation(5555.2, 400.23, Fruit.COCONUT);
		Hotel h1 = new Hotel(256.5, 258.3, 3, 586, 235);
		Hotel h2 = new Hotel(356.5, 558.3, 1, 586, 235);
		Hotel h3 = new Hotel(456.5, 458.3, 4, 586, 235);

		island.add(mine1);
		island.add(mine2);
		island.add(mine3);
		island.add(p1);
		island.add(p2);
		island.add(p3);
		island.add(h1);
		island.add(h2);
		island.add(h3);

		System.out.println(island.findHighestProfit());
		System.out.println(island.groupFacilities());
		System.out.println(island.risingWaterSimulation(350.1));
		island.sortedPrint();




	}
}
