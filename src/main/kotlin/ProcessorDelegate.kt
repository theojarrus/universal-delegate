interface ProcessorDelegate<T : Parent> : Delegate<T> {

    fun process(child: T): Result
}
