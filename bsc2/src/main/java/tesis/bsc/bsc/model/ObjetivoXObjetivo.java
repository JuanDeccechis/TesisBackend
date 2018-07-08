package tesis.bsc.bsc.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;


@Entity

public @Data class ObjetivoXObjetivo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "objetivo_afectado_id", referencedColumnName = "id", nullable=false)
	private Objetivo objetivoAfectado;
	
	 
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "objetivo_afectante_id", referencedColumnName = "id", nullable=false)
	private Objetivo objetivoAfectante;
	
	private float peso;

}
