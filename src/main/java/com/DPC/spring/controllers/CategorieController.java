package com.DPC.spring.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.DPC.spring.entities.Categorie;
import com.DPC.spring.repositories.CategorieRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/cat")


public class CategorieController  {
@Autowired
CategorieRepository caterepos ; 
    @GetMapping("/getall")
    public List<Categorie>getall(){
    return 	this.caterepos.findAll();
    }
	
	
	


			
		
	}
	
