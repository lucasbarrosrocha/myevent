package daca.myevent.myevent.models.objects;

import javax.persistence.Entity;

@Entity
public class Structure extends Product {

	private StructureEnum subType;
	
	public Structure(String description, float price, StructureEnum subType) {
		super(description, price);
		this.subType = subType;
	}

	public StructureEnum getSubType() {
		return subType;
	}

	public void setSubType(StructureEnum subType) {
		this.subType = subType;
	}

}
