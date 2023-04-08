public class Promocion implements Estado {
  int valorFijo;

  Promocion(int valor){
    this.valorFijo = valor;
  }
  public double precioEstado(double unPrecio){
    return unPrecio - valorFijo;
  }
}
