package daca.myevent.myevent.models.product;

import javax.persistence.Entity;

@Entity
public class Entertainment extends Product {

	private EntertainmentEnum subType;
	
	public Entertainment(String title, String description, float price, EntertainmentEnum subType) {
		super(title, description, price);
		this.subType = subType;
	}

	public EntertainmentEnum getSubType() {
		return subType;
	}

	public void setSubType(EntertainmentEnum subType) {
		this.subType = subType;
	}

	
}
