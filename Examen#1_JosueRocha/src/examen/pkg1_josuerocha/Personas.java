 
package examen.pkg1_josuerocha;

/**
 *
 * @author josue
 */
public class Personas {
    
    private String nombre;
    private int edad;
    private String sexo;
    private Armas arma;

    public Personas() {
    }

    public Personas(String nombre, int edad, String sexo, Armas arma) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.arma = arma;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
    
    
}
