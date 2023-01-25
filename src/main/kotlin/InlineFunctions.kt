//inline functions reduces the overhead of creating scope for the lambda functions
var lambda1 ={A: String -> println(A)}
var lambda2 ={println("print something")}


inline fun LambdaCall(first : (String) -> Unit , second : () -> Unit){
    first("this is the first lambda function")
    second()
}

inline fun LambdaCall2(first : (String) -> Unit , second : () -> Unit){
    first("this is the first lambda function")
    second()
}

inline fun LambdaCallwithCrossinLine(crossinline first : (String) -> Unit , second : () -> Unit){
    first("this is the first lambda function")
    second()
}

inline fun LamdaCallwithNoInline(noinline first : (String) -> Unit , second : () -> Unit){
    first("this is the first lambda function")
    second()
}


fun main(){
    LambdaCall(lambda1,lambda2)
    LambdaCall2({A: String -> println(A) ;return},{println("print something")}) //the return in this function terminating the main thread itself
    LambdaCallwithCrossinLine({A: String -> println(A)},{println("print something")})
            //usage of return will not be available for the firts lambda function here because of crossinline
    LamdaCallwithNoInline({A: String -> println(A)},{println("print something")})
         //here as well the return is not allowed for the first parameter since it is no longer inline


}