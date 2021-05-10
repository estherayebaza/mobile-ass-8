fun main() {
   println(isEven(23))
   println(isEven(24))
   println( myFunction("banana"))
    println(myFunction("fish"))
    var category1=Product("mangoes ",5,600,"fruit")
  println(category1)
    var category2=Product("Kituzi",2,400,"medicine")
    println(category2)
    var category3=Product("Salt",1,200,"other")
   println(category3)
println(friendNames(arrayOf("esther","shallot","mike","phionah","janet")))
}

fun isEven(y: Int): Boolean {
  if (y % 2 == 0) {
        return true
   } else
        return false
}
data class Product( var name:String, var weight:Int,var price:Int,var category:String) {
 fun product(name:String,weight:Int,price:Int,category:Int) {
     var gloceryList = mutableListOf<String>()
    var hygieneList = mutableListOf<String>()
    var otherList = mutableListOf<String>()
     when ("category") {
         "gloceries"  -> println( gloceryList.add(name))
         "hygiene" -> println(hygieneList.add(name))
        else-> println(otherList.add(name))
     }
     println("${name}:${category}")
 }
}

fun myFunction(x: String):String{
var xList=""
    for(character in x){
        if(x.indexOf(character)%2==0){
          xList+=character

       }
   }
return xList
}

fun friendNames(names:Array<String>):MutableList<String>{
   var myNamesList= mutableListOf<String>()
    for (name in names){
        if (name.length%2==0) {
           myNamesList.add(name)
       }
    }
    return myNamesList
}
