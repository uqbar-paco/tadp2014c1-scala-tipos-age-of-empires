class Espadachin(val habilidad: Float, val espada: Espada) extends Guerrero {

  override def potencialOfensivo = super.potencialOfensivo + (espada.potencialOfensivo * this.habilidad).round

}

class Espada(val potencialOfensivo: Integer) {

}