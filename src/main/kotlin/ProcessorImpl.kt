class ProcessorImpl : Delegator<Parent>(
    delegates = listOf(
        FirstChildProcessorDelegate(),
        SecondChildProcessorDelegate()
    )
), Processor {

    override fun process(parent: Parent): Result {
        return delegate(parent) { item ->
            (this as ProcessorDelegate).process(item)
        }
    }
}
