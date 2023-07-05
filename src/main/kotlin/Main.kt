fun main(){
//    val myStack=Stack()
//    println(myStack.pop())
//    myStack.push(7)
//    myStack.push(89)
//    myStack.push(78)
//    println(myStack.peek())
//    println(myStack.pop())
//    println(myStack.peek())
//    myStack.push(58)
//    myStack.push(8)
//    myStack.push(25)
//    var x=myStack.pop()
//    var y=myStack.pop()
//    var z=x!!+y!!
//    println(z)

    var str="hello"
    var result= mutableListOf<Char>()
    var stack=Stack()
    str.forEach { x->stack.push(x) }
    while (!stack.isEmpty()){
        result.add(stack.pop()!!)

    }
    println(result.joinToString (""))




}
class Stack{
    var data= mutableListOf<Char>()

    fun push(value:Char){
        data.add(value)
    }
    fun pop():Char?{
        if(data.isEmpty()){
            return null
        }
        val top=data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return  top
    }
    fun peek():Char?{
        if(data.isEmpty()){
            return null
        }
        return data[data.lastIndex]

    }
    fun isEmpty():Boolean{
        return data.isEmpty()
    }
}

