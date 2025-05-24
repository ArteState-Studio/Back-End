package com.projeto.artstate_studio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ObraSalva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String artId;   // id da obra na api
    private String titulo;
    private String imagemUrl;
    private String descricao;

    public ObraSalva() {
    }

    public ObraSalva(String artId, String titulo, String imagemUrl, String descricao) {
        this.artId = artId;
        this.titulo = titulo;
        this.imagemUrl = imagemUrl;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtworkId() {
        return artId;
    }

    public void setArtworkId(String artworkId) {
        this.artId = artworkId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}