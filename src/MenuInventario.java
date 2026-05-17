import java.util.Scanner;
public class MenuInventario {
    public static Scanner leer = new Scanner(System.in);
    Producto[] inventario = new Producto[100];
    int TotalProductos = 0;
    public MenuInventario() {

    }

    public void Inventario() {
        System.out.println("=================================");
        System.out.println("     .::INVENTARIO DIGITAL::.    ");
        System.out.println("=================================");
        int op = 0;

        do{
            System.out.println("===================================");
            System.out.println("1. AGREGAR PRODUCTO");
            System.out.println("2. RETIRAR PRODUCTO");
            System.out.println("3. BUSCAR PRODUCTO");
            System.out.println("4. MOSTRAR PRODUCTOS DISPOBLES");
            System.out.println("5. SALIR DEL INVENTARIO");

            System.out.print("Ingrese la opcion deseada: ");
            op = leer.nextInt();
            leer.nextLine();

            switch(op){
                case 1:
                    System.out.println("=====================================");
                    System.out.println("        .::AGREGAR PRODUCTO::.       ");
                    System.out.println("=====================================");
                    
                    System.out.println("Cuantos productos desea agregar: ");
                    int cantidad = leer.nextInt();
                    leer.nextLine();

                    System.out.println("-------------------------------------");
                    AgregarProducto(cantidad);
                    break;
                case 2:
                    System.out.println("========================================");
                    System.out.println(".::RETIRO DE PRODUCTO DEL INVENTARIO::.");
                    System.out.println("========================================");

                    System.out.println("---------------------------------------");
                    System.out.print("Ingrese el codigo del producto: ");
                    String codigo = leer.nextLine();
                    RetirarProducto(codigo);
                    break;
                case 3:
                    System.out.println("========================================");
                    System.out.println("     .::BUSQUEDA EN EL INVENTARIO::.    ");
                    System.out.println("========================================");

                    System.out.println("---------------------------------------");
                    System.out.print("Ingrese el codigo del producto: ");
                    String codigos = leer.nextLine();
                    BuscarProducto(codigos);
                    break;
                case 4:
                    for(int i = 0; i < TotalProductos; i++){
                        if(inventario[i] == null){
                            System.out.println("No hay productos registrados");
                        }

                        inventario[i].MostrarProducto();
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion invalida, vuelva a intentarlo");
                    break;
            }
            
        }while(op != 5);
    }

    public void AgregarProducto(int cantidad) {
        for(int i = 0; i < cantidad; i++){
            Producto producto = new Producto();
            System.out.print("Nombre del producto: ");
            String Nombre = leer.nextLine();
            producto.setNombre(Nombre);

            System.out.print("\nCantidad del producto: ");
            int Cantidad = leer.nextInt();
            leer.nextLine();
            producto.setCantidad(Cantidad);

            System.out.print("\nPrecio del producto: ");
            int Precio = leer.nextInt();
            leer.nextLine();
            producto.setPrecio(Precio);

            System.out.print("\nCodigo del producto");
            String Codigo = leer.nextLine();
            producto.setCodigo(Codigo);

            inventario[TotalProductos] = producto;
            TotalProductos++;
        }
    }

    public void RetirarProducto(String codigo) {
        for(int i = 0; i < TotalProductos; i++){

            if(inventario[i].getCodigo().equals(codigo)){
                inventario[i] = null;

                System.out.println("Producto eliminado del inventario");
                return;
            }

        }
        
        System.out.println("El producto no se encuentra en el inventario");
    }

    public void BuscarProducto(String codigo){
         for(int i = 0; i < TotalProductos; i++){
            if(inventario[i].getCodigo().equals(codigo)){
                inventario[i].MostrarProducto();
                return;
            }
        }

        System.out.println("Producto no encontrado. Intente con otro codigo");
    }
    
}
