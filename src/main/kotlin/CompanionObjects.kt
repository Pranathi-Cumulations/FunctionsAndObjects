class CompanionObjectsExample{
    private val classInt = 10
    companion object Named{
        private val companionInt = 5
        fun createInstance():CompanionObjectsExample{
            return CompanionObjectsExample()
        }
    }

    fun usePropOfCompanion(){
        println(companionInt)  //we can access the  private members of the companion objects in the class but the vice versa is not true
    }
}

class CompanionObjectsWithNoName{
    companion object {
        fun createInstance():CompanionObjectsWithNoName{
            return CompanionObjectsWithNoName()
        }
    }
}

fun main(){
    //there ae various ways of declaring the instaces
    var instance = CompanionObjectsExample.Named.createInstance();
    var instance2 = CompanionObjectsWithNoName.Companion.createInstance();

    //in both the cases we can exclude the middle part of the function calling as we can see it is already greyed oout
}