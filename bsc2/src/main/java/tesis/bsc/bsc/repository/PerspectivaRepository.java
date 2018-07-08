package tesis.bsc.bsc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tesis.bsc.bsc.model.Perspectiva;

@RepositoryRestResource(collectionResourceRel = "Perspectiva", path="perspectivas")
public interface PerspectivaRepository extends CrudRepository<Perspectiva, Integer>{
	List<Perspectiva> findByNombre(@Param("nombre") String nombre);
}

