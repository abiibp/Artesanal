package negocio.entidades;

/**
 *
 * @author PIX
 */
public class Insumo {
    
    private final String ID_;
    
    private String nombre_;
    private double costo_;
    private String unidadMedida_;

    public Insumo(String ID, String nombre, double costo, String unidadMedida) {
        this.ID_ = ID;
        this.nombre_ = nombre;
        this.costo_ = costo;
        this.unidadMedida_ = unidadMedida;
    }

    public String obtenerID() {
        return ID_;
    }

    public String obtenerNombre() {
        return nombre_;
    }

    public void establecerNombre(String nombre) {
        this.nombre_ = nombre;
    }

    public double obtenerCosto() {
        return costo_;
    }

    public void establecerCosto(double costo) {
        this.costo_ = costo;
    }

    public String obtenerUnidadMedida() {
        return unidadMedida_;
    }

    public void establecerUnidadMedida(String unidadMedida) {
        this.unidadMedida_ = unidadMedida;
    }
        
}
