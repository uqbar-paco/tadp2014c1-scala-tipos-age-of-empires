object `package` {
  
  type Arma = { def potencialOfensivo: Int }
  
  class Espada(val potencialOfensivo: Int)

  class Maza {
    def potencialOfensivo = 10
  }
  
  class Espadachin(
    val habilidad: Float,
    val espada: Arma) extends Guerrero {
    override def potencialOfensivo = {
      super.potencialOfensivo + (espada.potencialOfensivo * this.habilidad).round
    }
  }
}

