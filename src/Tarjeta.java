public class Tarjeta implements MedioDePago {
  int cantCuotas;
  double valorFijo;

  Tarjeta(int cantCuotas, double valorFijo){
    this.cantCuotas = cantCuotas;
    this.valorFijo = valorFijo;
  }
  public double recargo(Prenda prenda) {
    return this.cantCuotas * this.valorFijo + 0.01 * prenda.precioPrenda();
  }
}