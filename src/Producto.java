public class Producto {
    private String Nombre;
    private int Cantidad;
    private int Precio;
    private String Codigo;

    public Producto() {
        this.Nombre = "";
        this.Cantidad = 0;
        this.Precio = 0;
        this.Codigo = "";
    }

    public Producto (String nombre, int cantidad, int precio, String codigo){
        this.Nombre = nombre;
        this.Cantidad = cantidad;
        this.Precio = precio;
        this.Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public int getCantidad (){
        return Cantidad;
    }

    public int getPrecio(){
        return Precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setNombre(String nombre){
        this.Nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.Precio = precio;
    }

    public void setCodigo(String codigo){
        this.Codigo = codigo;
    }

    public void MostrarProducto() {
        System.out.println("-----------------------------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("-----------------------------");
        return;
    }

}
