package ejerciciostabla.exportacionjava;

import java.io.Serializable;

/**
 * Model class of Hacen.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Hacen implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Alumnos. */
	private Alumnos alumnos;

	/** Examenes. */
	private Examenes examenes;

	/** Nota. */
	private Long nota;

	/**
	 * Constructor.
	 */
	public Hacen() {
	}

	/**
	 * Set the Alumnos.
	 * 
	 * @param alumnos
	 *            Alumnos
	 */
	public void setAlumnos(Alumnos alumnos) {
		this.alumnos = alumnos;
	}

	/**
	 * Get the Alumnos.
	 * 
	 * @return Alumnos
	 */
	public Alumnos getAlumnos() {
		return this.alumnos;
	}

	/**
	 * Set the Examenes.
	 * 
	 * @param examenes
	 *            Examenes
	 */
	public void setExamenes(Examenes examenes) {
		this.examenes = examenes;
	}

	/**
	 * Get the Examenes.
	 * 
	 * @return Examenes
	 */
	public Examenes getExamenes() {
		return this.examenes;
	}

	/**
	 * Set the Nota.
	 * 
	 * @param nota
	 *            Nota
	 */
	public void setNota(Long nota) {
		this.nota = nota;
	}

	/**
	 * Get the Nota.
	 * 
	 * @return Nota
	 */
	public Long getNota() {
		return this.nota;
	}


}
