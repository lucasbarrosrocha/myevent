package daca.myevent.myevent.models.user;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

import daca.myevent.myevent.models.event.Event;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	private String name;
	private String cpf;
	private String phone;
	@Email
	@JsonIgnore
	private String email;
	@JsonIgnore
	private String password;
	
	/*@OneToOne
	@JoinColumn(name = "id",referencedColumnName="id")
	private MyEvent event;*/

	public User(String name, String cpf, String phone, String email, String password) {
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
		this.email = email;
		this.password = password;
		//this.event = new MyEvent();
	}

	public User(String name, String email, String password) {
		this.name = name;
		//this.cpf = cpf;
		//this.phone = phone;
		this.email = email;
		this.password = password;
		//this.event = new MyEvent();
	}
	
	public User() {
		this.name = "";
		this.cpf = "";
		this.phone = "";
		this.email = "";
		this.password = "";
		//this.event = new MyEvent();
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
