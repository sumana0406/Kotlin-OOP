abstract class Animal(_name: String = "cow") : iAnimal
{

    val animalName = _name

    override fun move(direction: String)
    {
        println("$animalName moves in the $direction direction")
    }

    /*override fun makeASound()
    {
        println("The $animalName made a generic sound")
    }*/
    abstract override fun makeASound()
}