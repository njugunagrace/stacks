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

    var q = Queue(5)
    q.enQueue(1)
    q.enQueue(2)
    q.enQueue(3)
    q.deQueue()
    q.enQueue(45)
    q.display()


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

class Queue(var capacity: Int) {
    var data = IntArray(capacity)
    var front = 0
    var rear = 0

    fun enQueue(value : Int) {
        if (isFull()){
            println("Queue is full")
            return
        }
        data[rear] = value
        rear++
    }

    fun deQueue():Int? {
        if(isEmpty()){
            println("Queue is empty")
            return null
        }
        var remove = data[front]
        for (i in front until rear+1){
            data[i] = i+1
        }
        rear--
        return remove
    }

    fun peek(): Int? {
        if (isEmpty()) {
            return null
        }
        return data[front]
    }

    fun isFull(): Boolean {
        return rear == capacity

    }

    fun isEmpty(): Boolean {
        return front == rear

    }

    fun display() {
        if (isEmpty()){
            return
        }
        for (i in front until rear ){
            println(data[i])

        }

    }

}