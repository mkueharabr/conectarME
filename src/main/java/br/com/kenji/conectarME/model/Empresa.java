package br.com.kenji.conectarME.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable=false)
	private String razaoSocial;
	
	@Column(nullable=false)
	private String nomeFantasia;
	private String cnpj;
	private String inscricaoEstadual;
	
	@Column(nullable=false)
	private int codigoSetor;
	private int numeroEmpregados;
	private double faturamentoAnual;
	
	@OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("empresa")
	private List<Endereco> enderecos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public int getNumeroEmpregados() {
		return numeroEmpregados;
	}

	public void setNumeroEmpregados(int numeroEmpregados) {
		this.numeroEmpregados = numeroEmpregados;
	}

	public double getFaturamentoAnual() {
		return faturamentoAnual;
	}

	public void setFaturamentoAnual(double faturamentoAnual) {
		this.faturamentoAnual = faturamentoAnual;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	
	
	
	
}
