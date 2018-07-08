package tesis.bsc.bsc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tesis.bsc.bsc.model.HistoricoObjetivo;

@RepositoryRestResource(collectionResourceRel = "HistoricoObjetivo", path="historicosobjetivos")
public interface HistoricoObjetivoRepository extends CrudRepository<HistoricoObjetivo, Integer>{
}
