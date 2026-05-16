public class Estudiante {
    private String Nombre;
    private String Apellido;
    private String Matricula;
    private String Carrera;
    private int Semestre;
    private String Universidad;

    public Estudiante() {
        this.Nombre = "";
        this.Apellido = "";
        this.Matricula = "";
        this.Carrera = "";
        this.Semestre = 0;
        this.Universidad = "";
    }

    public Estudiante(String nombre, String apellido, String matricula, String carrera, int semestre, String universidad ){
        this.Nombre = nombre;
        this.Apellido = apellido; 
        this.Matricula = matricula;
        this.Carrera = carrera;
        this.Semestre = semestre;
        this.Universidad = universidad;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public String getApellido() {
        return Apellido;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getCarrera() {
        return Carrera;
    }

    public int getSemestre() {
        return Semestre;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public void setMatricula (String matricula){
        this.Matricula = matricula;
    }

    public void setCarrera(String carrera) {
        this.Carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.Semestre = semestre;
    }

    public void setUniversidad(String universidad) {
        this.Universidad = universidad;
    }

    public void MostrarEstudiante() {
        System.out.println("====================");
        System.out.println("  .::Estudiante::.  ");
        System.out.println("====================");
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() +"\nMatricula: " + getMatricula() +
                         "\nCarrera: " + getCarrera() + "\nSemestre: " + getSemestre() + "\nUniversidad: " + getUniversidad());
    }
}
