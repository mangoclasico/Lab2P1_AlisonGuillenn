/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j;

/**
 *
 * @author Dell i7
 */
public class J {

    /**
     * @param args the command line arguments
     */
public class Examen1P1_AlisonGuillen {
    private static boolean esBinarioValido(String numero) {
        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    private static String sumarBinarios(String numero1, String numero2) {
        String suma = "";
        int bin = 0;

        int length = numero1.length();
        for (int i = length - 1; i >= 0; i--) {
            int bit1 = Character.getNumericValue(numero1.charAt(i));
            int bit2 = Character.getNumericValue(numero2.charAt(i));

            int resultado = bit1 + bit2 + bin;
            int sumaBit = resultado % 2;
            bin = resultado / 2;

            suma = sumaBit + suma;
        }

        if (bin != 0) {
            suma = bin + suma;
        }

        return suma;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in); 
        int Respuesta = 1;

        while (Respuesta != 4) { 
            System.out.println("\nMenu: ");
            System.out.println("1. Sumador binario"); 
            System.out.println("2. Estrella de David");
            System.out.println("3. Salir");

            int opcion = leer.nextInt(); 
    switch (opcion) {
    case 1:{
        
        System.out.println("Ingrese el primer número binario: ");
        String numero1 = leer.next();

        System.out.println("Ingrese el segundo número binario: ");
        String numero2 = leer.next();
       
        // Validar que las cadenas ingresadas sean números binarios válidos
        if (!esBinarioValido(numero1) || !esBinarioValido(numero2)) {
            System.out.println("Una de las cadenas tiene numeros distintos a '1' y '0' .");
            return;
        }
        // Validar que las cadenas tengan el mismo tamaño
        else if (numero1.length() != numero2.length()) {
            System.out.println("Los números deben tener el mismo número de bits.");
            return;
        }

        // Calcular la suma de los números binarios
        String suma = sumarBinarios(numero1, numero2);

        // Imprimir la suma
        System.out.println("La suma es: " + suma);
    }   break;   
          
    case 2: {
        System.out.println("1.Piramide hacia arriba");
        System.out.println("2.Piramide hacia abajo");
        int opcion2 = leer.nextInt();
        if(opcion2==1){
    System.out.println("Ingrese numero de lineas: ");
    int size = leer.nextInt();
    for (int  i = 0; i < size; i++) {
      // print espacios
      for (int j = 0; j < size - i - 1; j++) {
        System.out.print(" ");
      }
      // print plin plin
      for (int k = 0; k < 2 * i + 1; k++) {
        if (i == 0 || i == size - 1) {
          System.out.print("+");
        }
        else {
          if (k == 0 || k == 2 * i) {
            System.out.print("+");
          }
          else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
        }  
        }else if(opcion2==2){
            System.out.println("Ingrese numero de lineas: ");
            int size = leer.nextInt();
            for (int i = 0; i < size; i++) {
            // print espacios
            for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // imprime estrellas
        for (int k = 0; k < 2 * (size - i) - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
        }

    }
    break;
    case 3:{
        System.out.println("tkm"); 
        System.exit(0); 
        break;
    }
    default:
        System.out.println("Opción inválida");
        break;
    }
    
}
}
}
    
}
