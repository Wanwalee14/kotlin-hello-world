fun main(){
    var x = 1
    println ("before the loop. x = $x.")
    while (x < 4) {
        println ("in the loop. x = $x.")
        x = x + 1
        println (" x is now $x.")
    }
    println ("after the loop. $x.")
}