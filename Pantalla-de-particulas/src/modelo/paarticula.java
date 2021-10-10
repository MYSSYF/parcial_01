package modelo;

import java.applet.Applet;

import processing.core.PApplet;
import processing.core.PConstants;
import vista.Server;

public class paarticula {
	Server app;
	private String name;
	private int cuant;

	private int x;
	private int y;

	private int r;
	private int g;
	private int b;

	private int valor;

	public paarticula() {
		this.name = "default";
		this.cuant = 0;

		this.x = 0;
		this.y = 0;
		this.r = 0;
		this.g = 0;
		this.b = 0;
		this.valor = 0;
	}

	public paarticula(String name, int cuant, int x, int y, int r, int g, int b, int valor) {
		this.name = name;
		this.cuant = cuant;
		this.x = x;
		this.y = y;
		this.r = r;
		this.g = g;
		this.b = b;
		this.valor = valor;
		;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void pintar(PApplet app) {
		app.fill(r, g, b);
		app.circle(x, y, 50);
		app.fill(0);
		app.textAlign(PConstants.CENTER);
		app.textSize(20);
		app.text(name, x, y - 40);

	}

	public void mover() {

		switch (valor) {
		case 0:
			x += (valor + 5);
			y += (valor + 5);
			if (x > 700) {
				valor = 3;
			}

			if (y > 600) {
				valor = 2;
			}
			break;
		case 1:
			x -= (valor + 5);
			y -= (valor + 5);

			if (x < 0) {
				valor = 2;
			}
			if (y < 0) {
				valor = 3;
			}
			break;
		case 2:
			x += (valor + 5);
			y -= (valor + 5);
			if (x > 700) {
				valor = 1;
			}
			if (y < 0) {
				valor = 0;
			}
			break;
		case 3:
			x -= (valor + 5);
			y += (valor + 5);
			if (y > 600) {
				valor = 1;
			}
			if (x < 0) {
				valor = 0;
			}
			break;

		default:
			break;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCuant() {
		return cuant;
	}

	public void setCuant(int cuant) {
		this.cuant = cuant;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String toString() {
		return this.name + ":" + this.cuant + ":" + this.x + ":" + this.y + ":" + this.r + ":" + this.g + ":" + this.b;
	}
}
