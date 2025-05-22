public class Estudiante extends Persona {
    private int codigo;
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int codigo, String carrera) {
        super(nombre, edad);
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
