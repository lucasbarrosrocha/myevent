package daca.myevent.myevent.models.product;

import javax.persistence.Entity;

@Entity
public class Service extends Product {

	private ServiceEnum subType;
	
	public Service(String title, String description, float price, ServiceEnum subType) {
		super(title, description, price);
		this.subType = subType;
	}

	public ServiceEnum getSubType() {
		return subType;
	}

	public void setSubType(ServiceEnum subType) {
		this.subType = subType;
	}

}
