package br.com.kenji.conectarME.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kenji.conectarME.model.Municipio;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {
	public List<Municipio> findAllByUf(String uf);
}
