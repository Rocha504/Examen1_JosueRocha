 
package examen.pkg1_josuerocha;

/**
 *
 * @author josue
 */
public class Armas {
    
    String tipo;
    int damage;

    public Armas() {
    }

    public Armas(String tipo, int damage) {
        this.tipo = tipo;
        this.damage = damage;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    
    
}
