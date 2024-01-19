class Cat(_name:String = "the cat"): Animal(_name)
{
    override fun makeASound()
    {
        meow()
     //   println("The $animalName said meow")
    }

    private  fun meow()
    {
        println("$animalName says meow")
    }

}