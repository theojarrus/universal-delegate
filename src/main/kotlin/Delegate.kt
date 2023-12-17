import kotlin.reflect.KClass

interface Delegate<T : Any> {

    fun getClass(): KClass<T>
}
