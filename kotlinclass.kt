//import java.util.*
//fun main(a:Array<String>)
//{
//    var hout = student()
//    hout.name = "hout"
//    hout.age = 18
//
//    println("hout.id")
//    println("hout.name")
//    println("hout.age")
//}
//class student()
//{
//    var id:Int = 0
//    var name:String = ""
//    var age:Int = 0
//
//    fun setVal(id:Int)
//    {
//        this.id = id
//    }
//    fun setVal(id:Int, name:String)
//    {
//        this.id = id
//        this.name= name
//    }
//    fun setVal(id:Int, name:String, age:Int)
//    {
//        this.id = id
//        this.name= name
//        this.age = age
//    }
//}


//import java.util.*
//fun main(a:Array<String>)
//{
//    for(i:Int in 0..20 step 2)
//    {
//        println(i)
//    }
//    for(i:Int in 100 downTo 1 step 10)
//    {
//        println(i)
//    }
//}

//import java.util.*
//fun main(a:Array<String>)
//{
//    outer@ for(j:Int in 1..10)
//    {
//        inner@ for(i:Int in 1..10)
//        {
//            println(i)
//            if(i==5)
//            {
//                println("Breaking loop...")
//                break@outer
//            }
//        }
//        println("*****outer loop*****")
//    }
//}

//import java.util.*
//fun main(a:Array<String>)
//{
//    outer@ for(j:Int in 1..10)
//    {
//
//        inner@ for(i:Int in 1..50)
//            {
//                if (i == 35)
//                {
//                    println("Breaking loop....")
//                    break@outer
//                }
//                else if(i%2==0)
//                {
//                    continue@inner
//                }
//                println(i)
//            }
//        println("****outer loop****")
//    }
//}

import java.util.*
fun main(a:Array<String>)
{
    var st = StudentTest()
    st.test()
    st.test(200)
    st.test(130, "Soknoy")
    st.test(135, "Chunneng", 120)

}
class StudentTest
{
    fun test(id:Int=100, name:String="Srey sa", age:Int=65)
    {
        println("Id : $id")
        println("Name : $name")
        println("Age : $age")
    }
}