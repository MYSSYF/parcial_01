package vista;

import java.util.ArrayList;

import modelo.paarticula;
import processing.core.PApplet;

public class Server extends PApplet {

	paarticula parrti;
	comis hable;
	ArrayList<paarticula> miLista;

	private boolean cha;
	private int cont;

	public static void main(String[] args) {
		PApplet.main("vista.Server");
	}

	@Override
	public void settings() {
		size(700, 600);

	}

	public void setup() {
		cha = false;
		cont = 0;

		miLista = new ArrayList<paarticula>();
		hable = new comis(this);
		hable.start();

	}

	public void draw() {

		background(50, 100, 50);

		if (hable.getPermiso() == 2) {

			miLista.removeAll(miLista);

		}

		for (int i = 0; i < hable.getCuant(); i++) {
			if (hable.getPermiso() == 1) {
				paarticula pan = new paarticula(hable.getNamin(), hable.getCuant(), hable.getSx(), hable.getSy(),
						hable.getR(), hable.getG(), hable.getB(), (int) random(4));
				miLista.add(pan);
			}
		}

		for (int i = 0; i < miLista.size(); i++) {
			paarticula pin = miLista.get(i);
			pin.pintar(this);
			pin.mover();
			hable.setPermiso(0);
		}

	}

}
