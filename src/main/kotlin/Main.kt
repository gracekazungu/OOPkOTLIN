fun main(){
var tesla=Car("Tesla","Model Y","KCC 462G",0)
    println(tesla.model)
    tesla.start()
    println(tesla.speed)
    tesla.accelerate(50)
    tesla.accelerate(40)
    println(tesla.speed)
    tesla.deccelerate(50)
    println(tesla.speed)
    tesla.hoot()
    tesla.stop()
    println(tesla.speed)
    val toyota=Car("Toyota","Land cruiser","KCX 234Y",0)
    toyota.start()
    var myBook=Book("Born a crime","Trever Noah",288,"John Muria")
    println(myBook.title)
    println(myBook.author)
    var ages= arrayOf(12,65,45)
    val statistics=calculateAgeStatistics(ages)
}
class Car(var make:String, var model:String,  var registration:String, var speed: Int){
    fun start(){
        println("Vroom vroom")
    }
    fun accelerate(acceleration:Int){
        speed+= acceleration
    }
    fun deccelerate(decceleration:Int){
        speed-=decceleration
    }
    fun hoot(){
        println("beep beep")
    }
    fun stop(){
        speed=0
    }

}
data class Book(var title:String,var author:String,var pages:Int,var publisher:String){

}
data class AgeStats(var minage:Int,var maxage:Int,var avgage:Double,val classroom:String)
fun calculateAgeStatistics(ages:Array<Int>):AgeStats{
    val min=ages.min()
    val max=ages.max()
    val avg=ages.average()
    val room="Adalab"
    val stats=AgeStats(min,max,avg,room)
    return stats
}
