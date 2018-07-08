package tesis.bsc.bsc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tesis.bsc.bsc.model.ObjetivoXObjetivo;

@RepositoryRestResource(collectionResourceRel = "ObjetivoXObjetivo", path="objetivosxobjetivos")
public interface ObjetivoXObjetivoRepository extends CrudRepository<ObjetivoXObjetivo, Integer>{
}
