package guerreros

trait ObservadorDanio[-A] {

  def notificarDanio(daniado:A)
}