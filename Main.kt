//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    /*val dog0:Animal = Dog("Shubhrak")
    dog0.move("Forward")
    dog0.makeASound()

    val cat: Animal = Cat("Chi")
    cat.move("right")
    cat.makeASound()
    */
    val dog:Animal = Dog("Shubhrak")
    moveAndMakeASound(dog)
    val cat: Animal = Cat("Chi")
    moveAndMakeASound(cat)

    val m: Mouse = Mouse()
    moveAndMakeASound(m)
    var a: Int = m.cheeseAmount(1)
    m.eatCheese()


}

fun moveAndMakeASound(animal: Animal)
{

    animal.move("forward")
    animal.makeASound()
}