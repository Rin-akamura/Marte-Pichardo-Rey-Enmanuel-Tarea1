import java.util.Scanner;
public class MenuEstudiantes {
    public static Scanner scanner = new Scanner(System.in);
    Estudiante[] ListaEstudiantes = new Estudiante[100];
    int TotalEstudiantes = 0;

    public MenuEstudiantes() {
    }

    public void menu() {
        int op = 0;
        System.out.println("==============================");
        System.out.println(".::BASE DE DATOS ESTUDIANTIL::.");
        System.out.println("==============================");

        do{
            System.out.println("======================================");
            System.out.println("1. .::REGISTRAR ESTUDIANTE::.");
            System.out.println("2. .::BUSCAR ESTUDIANTE::.");
            System.out.println("3. .::MOSTRAR ESTUDIANTES ACTIVOS::.");
            System.out.println("4. .::SALIR DE LA BASE DE DATOS");
            System.out.println("=======================================");

            System.out.print("Ingrese la opcion deseada: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Cuantos estudiantes deseas agregar");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();
                    AgregarEstudiante(cantidad);
                    break;
                case 2:
                    System.out.println("Ingrese la matricula del estudiante");
                    String Matricula = scanner.nextLine();
                    BuscarEstudiante(Matricula);
                    break;
                case 3:
                    for(int i = 0; i < TotalEstudiantes; i++){
                        ListaEstudiantes[i].MostrarEstudiante();
                    }
                    break;
                case 4:
                    break;
            }


        }while(op != 4);
    }

    public void AgregarEstudiante(int cantidad) {     
        for(int i = 0; i < cantidad; i++){
            Estudiante estudiante = new Estudiante();
            System.out.println("Ingrese el nombre del estudiante");
            String Nombre = scanner.nextLine();
            estudiante.setNombre(Nombre);

            System.out.println("Ingrese el Apellido del estudiante");
            String Apellido = scanner.nextLine();
            estudiante.setApellido(Apellido);

            System.out.println("Ingrese la Matricula del estudiante");
            String Matricula = scanner.nextLine();
            estudiante.setMatricula(Matricula);

            System.out.println("Ingrese la Carrera del estudiante");
            String Carrera = scanner.nextLine();
            estudiante.setCarrera(Carrera);

            System.out.println("Especifique el Semestre que cursa el estudiante");
            String Semestre = scanner.nextLine();
            estudiante.setSemestre(Semestre);

            System.out.println("Ingrese la Universidad que pertenece el estudiante");
            String Universidad = scanner.nextLine();
            estudiante.setUniversidad(Universidad);

            ListaEstudiantes[TotalEstudiantes] = estudiante;
            TotalEstudiantes++;
        }
         
         
    }
 
    public void BuscarEstudiante(String Matricula) {
        for(int i = 0; i < TotalEstudiantes; i++){
            if(ListaEstudiantes[i].getMatricula().equals(Matricula)){
                ListaEstudiantes[i].MostrarEstudiante();
                return;
            }
        }
    }
}