import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("          .:::MENU DE OPCIONES:::.         ");
        System.out.println("===========================================");
        System.out.println();

        System.out.println("==========================================");
        System.out.println("1.   .::CALCULADORA BASICA::.  ");
        System.out.println("2.   .::NUMERO PAR O IMPAR::.  ");
        System.out.println("3.   .::TABLA DE MULTIPLICAR::. ");
        System.out.println("4.   .::CONTADOR DE VOCALES::. ");
        System.out.println("5.   .::PROMEDIO DE NOTAS::.   ");
        System.out.println("6.   .::CLASE ESTUDIANTE::.    ");
        System.out.println("7.   .::CUENTA BANCARIA::.     ");
        System.out.println("8.   .::HERENCIA DE VEHICULOS::.");
        System.out.println("9.   .::MATRIZ 3x3::.    ");
        System.out.println("10.  .::SISTEMA BASICO DE INVENTARIO::. ");
        System.out.println("11.  .::SALIR DE LA APLICACION::.  ");
        System.out.println("===========================================");
        System.out.println();

        System.out.print("Elija una opción: ");
        int op = sc.nextInt();
        sc.nextLine();

        do{
            switch(op){
                case 1:
                    break;
                case 2:
                    System.out.println("==============================");
                    System.out.println("         ~PAR E IMPAR~        ");
                    System.out.println("==============================");
                    System.out.println(".::Ingrese un Numero::.");
                    int Numero = sc.nextInt();
                    ParImpar(Numero);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("==============================");
                    System.out.println("  .::CANTIDAD DE VOCALES::.  ");
                    System.out.println("==============================");

                    System.out.println("Ingrese una palabra: ");
                    String palabra = sc.nextLine();
                    System.out.println("La cantidad de Vocales en la palabra, es: " + ContarVocales(palabra));
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
            }
        }while(op == 11);
    }

    public static void ParImpar(int numero) {
        if(numero % 2 == 0){
            System.out.println("El numero es Par");
        }
        else{
            System.out.println("El numero es Impar");
        }
    }

    public static int ContarVocales(String palabra) {
        int contador = 0;
        palabra = palabra.toLowerCase();
        for(int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            if(letra == 'a' || letra =='e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }

        return contador;
    }
}
