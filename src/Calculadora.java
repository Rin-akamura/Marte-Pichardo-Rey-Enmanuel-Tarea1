import java.util.Scanner;
public class Calculadora {
    Scanner digitar = new Scanner(System.in);
    public Calculadora() {
    }

    public void basica() {
        int op = 0;
        System.out.println("=====================================");
        System.out.println("      .::CALCULADORA BASICA::.       ");
        System.out.println("=====================================");
        do{
            System.out.println("-------------------------------------");
            System.out.println("              1. SUMAR               ");
            System.out.println("              2. RESTAR              ");
            System.out.println("              3. MULTIPLICAR         ");
            System.out.println("              4. DIVIDIR             ");
            System.out.println("              5. SALIR               ");
            System.out.println("-------------------------------------");
            op = digitar.nextInt();
            digitar.nextLine();

            switch(op){
                case 1:
                    System.out.println("==================================");
                    System.out.println("        .::SUMA DE NUMEROS::.     ");
                    System.out.println("==================================");

                    Suma();
                    break;
                case 2:
                    System.out.println("==================================");
                    System.out.println("        .::RESTA DE NUMEROS::.     ");
                    System.out.println("==================================");
                    
                    Resta();
                    break;
                case 3:
                    System.out.println("==================================");
                    System.out.println("  .::MULTIPLICACION DE NUMEROS::. ");
                    System.out.println("==================================");

                    Multiplicar();
                    break;
                case 4:
                    System.out.println("==================================");
                    System.out.println("     .::Division DE NUMEROS::.    ");
                    System.out.println("==================================");
                    
                    Dividir();
                    break;
                case 5:
                    break;
            }
        }while(op != 5);

    }

    public void Suma() {
        int suma = 0;
        System.out.println("Ingrese un numero");
        int Num1 = digitar.nextInt();

        System.out.println("Ingrese otro numero");
        int num2 = digitar.nextInt();
        digitar.nextLine();

        suma = Num1 + num2;

        System.out.println("-----------------------");
        System.out.println(Num1 + num2 + "= " + suma);
        System.out.println("-----------------------");
    }

    public void Resta(){
        int resta = 0;
        System.out.println("Ingrese un numero");
        int Num1 = digitar.nextInt();

        System.out.println("Ingrese otro numero");
        int num2 = digitar.nextInt();
        digitar.nextLine();

        resta = Num1 - num2;

        System.out.println("-----------------------");
        System.out.println(Num1 + num2 + "= " + resta);
        System.out.println("-----------------------");
    }

    public void Multiplicar() {
        int Multiplicacion = 0;
        System.out.println("Ingrese un numero");
        int Num1 = digitar.nextInt();

        System.out.println("Ingrese otro numero");
        int num2 = digitar.nextInt();
        digitar.nextLine();

        Multiplicacion = Num1 * num2;

        System.out.println("-----------------------");
        System.out.println(Num1 + num2 + "= " + Multiplicacion);
        System.out.println("-----------------------");
    }

    public void Dividir() {
        int Division = 0;
        System.out.println("Ingrese un numero");
        int Num1 = digitar.nextInt();

        System.out.println("Ingrese otro numero");
        int num2 = digitar.nextInt();
        digitar.nextLine();

        Division = Num1 / num2;

        System.out.println("-----------------------");
        System.out.println(Num1 + num2 + "= " + Division);
        System.out.println("-----------------------");
    }
    
}
