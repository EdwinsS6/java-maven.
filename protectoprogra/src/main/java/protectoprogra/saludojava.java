package protectoprogra;
import java.util.Arrays;
import java.util.ArrayList;
public class saludojava {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		int a = 10;
		int b = 5;
		int resultado = a * b;
		
		System.out.println("Resultado: "+ resultado);
		
		//4.1 DECLARACION DE ARREGLOS
		
		// Forma 1: declarar  y asignar tamaño
		int[] numeros = new int[5];
		numeros[0] = 10;
		numeros[1] = 20;
		
		 // Forma 2: declarar e inicializar directamente
        int[] valores = {5, 3, 9, 1, 7};
        
        
        // 4.2 Métodos y utilidades principales para arreglos
        
     // Ordenar arreglo
        Arrays.sort(valores);

        // Buscar un valor (el arreglo debe estar ordenado)
        int posicion = Arrays.binarySearch(valores, 9);
        System.out.println("Posición del 9: " + posicion);

        // Copiar arreglo
        int[] copia = Arrays.copyOf(valores, valores.length);

        // Llenar arreglo
        Arrays.fill(numeros, 100);

        // Comparar arreglos
        boolean iguales = Arrays.equals(valores, copia);
        System.out.println("¿Son iguales? " + iguales);

        // Mostrar arreglo como texto
        System.out.println("Valores: " + Arrays.toString(valores));
        
        
        
        // 4.3 RECORRER ARREGLOS
     // 1. For tradicional
        for (int i = 0; i < valores.length; i++) {
            System.out.println("For tradicional: " + valores[i]);
        }

        // 2. For-each
        for (int v : valores) {
            System.out.println("For-each: " + v);
        }

        // 3. Streams (Java 8+)
        Arrays.stream(valores).forEach(v -> {
            System.out.println("Stream: " + v);
        });


        // =====================================
        // 4.4 DIFERENCIAS ENTRE ARRAY Y ARRAYLIST
        // =====================================

        // ARRAY: tamaño fijo, tipo primitivo
        int[] edadesArreglo = new int[3];
        edadesArreglo[0] = 18;
        edadesArreglo[1] = 20;
        edadesArreglo[2] = 25;

        System.out.println("Tamaño del arreglo: " + edadesArreglo.length);

        // ARRAYLIST: tamaño dinámico, clase envolvente
        ArrayList<Integer> edadesLista = new ArrayList<>();
        edadesLista.add(18);
        edadesLista.add(20);
        edadesLista.add(25);
        edadesLista.add(30); // crece dinámicamente

        System.out.println("ArrayList: " + edadesLista);
        System.out.println("Tamaño del ArrayList: " + edadesLista.size());

        // Eliminar elemento
        edadesLista.remove(1);

        // Acceso a elementos
        System.out.println("Primer elemento del arreglo: " + edadesArreglo[0]);
        System.out.println("Primer elemento del ArrayList: " + edadesLista.get(0));
        
        
	}
}


