fun main() {
    var oncen = Dog("oncen", 70, "Mixed Thai" )

    oncen.bark()

    oncen.weight = 75

    println("Weight in kgs is ${oncen.weightInkgs}")

    oncen.weight = -2

    println("Weight is ${oncen.weight}")

    oncen.activities = arrayOf("Walks", "Fetching balls", "Frisbee")

    for (item in oncen.activities)

        println("My dog enjoys $item")
}