package daca.myevent.myevent.models.product;

import javax.persistence.Entity;

@Entity
public class Food extends Product {
	
	private FoodEnum subType;

	public Food(String title, String description, float price, FoodEnum subType) {
		super(title, description, price);
		this.subType = subType;
	}

	public FoodEnum getSubType() {
		return subType;
	}

	public void setSubType(FoodEnum subType) {
		this.subType = subType;
	}

}
