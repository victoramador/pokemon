
public class Persona{
    private String DNI;
    private String num_seguridad_social;
    private String nombre;
    private String apellidos;
    private int edad;
    private Double salario;

    public Persona(String DNI, String num_seguridad_social, String nombre, String apellidos, int edad, Double salario) {
        this.DNI = DNI;
        this.num_seguridad_social = num_seguridad_social;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNum_seguridad_social() {
        return num_seguridad_social;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNum_seguridad_social(String num_seguridad_social) {
        this.num_seguridad_social = num_seguridad_social;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", num_seguridad_social='" + num_seguridad_social + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
