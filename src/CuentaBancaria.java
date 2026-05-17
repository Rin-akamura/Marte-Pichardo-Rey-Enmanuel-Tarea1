import java.util.Scanner;

public class CuentaBancaria {
    public static int password = 234122;
    static public double saldo = 0;
    static Scanner opcion = new Scanner(System.in);
    public CuentaBancaria() {

    }

    public static void cuenta(){
        Scanner leer = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("       .::SISTEMA BANCARIO VORTEX::.     ");
        System.out.println("=========================================");

        System.out.println("     Hasta el ultimo centavo cuenta      ");
        System.out.println("-----------------------------------------");
        int pin = 0;
        while(pin != password){
            System.out.println("Ingrese su Pin de seguridad: ");
            pin = leer.nextInt();
            leer.nextLine();

            if(pin != password){
                System.out.println("Pin incorrecto, intentelo otra vez");
                System.out.println();
            }
        }
        int op = 0;

        do{
            System.out.println("====================================================");
            System.out.println("              .:::MENU DE OPCIONES:::.              ");
            System.out.println("====================================================");

            System.out.println("----------------------------------------------------");
            System.out.println("1.              .::DEPOSITAR DINERO::.              ");
            System.out.println("2.             .::SALDO DE LA CUENTA::.             ");
            System.out.println("3.              .::RETIRO DE DINERO::.              ");
            System.out.println("5.             .::SALIR DE LA CUENTA::.             ");

            System.out.print("Ingrese la opcion deseada: ");
            op = leer.nextInt();
            leer.nextLine();

            switch(op) {
                case 1:
                    Depositar();
                    break;
                case 2:
                    Mostrar();
                    break;
                case 3:
                    Retirar();
                    break;
                case 4:
                    System.out.println("Gracias por preferirnos!");
                    break;
                default:
                    System.out.println("Esta opcion no es valida. Vuelve a intentarlo");
                    break;
            }
        }while(op != 4);

    }

    public static void Depositar(){
        double deposito = 0;
        System.out.println("==============================");
        System.out.println("  .::DEPOSITO DE EFECTIVO::.  ");
        System.out.println("==============================");

        System.out.println("Ingrese la cantidad del depostio");
        deposito = opcion.nextDouble();
        opcion.nextLine();

        saldo += deposito;
        
    }

    public static void Retirar() {

        if(saldo == 0) {
            System.out.println("Lo sentimos,pero la cuenta no cuenta con fondos para realizar esta accion");
            System.out.println();
            opcion.nextLine();
            return;
        }
        
        double retiro = 0;
        System.out.println("==============================");
        System.out.println("  .::RETIRO DE DINERO::.  ");
        System.out.println("==============================");

        System.out.print("Ingrese la cantidad que desea retirar: ");
        retiro = opcion.nextDouble();
        opcion.nextLine();

        if(saldo<retiro){
            System.out.println("Fondos insuficientes");
        }
        else{
            saldo -= retiro;
            System.out.println("El retiro realizado correctamente");
        }
        System.out.println();
    }

    public static void Mostrar(){
        System.out.println("==============================");
        System.out.println("  .::SALDO EN LA CUENTA::.  ");
        System.out.println("==============================");

        System.out.println("-> RD$" + saldo);
        System.out.println();
    }

    
}
