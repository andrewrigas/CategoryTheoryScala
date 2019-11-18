package category.theory


object Categories {

  trait Group[A] {
    def compose(a1: A, a2: A): A
  }

  trait Monoid[A] extends Group[A] {
    def identity: A
  }

  trait Semigroup[A] extends Monoid[A]{
    def combine(a1: A, a2: A): A
  }

  val intSemiGroupSum = new Semigroup[Int] {
    override def combine(a1: Int, a2: Int): Int = a1 + a2

    override def identity: Int = 0

    override def compose(a1: Int, a2: Int): Int = ???
  }

  val intSemiGroupProduct = new Semigroup[Int] {
    override def combine(a1: Int, a2: Int): Int = a1 * a2

    override def identity: Int = 1

    override def compose(a1: Int, a2: Int): Int = ???
  }

  val stringSemiGroupConcat = new Semigroup[String] {
    override def combine(a1: String, a2: String): String = s"$a1$a2"

    override def identity: String = ""

    override def compose(a1: String, a2: String): String = ???
  }

}
