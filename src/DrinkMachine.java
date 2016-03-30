
public class DrinkMachine {
	private Drink softDrink;
	private Drink water;
	private Drink tea;
	private Drink lemonade;
	
	public DrinkMachine() {
		softDrink = new SoftDrink();
		water = new Water();
		tea = new Tea();
		lemonade = new Lemonade();

	}
	
	public void pourSoftDrink() {
		softDrink.order();
	}
	
	public void pourWater() {
		water.order();
	}
	
	public void pourTea() {
		tea.order();
	}
	
	public void pourLemonade() {
		lemonade.order();
	}

}
