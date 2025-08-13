fun main() {
    var name: String = "myName"
    println(generateGreetings(name))
}

fun generateGreetings(name: String) : String {
    return "Hello, ${name}"
}