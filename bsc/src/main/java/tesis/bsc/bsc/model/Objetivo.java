package tesis.bsc.bsc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
public @Data class Objetivo implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String nombre;
	private String descripcion;

    @OneToMany(mappedBy = "objetivo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IndicadorXObjetivo> indicadoresAfectantes;

	public Objetivo() {
        this.indicadoresAfectantes = new ArrayList<>();
    }


//	@OneToMany(mappedBy = "objetivoAfectado")
//	private List<ObjetivoXObjetivo> objetivosAfectantes;
//
//	@OneToMany(mappedBy = "objetivoAfectante")
//	private List<ObjetivoXObjetivo> objetivosAfectados;
//
//	@OneToMany(mappedBy = "objetivo")
//	private List<HistoricoObjetivo> historicoAssoc;

	@ManyToOne
	@JoinColumn(name = "perspectiva_id", referencedColumnName = "id", nullable=false)
	private Perspectiva perspectiva;
}
