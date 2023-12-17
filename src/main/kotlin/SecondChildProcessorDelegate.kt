class SecondChildProcessorDelegate : ProcessorDelegate<Parent.SecondChild> {

    override fun getClass() = Parent.SecondChild::class

    override fun process(child: Parent.SecondChild): Result {
        return Result(child.toString())
    }
}
