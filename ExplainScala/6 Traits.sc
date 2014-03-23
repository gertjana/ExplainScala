sealed trait Animal extends MakesSound {
  def legs:Int
  def hasBacon = this.isInstanceOf[Pig]
}

trait Bird extends Animal
trait Mammal extends Animal
trait Reptile extends Animal


trait MakesSound {
  def sound:String = { "....." }
}
class Turkey extends Bird {
  def legs = 2
  override def sound = "kluck kluck"
}

class Pig extends Mammal {
  def legs = 4
  override def sound = "knor knor"
}
val turkey = new Turkey()
turkey.sound
turkey.legs
turkey.hasBacon
turkey.isInstanceOf[Bird]
turkey.isInstanceOf[Mammal]

val pig = new Pig()
pig.sound
pig.legs
pig.hasBacon
pig.isInstanceOf[Bird]
pig.isInstanceOf[Animal]

