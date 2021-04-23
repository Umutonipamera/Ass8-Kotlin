fun main(){
    println(isEven(8))
    println(isEven(11))
    var product=Product("Duru",600.00,500.00,"hygiene")
    var items=Product("Donut",100.00,100.00,"groceries")
    product.check()
    items.check()
    println(fruit("watermelon"))
    println(names(arrayOf("Pamela","Umutoni","Juliet","Sharoni")))


}

fun  isEven( num:Int):Boolean {
    if (num % 2 == 0) {
        return true
    }
    else {
        return false
    }
}
data class  Product(var name:String,var weight:Double,var price:Double,var category:String) {

    fun check() {
        var gloceries: MutableList<String> = mutableListOf<String>()
        var hygiene: MutableList<String> = mutableListOf<String>()
        var other: MutableList<String> = mutableListOf<String>()
        when (category) {
            "groceries" -> println(mutableListOf("$name", "$category"))
            "hygiene" -> println(mutableListOf("$name", "$category"))
            else -> println("other category")
        }
    }

}

fun fruit(name:String):String{
  var newName= ""
  for(char in name){
      if(name.indexOf(char)%2==0){
   newName +=char
          }
  }
    return newName
}
fun names(names:Array<String>):MutableList<String>{
    var namesList=mutableListOf<String>()
    for(name in names){
        if(name.length%2==0){
            namesList.add(name)
        }
    }
    return namesList
}








