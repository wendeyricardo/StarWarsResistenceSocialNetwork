package com.example.api.da.resistencia;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="rebeldesdagalaxia")
public class Rebelde {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_rebelde;
	
	private String nome;
	
	private String genero;
	
	private String localizacao;
	
	public Long getId_rebelde() {
		return id_rebelde;
	}
	public void setId_rebelde(Long id_rebelde) {
		this.id_rebelde = id_rebelde;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_rebelde == null) ? 0 : id_rebelde.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rebelde other = (Rebelde) obj;
		if (id_rebelde == null) {
			if (other.id_rebelde != null)
				return false;
		} else if (!id_rebelde.equals(other.id_rebelde))
			return false;
		return true;
	}
	

}
