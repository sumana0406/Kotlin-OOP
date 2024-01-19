
class Mouse(_name:String = "jerry"): Animal(_name) {
    private var cheeseAmount1: Int = 0
    override fun makeASound()
    {
        squeak()
    }

    public fun cheeseAmount(x: Int): Int
    {
        cheeseAmount1 += x
        println("the amount of cheese now is $cheeseAmount1")
        return cheeseAmount1
    }

    public fun eatCheese(): Int
    {
        cheeseAmount1 -= 1

        println("the amount of cheese after eating is $cheeseAmount1")
        return cheeseAmount1
    }

    private  fun squeak()
    {
        println("$animalName squeaks")
    }
}
