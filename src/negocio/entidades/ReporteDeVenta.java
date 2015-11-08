package negocio.entidades;

import java.util.ArrayList;

/**
 *
 * @author Astrid Briceño
 */
public class ReporteDeVenta {

    private final int ID_REPORTE_;
    private final String DESCRIPCION_;

    private ArrayList<ElementoVenta> nVentas_;

    public ReporteDeVenta(int IDReporte, String descripcion, ArrayList<ElementoVenta> ventas) {
        this.ID_REPORTE_ = IDReporte;
        this.DESCRIPCION_ = descripcion;
        this.nVentas_ = ventas;
    }

    public int obtenerIDReporte() {
        return ID_REPORTE_;
    }

    public String obtenerDescripcion() {
        return DESCRIPCION_;
    }

    public ArrayList<ElementoVenta> obtenerVentas() {
        return nVentas_;
    }

    public boolean isVentaEnReporte(int IDVentaABuscar) {
        return true;
    }

    public void agregarVenta(ElementoVenta unaVenta) {
        this.nVentas_.add(unaVenta);
    }

    public void eliminarVenta(ElementoVenta unaVenta) {
        ElementoVenta ventaAEliminar = unaVenta;
        this.nVentas_.remove(ventaAEliminar);
    }

    public String imprimirReporte() {
        final String RETORNO_DE_CARRO = "\n";
        return this.DESCRIPCION_ + 
                RETORNO_DE_CARRO + 
                this.ID_REPORTE_ + 
                RETORNO_DE_CARRO + 
                this.nVentas_.toString().replace(
                        ", ", RETORNO_DE_CARRO).replace("[", "").replace("]", ""
                        );
    }
}
