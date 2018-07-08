package tesis.bsc.bsc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@IdClass(IndicadorXObjetivoId.class)

@Entity
public @Data class IndicadorXObjetivo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@ManyToOne
	@JoinColumn(name = "indicador_id", referencedColumnName = "id", nullable=false)
	private Indicador indicador;
	
	
	@Id 
	@ManyToOne
	@JoinColumn(name = "objetivo_id", referencedColumnName = "id", nullable=false)
	private Objetivo objetivo;
	
	private float peso;
}
