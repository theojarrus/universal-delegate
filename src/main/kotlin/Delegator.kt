import kotlin.reflect.safeCast

abstract class Delegator<T : Any>(delegates: List<Delegate<out T>>) {

    private val delegates = delegates.filterIsInstance<Delegate<T>>()

    fun <R> delegate(value: T, block: Delegate<T>.(T) -> R): R {
        delegates.forEach { delegate ->
            val result = tryCast(delegate, value) { delegate.block(it) }
            if (result != null) return result
        }
        error("${this::class.simpleName}: delegate for class ${value::class.simpleName} was not provided")
    }

    private fun <R> tryCast(delegate: Delegate<T>, value: T, block: Delegate<T>.(T) -> R): R? {
        return delegate.getClass().safeCast(value)?.let { delegate.block(it) }
    }
}
