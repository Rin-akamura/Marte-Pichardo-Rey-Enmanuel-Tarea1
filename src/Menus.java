import java.util.Scanner;
public class Menus {
    Scanner opcion = new Scanner(System.in);

    public Menus() {
    }

    public void CatalogoVehiculos() {
        int op = 0;
        do{
            System.out.println("==========================================");
            System.out.println("        .::CATALOGO DE VEHICULOS::.       ");
            System.out.println("==========================================");
            System.out.println("------------------------------------------");
            System.out.println("  Elija el tipo de vehiculo que desea ver ");
            System.out.println("------------------------------------------");
            System.out.println("            1. MOTOCICLETA             ");
            System.out.println("               2. CARRO                ");
            System.out.println("               3. SALIR                ");
            System.out.println("------------------------------------------");
            System.out.println("Opcion: ");
            op = opcion.nextInt();
            opcion.nextLine();

            switch(op) {
                case 1:
                    break;
                case 2:
                    MenuCarro();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion invalida. Vuelva a intentarlo");
                    break;
            }

        }while(op != 3);
    }

    public void MenuCarro(){
        int op = 0;
        do{
            System.out.println("==========================================");
            System.out.println("        .::CATALOGO DE CARROS::.       ");
            System.out.println("==========================================");
            System.out.println("------------------------------------------");
            System.out.println("    Elija la marca de su preferencia ");
            System.out.println("------------------------------------------");
            System.out.println("               1. TOYOTA             ");
            System.out.println("               2. HONDA               ");
            System.out.println("               3. NISSAN                ");
            System.out.println("               4. SALIR                ");
            System.out.println("------------------------------------------");
            System.out.println("Opcion: ");
            op = opcion.nextInt();
            opcion.nextLine();

            switch(op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion invalida. Vuelva a intentarlo");
                    break;
            }

        }while(op != 4);
    }

    public void MenuMoto() {
        int op = 0;
        do{
            System.out.println("==========================================");
            System.out.println("       .::CATALOGO DE MOTOCICLETAS::.       ");
            System.out.println("==========================================");
            System.out.println("------------------------------------------");
            System.out.println("    Elija la marca de su preferencia  ");
            System.out.println("------------------------------------------");
            System.out.println("               1. YAMAHA            ");
            System.out.println("               2. KAWASAKI               ");
            System.out.println("               3. SUSUKI                ");
            System.out.println("               4. SALIR                ");
            System.out.println("------------------------------------------");
            System.out.println("Opcion: ");
            op = opcion.nextInt();
            opcion.nextLine();

            switch(op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion invalida. Vuelva a intentarlo");
                    break;
            }

        }while(op != 4);
    }
}
