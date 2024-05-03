package com.kibobazar.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kibobazar.app.entity.Privilegio;
import com.kibobazar.app.service.PrivilegioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/privilegios")
public class PrivilegioController {
	PrivilegioService privilegioService;
	public PrivilegioController(PrivilegioService privilegioService) {
		this.privilegioService = privilegioService;
	}
	
	
	
	  @GetMapping
	ResponseEntity<List< Privilegio> > getAllPrivilegio(
			@RequestParam( name="active", 
						   required=false, 	
						   defaultValue="true") boolean active
			){
		return  new ResponseEntity<List<Privilegio>>(privilegioService.getAllPrivilegio(active), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	ResponseEntity<Privilegio> getPrivilegioById(@PathVariable("id") Long id){
		return new ResponseEntity<Privilegio>(privilegioService.getPrivilegioById(id) , HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<Privilegio> createPrivilegio(@RequestBody Privilegio privilegio){
		Privilegio createPrivilegio = privilegioService.createPrivilegio(privilegio);
		return new ResponseEntity<Privilegio>(createPrivilegio, HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> detelePrivilegio(@PathVariable("id") Long id){
		privilegioService.deletePrivilegio(id);
		return new ResponseEntity<String>("Privilegio id " + id + " successfully deleted", HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	ResponseEntity<Privilegio> updatePrivilegio(
			@RequestBody Privilegio privilegio,
			@PathVariable("id") Long id
			){
		Privilegio updatePrivilegio = privilegioService.updatePrivilegio(privilegio, id);
		return new ResponseEntity<Privilegio>(updatePrivilegio, HttpStatus.OK);
	}

}
