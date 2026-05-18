public class Carro extends Vehiculo {
    private String Tipo;
    private String Motor;
    private String Cilindraje;
    private String Suspension;
    private String Tamaño;
    private String Traccion;
    
    public Carro() {

    }

    public Carro (String Motor, String Cilindraje, String Suspension, String Tamaño, String Traccion, String tipo, String marca, String modelo, String AFabricacion, String Color, String Kilometraje, String Placa, String Combustible, String Consumo){
        
        super(marca, modelo, AFabricacion, Color, Kilometraje, Placa, Combustible, Consumo);
        this.Tipo = tipo;
        this.Motor = Motor;
        this.Cilindraje = Cilindraje;
        this.Suspension = Suspension;
        this.Tamaño = Tamaño; 
        this.Traccion = Traccion;
                
    }
    
    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setMotor(String motor) {
        this.Motor = motor;
    }

    public String getMotor() {
        return Motor;
    }

    public void setCilindraje(String cilindraje) {
        this.Cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return Cilindraje;
    }

    public void setSuspension(String suspension) {
        this.Suspension = suspension;
    }

    public String getSuspension() {
        return Suspension;
    }

    public void setTamaño(String tamaño) {
        this.Tamaño = tamaño;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTraccion (String traccion) {
        this.Traccion = traccion;
    }

    public String getTraccion() {
        return Traccion;
    }
}
