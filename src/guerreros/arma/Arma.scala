package guerreros.arma

trait Arma[A] {
  def potencialOfensivo(cosa: A): Int
} 
