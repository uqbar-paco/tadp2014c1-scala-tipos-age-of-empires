package guerreros

trait Atacante {

  def potencialOfensivo: Integer

  def atacarA(defensor: Defensor) = {
    if (potencialOfensivo > defensor.potencialDefensivo) {
      defensor.recibirDanio(potencialOfensivo
        - defensor.potencialDefensivo)
    }

  }

}