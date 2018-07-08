package tesis.bsc.bsc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tesis.bsc.bsc.model.Estrategia;

@RepositoryRestResource(collectionResourceRel = "Estrategia", path="estrategias")
public interface EstrategiaRepository extends CrudRepository<Estrategia, Integer>{
	List<Estrategia> findByNombre(@Param("nombre") String nombre);
}
