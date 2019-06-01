//var glovar: String = ""
//var gloInt: Int = 0
//var gloFlavor: Float= 0.0f
//
//fun main(a:Array<String>)
//{
//    var x:Int = 100  //tpye inference
//    println(x)
//    //x= "Section C" //show error when assigning the differ//
//
//    x=1000
//    x=2000
//
//    val y: Int = 100
//    //y=2000 // show error while re assigning the value//
//}

//var s:String ="Somnang"
//fun main(a: Array<String>)
//{
//    getStr(s)
//}
//fun getStr(str:String)
//{
//    println("Welcome $str")
//}

//var s:String? = "hout"
//fun main(a:Array<String>)
//{
//    getStr(s)
//}
//fun getStr(str:String?)
//{
//    if(str!=null&&str.length>0)
//    {
//        println("Welcome $str")
//    }
//    else
//    {
//        println("Hello world with Null opject....")
//    }
//}
//fun main(a:Array<String>)
//{    var intVar: Int
//    var LongVar: Long
//
//
//    LongVar = 10000
//    intVar = LongVar.toInt()
//
//    var byteVar:Byte = LongVar.toByte()
//
//    println(byteVar)
//}
//import java.util.*
// fun main(a:Array<String>)
//{
//    val scan = Scanner(System. `in`)
//
//    var name: String
//    var age:Int
//    println("Enter name and age: ")
//    name = scan.next()
//    age = scan.nextInt()
//
//    println("Welcome $name and you are $age years old")
//}
//import java.util.*
//fun main(a:Array<String>)
//{
//var scan = Scanner(System.`in`)
//println("Enter three numbers: ")
//var num1 = scan.nextInt()
//var num2 = scan.nextInt()
//var num3 = scan.nextInt()
//
//var res = if(num1>num2)
//{
//    var max = if(num1>num3)
//    {
//        num1
//    }
//    else
//    {
//        num3
//    }
//    "Maximum value is $max"
//}
//else
//{
//    var max = if(num2>num3)
//    {
//        num2
//    }
//    else
//    {
//        num3
//    }
//    "maximum value is $max"
//}
//println(res)
//}
//import java.util.*
//fun main(a:Array<String>) {
//    var name: String
//    var num: Int
//    var scan = Scanner(System.`in`)
//    println("Enter a number")
//    num = scan.nextInt()
//
//    when (num) {
//        1 -> println("One")
//        2 -> println("two")
//        3 -> println("three")
//
//        else -> {
//            println("invalid number....")
//        }
//    }
//}
//import java.util.*
//fun main(a:Array<String>)
//{
//    var name:String
//    var num: Int
//    var Str:String
//    var scan = Scanner(System. `in`)
//    println("Enter a name")
//    Str = scan.next()
//
//    when(Str)
//    {
//        "junoseke" -> println("japan")
//        "hout" -> println("khmer")
//        "Dy"  -> println("Vietnam")
//        else -> println("invalid name...")
//    }
//}
