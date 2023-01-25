
//Extension functions are here

//Extension functions are statically implemented
//so while declaring the extension function for a class that contains super class we need to be clear about the type .
class ExtensibleClass {

}

//companionObject extensionFunction helps to call the extension functions without creating an object
// the only condition is that the class should contain companion object component

class ExtensionExample{
    companion object{

    }
}


fun main(){
    fun ExtensibleClass.printSomething(){
        println("extension function is called")
    }

    fun ExtensionExample.Companion.printSomething(){
        println("companion object extension funxtion is called")
    }

    var extensibleObject = ExtensibleClass()
    extensibleObject.printSomething()
}
