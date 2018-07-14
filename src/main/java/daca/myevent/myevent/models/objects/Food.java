package daca.myevent.myevent.models.objects;

public class Food extends Product {
	
	private FoodEnum subType;

	public Food(String description, float price, FoodEnum subType) {
		super(description, price);
		this.subType = subType;
	}

}
