package context;

public class Main {

      public static void main (String [] args) {
    	  //Atributos
      		int a = 1;
      		int b = 0;
      		
      		//Ciclo
      		for (int i=0; i<11; i++){
      			int suma = a + b;
      			System.out.print(suma + i +" ");
      			a = b;
      			b = suma;
      		}
      }
}