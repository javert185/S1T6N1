package s1t6n1exercici2;

public class GenericMethods<T> {	
	//El m�tode gen�ric accepta tres arguments de tipus gen�ric
	public static <T> void imprimir(T obj1, T obj2, T obj3) {
		System.out.println("Els arguments rebuts son: " + obj1 + ", " + obj2 + " i " + obj3);
	}
}