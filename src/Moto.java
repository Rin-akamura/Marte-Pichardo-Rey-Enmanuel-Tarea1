public class Moto extends Vehiculo {

    private String Tipo;
    private String Cilindraje;
    private String TipoManubrio;
    private String TipoFreno;
    private String Transmision;
    private String TipoEscape;

    public Moto() {

    }

    public Moto(String Tipo, String Cilindraje, String TipoManubrio, String TipoFreno, String Transmision, String TipoEscape, String marca, String modelo, String AFabricacion, String Color, String Kilometraje, String Placa, String Combustible, String Consumo){

        super(marca, modelo, AFabricacion, Color, Kilometraje, Placa, Combustible, Consumo);

        this.Tipo = Tipo;
        this.Cilindraje = Cilindraje;
        this.TipoManubrio = TipoManubrio;
        this.TipoFreno = TipoFreno;
        this.Transmision = Transmision;
        this.TipoEscape = TipoEscape;
    }

    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }

    public String getTipo(){
        return Tipo;
    }

    public void setCilindraje(String Cilindraje){
        this.Cilindraje = Cilindraje;
    }

    public String getCilindraje(){
        return Cilindraje;
    }

    public void setTipoManubrio(String TipoManubrio){
        this.TipoManubrio = TipoManubrio;
    }

    public String getTipoManubrio(){
        return TipoManubrio;
    }

    public void setTipoFreno(String TipoFreno){
        this.TipoFreno = TipoFreno;
    }

    public String getTipoFreno(){
        return TipoFreno;
    }

    public void setTransmision(String Transmision){
        this.Transmision = Transmision;
    }

    public String getTransmision(){
        return Transmision;
    }

    public void setTipoEscape(String TipoEscape){
        this.TipoEscape = TipoEscape;
    }

    public String getTipoEscape(){
        return TipoEscape;
    }

    public void MostrarMoto() {
        System.out.println("=====================================");
        System.out.println("       .::" + getModelo() + "::.         ");
        System.out.println("=====================================");
        
        System.out.println("-------------------------------------");
        super.MostrarVehiculo();
        System.out.println("Tipo: " + getTipo());
        System.out.println("Cilindraje: " + getCilindraje());
        System.out.println("Tipo de Manubrio: " + getTipoManubrio());
        System.out.println("Tipo de Freno: " + getTipoFreno());
        System.out.println("Transmision: " + getTransmision());
        System.out.println("Tipo de Escape: " + getTipoEscape());
        System.out.println("--------------------------------------");
    }
}