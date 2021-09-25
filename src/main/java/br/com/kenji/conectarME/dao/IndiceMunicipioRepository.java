package br.com.kenji.conectarME.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kenji.conectarME.model.IndiceMunicipio;

@Repository
public interface IndiceMunicipioRepository extends JpaRepository<IndiceMunicipio, Integer> {
	
}
