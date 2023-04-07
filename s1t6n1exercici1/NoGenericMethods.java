package s1t6n1exercici1;

import java.util.ArrayList;

public class NoGenericMethods {
	
	//Constructor per inicialitzar objectes
	public NoGenericMethods(Objecte a, Objecte b, Objecte c) {
		this.afegir_llista(a);
		this.afegir_llista(b);
		this.afegir_llista(c);
	}
	
	ArrayList<Objecte> llista_objectes;
	
	//Afegir objectes a la llista
	public void afegir_llista(Objecte objecte) {
		llista_objectes.add(objecte);
	}
	
	//Extreure objectes de la llista
	public ArrayList<Objecte>extreure_objectes() {
		return llista_objectes;
	}
}