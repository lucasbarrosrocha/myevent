package daca.myevent.myevent.models.objects;

public class Entertainment extends Product {

	private EntertainmentEnum subType;
	
	public Entertainment(String description, float price, EntertainmentEnum subType) {
		super(description, price);
		this.subType = subType;
	}

}
