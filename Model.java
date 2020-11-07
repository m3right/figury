import java.util.ArrayList;

public class Model {
	private ArrayList<Figura> figury;
	
	public Model() {
		figury = new ArrayList<Figura>();
	}
	
	public void dodaj(Figura f) {
		figury.add(f);
	}
	
	public double pole() {
		double suma = 0;
		for(Figura f : figury) {
			suma += f.pole();
		}
		return suma;
	}
	
	public void powieksz(double ile) {
		for(Figura f : figury) {
			f.powieksz(ile);
		}
	}

	public String toString() {
		String wynik = "--- Model ---\n";
		for(Figura f : figury) {
			wynik += f + "\n";
		}
		wynik += "pole wszystkich figur modelu = " + pole() + "\n";
		wynik += "-----------";
		return wynik;
	}
	

}

