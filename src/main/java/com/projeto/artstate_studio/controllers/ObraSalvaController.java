package com.projeto.artstate_studio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.artstate_studio.entities.ObraSalva;
import com.projeto.artstate_studio.service.ObraSalvaService;

@RestController
@RequestMapping("/galeria")
@CrossOrigin(origins = "*") //permite o acesso ao backend
public class ObraSalvaController {

	@Autowired
	private ObraSalvaService service;
	
	// listar todas as obras salvas
	@GetMapping
	public ResponseEntity<List<ObraSalva>> listartodas(){
		return ResponseEntity.ok(service.listartodas());
	}
	
	//salvar nova obra
	@PostMapping
	public ResponseEntity<ObraSalva> salvar(@RequestBody ObraSalva obra){
		return ResponseEntity.ok(service.salvar(obra));
	}
	
	
	// editar descricao
	@PutMapping("/{id}/descricao")
	public ResponseEntity<ObraSalva> editarDescricao(@PathVariable Long id,
			@RequestBody String novaDescricao){
		ObraSalva atualizada = service.editarDescricao(id, novaDescricao);
		if (atualizada != null) {
			return ResponseEntity.ok(atualizada);
		}
		
		else { 
			return ResponseEntity.notFound().build(); 
		}
	}
	
	//excluir 
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable Long id) {
		boolean excluido = service.excluir(id);
		if(excluido) {
			return ResponseEntity.noContent().build();
		}
		
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	//buscar por titulo
	@GetMapping("busca")
	public ResponseEntity<List<ObraSalva>> buscarPorTitulo(
			@RequestParam String titulo){
		
		return ResponseEntity.ok(service.buscarPorTitulo(titulo));
	}
}