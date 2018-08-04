package daca.myevent.myevent.models.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Contracted extends User {
	
	private String cnpj;
	private String otherPhone;
	private String description;
	
	
	public Contracted(String name, String cpf, String phone, 
			String email, String password, String otherPhone, String description) {
		super(name, cpf, phone, email, password);
		// TODO Auto-generated constructor stub
		this.cnpj = cnpj;
		this.otherPhone = otherPhone;
		this.description = description;
	}
	
	public Contracted() {
		super();
		// TODO Auto-generated constructor stub
		this.cnpj = "";
		this.otherPhone = "";
		this.description = "";
	}

	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getOtherPhone() {
		return otherPhone;
	}


	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	
}
