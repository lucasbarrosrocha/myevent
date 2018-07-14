package daca.myevent.myevent.models.objects;

import javax.persistence.Entity;

@Entity
public class Entertainment extends Product {

	private EntertainmentEnum subType;
	
	public Entertainment(String description, float price, EntertainmentEnum subType) {
		super(description, price);
		this.subType = subType;
	}

	public EntertainmentEnum getSubType() {
		return subType;
	}

	public void setSubType(EntertainmentEnum subType) {
		this.subType = subType;
	}

	
}
