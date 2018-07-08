package tesis.bsc.bsc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

/*
 * Esta tabla es para verificar la herramienta antes de la integración.
 * No tiene umbrales, sus valores van de 0-10.
 */

@Entity
public @Data class Indicador implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private float valor;
	
	@OneToMany(mappedBy = "indicador", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<IndicadorXObjetivo> objetivosAsociados;
	
	
	public Indicador() {
        this.objetivosAsociados = new ArrayList<>();
    }
	
}
