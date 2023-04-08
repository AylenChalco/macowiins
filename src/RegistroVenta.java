import java.time.LocalDate;
import java.util.List;

public class RegistroVenta {
  List<Venta> ventas;

  public void guardarVenta(Venta venta){
    ventas.add(venta);
  }
  double mostrarGanancia(LocalDate fecha){
    return ventas.stream().filter(venta -> venta.devolverFecha().isEqual(fecha)).mapToDouble(venta->venta.valorTotal()).sum();

  }
}