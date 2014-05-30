trait Atacante {

  def potencialOfensivo(): Integer

  def atacarA(defensor: Defensor) = {
    if (this.potencialOfensivo > defensor.potencialDefensivo) {
      defensor.recibirDanio(this.potencialOfensivo - defensor.potencialDefensivo)
    }
  }

}