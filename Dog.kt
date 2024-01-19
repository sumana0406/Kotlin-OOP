class Dog(_name:String = "the dog") :Animal(_name)
{
    override fun makeASound()
    {
        bark()
        //println("$animalName made a generic sound")
    }

    private  fun bark()
    {
        println("$animalName barks")
    }
}