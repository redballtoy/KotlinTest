package access_modifiers

open class Parent {
    private val first = "sirst"//visible only inside the Parent class
    protected val second = "second"//visible only inside the Parent and its heirs
    val third = "third" //public by default - visible everywhere

    protected class Inner{ //the class is visible only to descendants of Parent
        private val fourth = "fourth" //visible only inside the Inner
    }
}
