package daca.myevent.myevent.models.event;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import daca.myevent.myevent.models.product.Product;

@Entity
public class Event {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	@ManyToMany
	@ElementCollection
	@JoinColumn(name = "id",referencedColumnName="id")
	private List<Product> myEvent;
	
	public Event() {
		this.myEvent = new ArrayList<Product>();
	}

	public List<Product> getMyEvent() {
		return myEvent;
	}
	
	public void addProduct(Product product) {
		myEvent.add(product);
	}
	
	public boolean removeProct(Product product) {
		return myEvent.remove(product);
	}
	
	public void cleanMyEvent() {
		this.myEvent = new ArrayList<Product>();
	}
}
