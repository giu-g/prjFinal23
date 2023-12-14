package com.senai.prjCatalogoJogo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Jogo")
public class Jogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String Name;

	private String Genero;

	private String Descricao;

	private String Integrantes;

	private String Website;

	private String Squad;

	private String Thumbnail;

	// construtor vazio
	public Jogo() {

	}

	public Jogo(Long id, String name, String genero, String descricao, String integrantes, String website, String squad,
			String thumbnail) {
		super();
		this.id = id;
		Name = name;
		Genero = genero;
		Descricao = descricao;
		Integrantes = integrantes;
		Website = website;
		Squad = squad;
		Thumbnail = thumbnail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getIntegrantes() {
		return Integrantes;
	}

	public void setIntegrantes(String integrantes) {
		Integrantes = integrantes;
	}

	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}

	public String getSquad() {
		return Squad;
	}

	public void setSquad(String squad) {
		Squad = squad;
	}

	public String getThumbnail() {
		return Thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		Thumbnail = thumbnail;
	}
	
	


}
