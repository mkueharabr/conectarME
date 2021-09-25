package br.com.kenji.conectarME.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ibge_municipios")
public class Municipio {

	@Id
	private int coMunicipio;
	
	private String municipio;
	
	@Column(name="uf_uf")
	private String uf;
	
/*
	@ManyToOne
	private CensoUF uf;
*/
	
	public int getCoMunicipio() {
		return coMunicipio;
	}

	public void setCoMunicipio(int coMunicipio) {
		this.coMunicipio = coMunicipio;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
}
