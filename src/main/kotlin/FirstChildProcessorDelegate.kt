class FirstChildProcessorDelegate : ProcessorDelegate<Parent.FirstChild> {

    override fun getClass() = Parent.FirstChild::class

    override fun process(child: Parent.FirstChild): Result {
        return Result(child.toString())
    }
}
