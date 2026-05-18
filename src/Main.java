import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Menus catalogo = new Menus();
        Calculadora calculadora = new Calculadora();
        MenuInventario inventario = new MenuInventario();
        MenuEstudiantes Archivos = new MenuEstudiantes();
        int op = 0;
        do{
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
        op = sc.nextInt();
        sc.nextLine();

            switch(op){
                case 1:
                    calculadora.basica();
                    break;
                case 2:
                    System.out.println("==============================");
                    System.out.println("         ~PAR E IMPAR~        ");
                    System.out.println("==============================");
                    System.out.println(".::Ingrese un Numero::.");
                    int Numero = sc.nextInt();
                    sc.nextLine();
                    ParImpar(Numero);

                    System.out.println();
                    
                    break;
                case 3:
                    System.out.println("==============================");
                    System.out.println("  .::TABLA DE MULTIPLICAR::.  ");
                    System.out.println("==============================");

                    System.out.println("Ingrese un numero del 1 al 12");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    tablaMultiplicar(numero);
                    
                    System.out.println();
                    
                    break;
                case 4:
                    System.out.println("==============================");
                    System.out.println("  .::CANTIDAD DE VOCALES::.  ");
                    System.out.println("==============================");

                    System.out.println("Ingrese una palabra: ");
                    String palabra = sc.nextLine();
                    System.out.println("La cantidad de Vocales en la palabra, es: " + ContarVocales(palabra));
                    
                    System.out.println();
                    break;
                case 5:
                    System.out.println("=================================");
                    System.out.println("     .::PROMEDIO DE NOTAS::.     ");
                    System.out.println("=================================");
                    CalcularPromedio();
                    System.out.println();
                    break;
                case 6:
                    Archivos.menu();
                    break;
                case 7:
                    CuentaBancaria.cuenta();
                    break;
                case 8:
                    catalogo.CatalogoVehiculos();
                    break;
                case 9:
                    System.out.println("=================================");
                    System.out.println("        .::MATRIZ 3X3::.         ");
                    System.out.println("=================================");
                    Matriz3x3();        
                    System.out.println();            
                    break;
                case 10:
                    inventario.Inventario();
                    break;
                case 11:
                    break;
            }
        }while(op != 11);
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

    public static void tablaMultiplicar(int numero) {
        int producto = 0;
        System.out.println("===============================");
        System.out.println("  .::TABLA DEL NUMERO " + numero + "::." );
        for(int i = 0; i <= 12; i++){
            producto = numero * i;
            System.out.println(numero + " * " + i + "= " + producto);
        }
        System.out.println("===============================");
        return;
    }

    public static void CalcularPromedio() {
        double suma = 0;
        int cantidad = 0;
        int desicion = 1;
        while(desicion != 0){
            System.out.println("Ingrese la nota #" + (cantidad + 1) + ": ");
            double nota = sc.nextDouble();
            sc.nextLine();
            suma += nota;
            cantidad++;
            
            System.out.println("Desea agregar otra Nota?" + "\n1/Seguir " + "\t0/Terminar");
        
            desicion = sc.nextInt();
            sc.nextLine();
        }

        double promedio = suma / cantidad;

        System.out.println("================================");
        System.out.println(" .::El promedio obtenido es de: " + promedio);
        System.out.println("================================");
    }

    public static void Matriz3x3(){
        int[][] matriz = new int [3][3];
        System.out.println("Ingrese un numero para llenar la posicion");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Posicion [" + i + "] [" + j + "] = ");
                matriz[i][j] = sc.nextInt();
            }
        }

       ;
        System.out.println("--------MATRIZ GENERADA--------");
        


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
