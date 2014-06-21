package guerreros.arma

import guerreros.objetos.Espada
import guerreros.objetos.Maza

package object instancias {

  implicit val armaEspada: Arma[Espada] = new ArmaEspada
  implicit val armaMaza: Arma[Maza] = new ArmaMaza

  class ArmaEspada extends Arma[Espada] {
    def potencialOfensivo(espada: Espada) =
      espada.potencial
  }

  class ArmaMaza
    extends Arma[Maza] {
    def potencialOfensivo(maza: Maza) = 10
  }
}