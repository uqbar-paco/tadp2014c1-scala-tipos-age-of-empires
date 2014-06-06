class Muralla extends Defensor {

  var energia = 500

  def setEnergia(energia: Integer) = this.energia = energia
  def getEnergia = energia

  def potencialDefensivo(): Integer = 25

  def seAtacadoPorUnTanque(tanque: Tanque) =
    tanque.atacarA(this)

}