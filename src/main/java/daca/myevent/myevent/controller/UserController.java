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

import daca.myevent.myevent.models.user.User;
import daca.myevent.myevent.repository.UserRepositoryInterface;
import daca.myevent.myevent.security.JwtTokenProvider;


@RestController
public class UserController {
	
	@Autowired
	UserRepositoryInterface repository;
	
	@Autowired
	JwtTokenProvider jwtToken;
	
	@RequestMapping(value = "/api/user/{idUser}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<User> get(@PathVariable("idUser") long idUser){
		User usuario = repository.findById(idUser).get();
		return new ResponseEntity<User>(usuario, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/api/user", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity post(@RequestBody User newUser){
		repository.save(newUser);
		return new ResponseEntity<User>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/api/currentUser/{token}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<User> getCurrentUser(@PathVariable("token") String token){
		long id = jwtToken.getUserIdFromJWT(token);
		User usuario = repository.findById(id).get();
		return new ResponseEntity<User>(usuario, HttpStatus.OK);
	}
}