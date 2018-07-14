package daca.myevent.myevent.models.user;

import java.util.ArrayList;

public class Contracted extends User {
	
	private String cnpj;
	private ArrayList<String> otherPhone;
	private String description;
	
	public Contracted(String name, String cpf, String phone, 
			String email, ArrayList<String> otherPhone, String description) {
		super(name, cpf, phone, email);
		// TODO Auto-generated constructor stub
		this.cnpj = cnpj;
		this.otherPhone = otherPhone;
		this.description = description;
	}

	
	
	
}
