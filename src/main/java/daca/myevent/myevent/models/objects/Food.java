package daca.myevent.myevent.models.objects;

import javax.persistence.Entity;

@Entity
public class Food extends Product {
	
	private FoodEnum subType;

	public Food(String description, float price, FoodEnum subType) {
		super(description, price);
		this.subType = subType;
	}

	public FoodEnum getSubType() {
		return subType;
	}

	public void setSubType(FoodEnum subType) {
		this.subType = subType;
	}

}
