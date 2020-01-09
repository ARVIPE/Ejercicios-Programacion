package formula1Juego.formula1Juego;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;



public class Coche extends Vehiculo {

	public Coche(String nombre, int numeroDePista, Color color) {
		super(nombre, numeroDePista, color);
		
	}
	
	public String toString() {
		return super.toString();
	}
	 
	public boolean tirada() {
		return super.tirada();
	}


	public void pintarVehiculo(Graphics g) {
		g.setColor(this.getColor());
		g.fillRect((this.getPosicion()*1000/100)+10, this.getDistanciaDeLaPista()+35, 30, 20);
		g.fillRect((this.getPosicion()*1000/100), this.getDistanciaDeLaPista()+55, 50, 20);
		g.setColor((Color.BLACK));
		g.fillRect((this.getPosicion()*1000/100)+13, this.getDistanciaDeLaPista()+37, 20, 15);
		g.fillOval((this.getPosicion()*1000/100)+30, this.getDistanciaDeLaPista()+65, 15, 15);
		g.fillOval((this.getPosicion()*1000/100)+5, this.getDistanciaDeLaPista()+65, 15, 15);
		
		System.out.println("Estoy en la posici�n " + this.getPosicion() + "," + this.getDistanciaDeLaPista() + " " + this.getNombre());
	}



	@Override
	public void pintar(Graphics g) {
		this.getPista().paint(g);
		this.pintarVehiculo(g);
		
	}

	

}
