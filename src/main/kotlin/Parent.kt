sealed class Parent {

    data class FirstChild(val data: String) : Parent()
    data class SecondChild(val data: Int) : Parent()
}
