package com.wd.projeto01.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class HelloWorld {
	
	@GetMapping
	public ResponseEntity<List<String>> helloWord(){
		List<String> list = new ArrayList();
		
		String nome = "Eu";
		
		list.addAll(Arrays.asList("Rui", "Robério", "Eu", "Benedilson", "Jocilé", "Eu"));
		
		//remover elemento(s) de uma lista se essa lista contiver o elemento
		list.removeIf(a -> a.equals(nome));
		
		return ResponseEntity.ok(list);
	}
}
