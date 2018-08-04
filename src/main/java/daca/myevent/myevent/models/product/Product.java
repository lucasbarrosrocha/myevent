package daca.myevent.myevent.models.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	private String title;
	private String description;
	private float price;
	
	public Product(String title, String description, float price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Product() {
		this.title = "";
		this.description = "";
		this.price = 0;
	}

	public long getId() {
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
