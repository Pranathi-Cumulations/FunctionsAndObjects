
interface  demo{
    var x : Int
    var y : String

    fun printProps()
}

open class A(x: Int) {
    public open val y: Int = x
}

interface B {
    val z : Int
}
fun main() {

    //creating anonymous objects from the scratch
    var anonymousObject = object {
        var x: Int = 5
        var y: String = "from scratch"

        fun printProperties(){
            println("x : $x y: $y")
        }
    }

    //creating an anonymous objects of a superclass or an interface

     var anonymousObject2 = object : demo{
         override var x: Int = 5

         override var y: String = "five"

         override fun printProps() {
            println("x : $x  y : $y")
         }

         fun extraFunction(){
             println("we can add extra functions to the anonymous objects that extends classes or interfaces")
         }

     }

    //copied from the doc to check the type of the anonymous object since it is extending a class and an interface

    // #observation its better to not do explicit declaration of the type of the anonymous object that inherits from two super classes , if we do so
    // we might not be able to access the properties of the ignored class
    val ab : B = object : A(1), B {
        override val z = 15
    }
    //from the above anonymous object we cannot access the x of the A class

    val ab1 : A = object : A(1), B {
        override val z = 15
    }
    //from the above anonymous objects  we cannot access the z of the B class

}

