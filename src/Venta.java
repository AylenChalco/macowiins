import java.time.LocalDate;

public class Venta {
  LocalDate fecha;
  int cantidad;
  Prenda prenda;
  MedioDePago medioDePago;

  Venta(Prenda prenda, int cantidad, LocalDate fecha, MedioDePago medioDePago){
    this.prenda = prenda;
    this.cantidad = cantidad;
    this.fecha = fecha;
    this.medioDePago = medioDePago;
  }
  public LocalDate devolverFecha() {
    return fecha;
  }
  double valorTotal(){
    return cantidad*prenda.precioPrenda();
  }
}