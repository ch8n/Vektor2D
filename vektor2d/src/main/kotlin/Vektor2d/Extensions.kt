import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

internal fun distance(x1: Float, x2: Float, y1: Float, y2: Float): Float =
    sqrt((y2 - y1).pow(2) + (x2 - x1).pow(2))

internal fun randomSign() =
    if (Random.nextInt() % 2 == 0) 1 else -1

internal fun randomFloat(from: Float, to: Float, sign: Boolean = false): Float =
    Random.nextDouble(from.toDouble(), to.toDouble()).toFloat() * if (sign) randomSign() else 1

internal fun randomFloat(value: Float = 0f, sign: Boolean = false): Float = when (value) {
    0f -> Random.nextFloat() * if (sign) randomSign() else 1
    else -> randomFloat(-1 * value, value, sign)
}



