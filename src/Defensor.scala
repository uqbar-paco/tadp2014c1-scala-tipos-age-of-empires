trait Defensor {
  
  def recibirDanio(danio: Integer) = {
    val nuevaEnergia = getEnergia - danio
    this.setEnergia(nuevaEnergia)
  }

  def setEnergia(energia: Integer)
  def getEnergia: Integer
  def potencialDefensivo: Integer

  def seAtacadoPorUnTanque(tanque: Tanque)
  
}