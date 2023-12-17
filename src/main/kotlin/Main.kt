fun main() {
    val processor = ProcessorImpl()
    val firstChild = Parent.FirstChild("test")
    val firstResult = processor.process(firstChild)
    val secondChild = Parent.SecondChild(101)
    val secondResult = processor.process(secondChild)
    println("First result: $firstResult (child: $firstChild)")
    println("Second result: $secondResult (child: $secondChild)")
}
