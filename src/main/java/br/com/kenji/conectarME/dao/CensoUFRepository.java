package br.com.kenji.conectarME.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kenji.conectarME.model.CensoUF;

@Repository
public interface CensoUFRepository extends JpaRepository<CensoUF, String> {

}
