package ejerciciostabla.exportacionjava;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of Practicas.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Practicas implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Cod_practica. */
	private Integer codPractica;

	/** Titulo. */
	private Long titulo;

	/** Nivel. */
	private String nivel;

	/** The set of Elaboran. */
	private Set<Elaboran> elaboranSet;

	/** The set of Realizan. */
	private Set<Realizan> realizanSet;

	/**
	 * Constructor.
	 */
	public Practicas() {
		this.elaboranSet = new HashSet<Elaboran>();
		this.realizanSet = new HashSet<Realizan>();
	}

	/**
	 * Set the Cod_practica.
	 * 
	 * @param codPractica
	 *            Cod_practica
	 */
	public void setCodPractica(Integer codPractica) {
		this.codPractica = codPractica;
	}

	/**
	 * Get the Cod_practica.
	 * 
	 * @return Cod_practica
	 */
	public Integer getCodPractica() {
		return this.codPractica;
	}

	/**
	 * Set the Titulo.
	 * 
	 * @param titulo
	 *            Titulo
	 */
	public void setTitulo(Long titulo) {
		this.titulo = titulo;
	}

	/**
	 * Get the Titulo.
	 * 
	 * @return Titulo
	 */
	public Long getTitulo() {
		return this.titulo;
	}

	/**
	 * Set the Nivel.
	 * 
	 * @param nivel
	 *            Nivel
	 */
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	/**
	 * Get the Nivel.
	 * 
	 * @return Nivel
	 */
	public String getNivel() {
		return this.nivel;
	}

	/**
	 * Set the set of the Elaboran.
	 * 
	 * @param elaboranSet
	 *            The set of Elaboran
	 */
	public void setElaboranSet(Set<Elaboran> elaboranSet) {
		this.elaboranSet = elaboranSet;
	}

	/**
	 * Add the Elaboran.
	 * 
	 * @param elaboran
	 *            Elaboran
	 */
	public void addElaboran(Elaboran elaboran) {
		this.elaboranSet.add(elaboran);
	}

	/**
	 * Get the set of the Elaboran.
	 * 
	 * @return The set of Elaboran
	 */
	public Set<Elaboran> getElaboranSet() {
		return this.elaboranSet;
	}

	/**
	 * Set the set of the Realizan.
	 * 
	 * @param realizanSet
	 *            The set of Realizan
	 */
	public void setRealizanSet(Set<Realizan> realizanSet) {
		this.realizanSet = realizanSet;
	}

	/**
	 * Add the Realizan.
	 * 
	 * @param realizan
	 *            Realizan
	 */
	public void addRealizan(Realizan realizan) {
		this.realizanSet.add(realizan);
	}

	/**
	 * Get the set of the Realizan.
	 * 
	 * @return The set of Realizan
	 */
	public Set<Realizan> getRealizanSet() {
		return this.realizanSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codPractica == null) ? 0 : codPractica.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Practicas other = (Practicas) obj;
		if (codPractica == null) {
			if (other.codPractica != null) {
				return false;
			}
		} else if (!codPractica.equals(other.codPractica)) {
			return false;
		}
		return true;
	}

}
