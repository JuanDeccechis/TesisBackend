package tesis.bsc.bsc.model;

import javax.persistence.Id;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;


@Entity
public @Data class Perspectiva implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	 
	@ManyToOne
	@JoinColumn(name = "estrategia_id", referencedColumnName = "id", nullable=false)
	private Estrategia estrategia;
	
	private String nombre;
	private String descripcion;
	//NUEVO
	@OneToMany(mappedBy = "perspectiva")
	private List<Objetivo> ObjetivosAssoc;
}