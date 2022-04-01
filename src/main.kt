fun main(){
    var car=Car("rav","rav4","blue",24)
    car.carry(79)
    car.identity()
    var fee=car.calculateparkingfee(5)
    println(fee)
    var rag=Bus("suzu","new","blue",56)
    rag.maxTripFare(5.0)
    var busfee=rag.calculateparkingfee(7)
    println(busfee)

}
class Baker
//create class Car with the following attributes make model color capacity it has these functions
open class Car(var make:String,var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        var x=people-capacity
        if (people<=capacity){
            println("carrying $people passengers")

        }
        else println("over capacity$x passengers")

    }
    fun identity(){
        println("i am a $color $make $model")
    }
    open fun calculateparkingfee(hours:Int):Int{
        var fee=hours*20
        return fee

    }

}
 class Bus(make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity){


fun maxTripFare(fare: Double):Double{
    var money = fare * capacity
    println(money)
    return money
}


     }
