package guerreros
import arma._
class Espadachin[A: Arma](
  val habilidad: Float,
  val espada: A) extends Guerrero {

  override def potencialOfensivo = {
    super.potencialOfensivo +
      (implicitly[Arma[A]].potencialOfensivo(espada) * this.habilidad).round
  }
}

