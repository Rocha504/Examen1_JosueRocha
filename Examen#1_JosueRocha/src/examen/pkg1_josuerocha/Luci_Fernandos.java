 
package examen.pkg1_josuerocha;

/**
 *
 * @author josue
 */
public class Luci_Fernandos extends Personas{
    
    private int desaparecidos;

    public Luci_Fernandos() {
        super();
    }

    public Luci_Fernandos(int desaparecidos) {
        this.desaparecidos = desaparecidos;
    }

    public Luci_Fernandos(int desaparecidos, String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
        this.desaparecidos = desaparecidos;
    }

    public int getDesaparecidos() {
        return desaparecidos;
    }

    public void setDesaparecidos(int desaparecidos) {
        this.desaparecidos = desaparecidos;
    }

    @Override
    public String toString() {
        return super.toString()+"Luci_Fernando{" + "desaparecidos=" + desaparecidos + '}';
    }
    
    
    
    
    
    
}
