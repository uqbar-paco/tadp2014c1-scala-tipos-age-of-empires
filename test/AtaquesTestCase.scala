import org.junit.Test
import org.junit.Assert._

class AtaquesTestCase {

  @Test
  def conanAtacaAAtila = {
    val atila: Defensor = new Guerrero
    val conan: Atacante = new Guerrero
    val otroConan = conan

    otroConan.atacarA(atila)

    assertEquals(90, atila.getEnergia)
  }

  @Test
  def investigando = {
    val tanque = new Tanque
    val atila = new Guerrero
    val muralla = new Muralla

    hacerPelear(tanque, atila)
    hacerPelear(tanque, muralla)

    assertEquals(50, atila.getEnergia)
    assertEquals(100, tanque.getEnergia)
    assertEquals(-500, muralla.getEnergia)
  }

  def hacerPelear(atacante: Atacante, defensor: Defensor) =
    atacante.atacarA(defensor)

  //  @Test
  //  def atacarDefensorSobreescrito = {
  //    val tanque = new Tanque
  //    val atila = new Guerrero
  //
  //    tanque.atacarA(atila)
  //
  //    assertEquals(200, tanque.getEnergia)
  //    assertEquals(90, atila.getEnergia)
  //  }

  @Test
  def espadachinAtacaConMasDanio = {
    val atila = new Guerrero
    val leono = new Espadachin(0.5f, new Espada(50))

    leono.atacarA(atila)

    assertEquals(65, atila.energia)
  }

  @Test
  def guerreroAtacaMuralla = {
    val atila = new Guerrero
    val muralla = new Muralla

    atila.atacarA(muralla)

    assertEquals(495, muralla.energia)
  }

  @Test
  def misilAtacaAGuerrero = {
    val atila = new Guerrero
    val misil = new Misil

    misil.atacarA(atila)

    assertEquals(30, atila.energia)
  }

  //  @Test
  //  def guerreroAtacaAMisil = {
  //    val atila = new Guerrero
  //    val misil = new Misil
  //
  //    atila.atacarA(misil)
  //  }

  //  @Test
  //  def murallaAtacaAGuerrero = {
  //    val atila = new Guerrero
  //    val muralla = new Muralla
  //
  //    muralla.atacarA(atila)
  //  }
}