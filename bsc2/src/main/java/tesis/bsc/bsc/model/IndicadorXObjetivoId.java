package tesis.bsc.bsc.model;

import java.io.Serializable;

import lombok.Data;

public @Data class IndicadorXObjetivoId implements Serializable {

	/**
	 * Clave primaria compartida entre Indicadores y Objetivos.
	 */
	private static final long serialVersionUID = 1L;
	private int indicador;
	private int objetivo;
}
