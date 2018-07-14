package daca.myevent.myevent.models.objects;

public class Structure extends Product {

	private StructureEnum subType;
	
	public Structure(String description, float price, StructureEnum subType) {
		super(description, price);
		this.subType = subType;
	}

}
