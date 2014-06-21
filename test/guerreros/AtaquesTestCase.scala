package guerreros

import org.junit.Assert._
import org.junit.Test

import objetos._
import arma._
import arma.instancias._
import guerreros.observadores._

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

  @Test
  def `los reparadores reponen dos ladrillos despues del ataca`() {
    val muralla = new Muralla

    muralla agregarObservadorDanio new Reparador

    muralla.recibirDanio(100)

    assertEquals((500 - 100) + (2 * 2), muralla.energia)
  }

  @Test
  def `las enfermeras dejan a los guerreros como nuevos mientras esten vivos`() {
    val guerrero = new Guerrero

    guerrero agregarObservadorDanio new Enfermera

    guerrero.recibirDanio(40)

    assertEquals(100, guerrero.energia)
  }

  def `test tipado estructural (me basta con mostrar que compila)`() {
    new Espadachin(10, new Espada(20))

    new Espadachin(10, new Maza)
  }

  def sumaGenerica[A: Numeric](x: A, y: A) =
    implicitly[Numeric[A]].plus(x, y)

}