package guerreros

class Guerrero extends Atacante with Defensor {

  var energia = 100

  def potencialOfensivo = 30
  def potencialDefensivo = 20

  def setEnergia(energia: Integer) = this.energia = energia
  def getEnergia = energia

  def seAtacadoPorUnTanque(tanque: Tanque) =
    tanque.atacarA(this)

  def vivo = energia > 0

  def restaurarEnergia() =
    energia = 100
}