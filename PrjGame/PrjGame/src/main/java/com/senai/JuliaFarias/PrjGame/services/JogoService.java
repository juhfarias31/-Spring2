package com.senai.JuliaFarias.PrjGame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.JuliaFarias.PrjGame.entities.Jogo;
import com.senai.JuliaFarias.PrjGame.repositories.JogoRepository;

@Service
public class JogoService {
	private final JogoRepository jogoRepository;
	
	@Autowired
	public JogoService(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}
	
	public Jogo saveJogo(Jogo jogo) {
		return jogoRepository.save(jogo);
	}
	
	public Jogo getJogoById(Long Id) {
		return jogoRepository.findById(Id).orElse(null);
	}
	
	public Jogo getProdutoById(long Id) {
		return jogoRepository.findById(Id).orElse(null);
	}
	
	public List<Jogo> getAllProdutos(){
		return jogoRepository.findAll();
	}
	
	public void deletJogo(Long Id) {
		jogoRepository.deleteById(Id);
	}
}