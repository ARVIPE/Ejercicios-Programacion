package tema7.gestionVenta.gestionVentaCoches.modelo;

public class Concesionario {
	
	int id;
	String cif;
	String nombre;
	String localidad;

	public Concesionario() {
	}
  
	public Concesionario(int id, String cif, String nombre, String localidad) {
		super();
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
		this.localidad = localidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Concesionario [id=" + id + ", cif=" + cif + ", nombre=" + nombre + ", localidad=" + localidad + "]";
	}
	
	

}
