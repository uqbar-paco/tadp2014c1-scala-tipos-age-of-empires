package guerreros.observadores

import guerreros.Muralla
import guerreros.ObservadorDanio

class Reparador extends ObservadorDanio[Muralla] {

  def notificarDanio(muralla: Muralla) {
    muralla.reparar(2)
  }

}