public class Vehiculo {
    private String Marca;
    private String Modelo;
    private String AFabricacion;
    private String Color;
    private String Kilometraje;
    private String Placa;
    private String Combustible;
    private String Consumo;

    public Vehiculo() {
    }
    

    public Vehiculo(String marca, String Modelo, String AFabricacion, String Color, String Kilometraje, String Placa, String Combustible, String Consumo) {
        this.Modelo = Modelo;
        this.AFabricacion = AFabricacion;
        this.Color = Color;
        this.Kilometraje = Kilometraje;
        this.Placa = Placa;
        this.Combustible = Combustible;
        this.Consumo = Consumo;
        this.Marca = marca;
    }

    

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getAFabricacion() {
        return AFabricacion;
    }

    public void setAFabricacion(String AFabricacion) {
        this.AFabricacion = AFabricacion;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(String Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public String getConsumo() {
        return Consumo;
    }

    public void setConsumo(String Consumo) {
        this.Consumo = Consumo;
    }

    public void MostrarVehiculo(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Año de FabricacionÑ " + getAFabricacion());
        System.out.println("Color: " + getColor());
        System.out.println("Kilometraje: " + getKilometraje());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Tipo de combustible" + getCombustible());
        System.out.println("Consumo: " + getConsumo());
    }
}
