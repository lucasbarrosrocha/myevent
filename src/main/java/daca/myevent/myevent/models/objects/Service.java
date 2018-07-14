package daca.myevent.myevent.models.objects;

public class Service extends Product {

	private ServiceEnum subType;
	
	public Service(String description, float price, ServiceEnum subType) {
		super(description, price);
		this.subType = subType;
	}

}
