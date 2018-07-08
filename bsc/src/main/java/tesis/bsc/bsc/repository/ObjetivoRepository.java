package tesis.bsc.bsc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tesis.bsc.bsc.model.Objetivo;

@RepositoryRestResource(collectionResourceRel = "Objetivo", path="objetivos")
public interface ObjetivoRepository extends CrudRepository<Objetivo, Integer>{
	List<Objetivo> findByNombre(@Param("nombre") String nombre);
}
