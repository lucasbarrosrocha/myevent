package daca.myevent.myevent.models.objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String description;
	private float price;
	
	public Product(String description, float price) {
		this.description = description;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
