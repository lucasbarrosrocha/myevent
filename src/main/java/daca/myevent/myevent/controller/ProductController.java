package daca.myevent.myevent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import daca.myevent.myevent.models.product.Product;
import daca.myevent.myevent.repository.ProductRepositoryInterface;

@RestController
public class ProductController {

	@Autowired
	ProductRepositoryInterface repository;
	
	@RequestMapping(value = "/api/product/{idProduct}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Product> get(@PathVariable("idProduct") long idProduct){
		Product product = repository.findById(idProduct).get();
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/api/createProduct", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity post(@RequestBody Product newProduct){
		repository.save(newProduct);
		return new ResponseEntity<Product>(HttpStatus.CREATED);
	}
}
