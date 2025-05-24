package com.projeto.artstate_studio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.artstate_studio.entities.ObraSalva;
import com.projeto.artstate_studio.repositories.ObraSalvaRepository;

@Service
public class ObraSalvaService {

	@Autowired
	private ObraSalvaRepository repository;
	
	//listar as obras salvas
	public List <ObraSalva> listartodas(){
		return	repository.findAll();
	}
	
	//salvar nova obra
	public ObraSalva salvar(ObraSalva obra) {
		return repository.save(obra);
	}
	
	
	//editar
	public ObraSalva editarDescricao(Long id, String novaDescricao) {
		Optional<ObraSalva> optional = repository.findById(id);

		if(optional.isPresent()) {
			ObraSalva obra = optional.get();
			obra.setDescricao(novaDescricao);
			return repository.save(obra);	
		}
		
		else {return null;}
	}
	
	//excluir
	public boolean excluir(Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		else { return false; }
	}
	
	//busca por id
	public Optional<ObraSalva> buscarPorId(Long id) {
        return repository.findById(id);
    }
	
	//busca por titulo
	public List<ObraSalva> buscarPorTitulo(String titulo) {
	    return repository.findByTituloContainingIgnoreCase(titulo);
	}
	
}
