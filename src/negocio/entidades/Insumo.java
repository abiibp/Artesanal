package negocio.entidades;

/**
 *
 * @author PIX
 */
public abstract class Insumo {
    
    private final int ID_INSUMO_;
    
    private String nombre_;
    private String descripcion_;
    private float  costo_;
    private int    cantidad_;

    public Insumo(int IDInsumo, String nombre, float costo) {
        this.ID_INSUMO_ = IDInsumo;
        this.nombre_ = nombre;
        this.costo_ = costo;
    }
    
    public String obtenerNombre() {
        return nombre_;
    }

    public void establecerNombre(String nombre) {
        this.nombre_ = nombre;
    }

    public String obtenerDescripcion() {
        return descripcion_;
    }

    public void establecerDescripcion(String descripcion) {
        this.descripcion_ = descripcion;
    }

    public float obtenerCosto() {
        return costo_;
    }

    public void establecerCosto(float costo) {
        this.costo_ = costo;
    }
    
}
