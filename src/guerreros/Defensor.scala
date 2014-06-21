package guerreros

trait Defensor { 
  
  type This = this.type
  
  var observadores = List[ObservadorDanio[This]]()
  
  def agregarObservadorDanio(observador: ObservadorDanio[This]) =
    observadores :+= observador
  
  def recibirDanio(danio: Integer) = {
    val nuevaEnergia = getEnergia - danio
    this.setEnergia(nuevaEnergia)
    observadores.foreach { _.notificarDanio(this) }
  }

  def setEnergia(energia: Integer)
  def getEnergia: Integer
  def potencialDefensivo: Integer

  def seAtacadoPorUnTanque(tanque: Tanque)
  
}