package s1t6n1exercici2;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Fernando", "Alonso", 41);
		int numero = 33;
		String string = "Aston Martin";
		
		//Cridem al mètode en un ordre
		GenericMethods.imprimir(persona1, string, numero);
		//El cridem en un altre ordre
		GenericMethods.imprimir(numero, persona1, string);
	}
}
