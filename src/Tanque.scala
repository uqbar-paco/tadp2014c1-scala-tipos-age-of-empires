class Tanque extends Guerrero {

  override def atacarA(defensor: Defensor) = {
    defensor.seAtacadoPorUnTanque(this)
  }

  def atacarA(muralla: Muralla) = {
    muralla.recibirDanio(1000)
  }

  def atacarA(guerrero: Guerrero) =
    guerrero.recibirDanio(50)

}