package tesis.bsc.bsc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tesis.bsc.bsc.model.Indicador;

@RepositoryRestResource(collectionResourceRel = "Indicador", path="indicadores")
public interface IndicadorRepository extends CrudRepository<Indicador, Integer>{
	List<Indicador> findByNombre(@Param("nombre") String nombre);
}
