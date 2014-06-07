import org.junit.Assert._
import org.junit.Test

class AtaquesTestCase {

  @Test
  def conanAtacaAAtila = {
    val atila = new Guerrero
    val conan = new Guerrero

    conan.atacarA(atila)

    assertEquals(90, atila.energia)
  }

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
  
  def testTipadoEstructural () {
     new Espadachin(10, new Maza)
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