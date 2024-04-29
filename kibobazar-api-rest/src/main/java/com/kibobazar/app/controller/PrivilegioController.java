package com.kibobazar.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.kibobazar.app.entity.Privilegio;
import com.kibobazar.app.service.PrivilegioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/privilegio")
public class PrivilegioController {
	PrivilegioService privilegioService;
	public PrivilegioController(PrivilegioService privilegioService) {
		this.privilegioService = privilegioService;
	}
	
	@GetMapping
	List<Privilegio> getAllActivePrivilegio(){
		return privilegioService.getAllActivePrivilegio();
	}
}
