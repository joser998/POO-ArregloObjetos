
public class Alumno {
    //Atributos
    private String nombre;
    private int matricula;
    private char grupo;
    private int grado;

    public Alumno(String nombre, int matricula, char grupo, int grado) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.grupo = grupo;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    
    
    
    
    
    
    
    
}
