package guerreros.observadores

import guerreros._

class Enfermera extends ObservadorDanio[Guerrero] {

  def notificarDanio(guerrero: Guerrero) =
    if (guerrero.vivo) guerrero.restaurarEnergia()

}