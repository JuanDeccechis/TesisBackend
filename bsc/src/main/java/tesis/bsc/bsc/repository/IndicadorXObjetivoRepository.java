package tesis.bsc.bsc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tesis.bsc.bsc.model.IndicadorXObjetivo;

@RepositoryRestResource(collectionResourceRel = "IndicadorXObjetivo", path="IndicadoresXObjetivos")
public interface IndicadorXObjetivoRepository extends CrudRepository<IndicadorXObjetivo, Integer>{
	
}

