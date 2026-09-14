package com.kaiky.kairos.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaiky.kairos.Request.AlunoRequest;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@PostMapping("media")
	public String getMedia(@RequestBody(required = true) AlunoRequest request){
		var media = (request.getNota1() + request.getNota2()) / 2;
		if(media < 5)
			return request.getName()+", você foi reprovado.";
		
		if(media == 5)
			return request.getName()+", você não atingiu a nota de corte e foi reprovado.";
		
		return "Parabéns "+request.getName()+", você foi aprovado.";
	}
	
}
