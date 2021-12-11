class Person(var name:String,var age:Int) extends Ordered[Person] {
  def compare(that: Person): Int = {
    this.name compare that.name match {
      case 0 => {
        if (this.age.equals(that.age))
          println("\nBoth the Person have same name and age then return \nTrue")
        else
          println("\nBoth the Person doesn't have same name and age then return \nFalse");
        0
      }
      case other => {
        if (this.name.length.equals(that.name.length) && this.age.equals(that.age))
          println("True");
        else
          println("False");
        1
      }
    }
  }
}
object Person extends  App{
  var personOne = new Person("Kirti",23)
  var personTwo = new Person("Nayanita",24)
  personOne compare personTwo
}
