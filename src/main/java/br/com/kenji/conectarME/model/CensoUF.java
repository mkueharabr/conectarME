package br.com.kenji.conectarME.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="censo_uf")
public class CensoUF {

	@Id
	@Column(name="uf")
	private String id;
	
	@Column(nullable=false)
	private String estado;
	
	@Column(nullable=false)
	private int codRegiao;
	
	@Column(name="CO_UF", nullable=false)
	private int coUF;
	
	/*
	@OneToMany(mappedBy = "uf", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("uf")
	private List<Municipio> municipios;
*/
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getCodRegiao() {
		return codRegiao;
	}


	public void setCodRegiao(int codRegiao) {
		this.codRegiao = codRegiao;
	}


	public int getCoUF() {
		return coUF;
	}


	public void setCoUF(int coUF) {
		this.coUF = coUF;
	}


}
