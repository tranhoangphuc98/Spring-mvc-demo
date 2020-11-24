package com.laptrinhjavaweb.api.web;

import org.springframework.security.web.context.HttpRequestResponseHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.NewsDTO;

@RestController(value="newAPIOfWeb")
public class NewAPI {
	
	@PostMapping("/api/news")
	public NewsDTO createNew(@RequestBody NewsDTO newDTO ) {
		return newDTO;
	}
	
	@PutMapping("/api/news")
	public NewsDTO updateNew(@RequestBody NewsDTO newDTO) {
		return newDTO;
	}
	
	@DeleteMapping("/api/news")
	public void deleteNew(@RequestBody Long[] ids) {
		
	}

}
