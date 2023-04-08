public class Prenda {
  double precio;
  TipoPrenda tipo;
  Estado estado;

  Prenda(TipoPrenda tipo, double precio, Estado estado, RegistroVenta registro) {
    this.tipo = tipo;
    this.precio = precio;
    this.estado = estado;
  }

  double precioPrenda() {
    return estado.precioEstado(this.precio);
  }

  enum TipoPrenda {
    SACO, PANTALON, CAMISA;
  }

}
