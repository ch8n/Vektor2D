import kotlin.math.pow
import kotlin.math.sqrt


interface Vector {
    val x: Float
    val y: Float
    val z: Float
    val magnitude: Float
    fun normalize()
    fun limit(maxMagnitude: Float)
    fun setMagnitude(times: Float)
    fun distance(from:Vector): Float
}

data class VectorImpl(
    override var x: Float,
    override var y: Float,
    override var z: Float,
) : Vector {
    override var magnitude: Float = 0.0f
        get() = sqrt(x.pow(2) + y.pow(2) + z.pow(2))
        private set

    override fun normalize() {
        if (magnitude != 0f) {
            this / magnitude
        }
    }

    override fun limit(maxMagnitude: Float) {
        if (magnitude > maxMagnitude) {
            setMagnitude(maxMagnitude)
        }
    }

    override fun setMagnitude(times: Float) {
        normalize()
        this * times
    }

    override fun distance(from: Vector): Float {
        return sqrt((from.y - this.y).pow(2) + (from.x - this.x).pow(2))
    }


    operator fun plus(that: Vector) {
        this.x += that.x
        this.y += that.y
        this.z += that.z
    }

    operator fun minus(that: Vector) {
        this.x -= that.x
        this.y -= that.y
        this.z -= that.z
    }

    operator fun times(value: Float) {
        this.x *= value
        this.y *= value
        this.z *= value
    }

    operator fun div(value: Float) {
        if (value > 0) {
            this.x /= value
            this.y /= value
            this.z /= value
        }
    }
}

/**
 * Creates a 2D Vector with given coordinates
 */
fun vector(x: Float = 0f, y: Float = 0f, z: Float = 0f): Vector = VectorImpl(x, y, z)

/**
 * Creates a 2D `Unit` Vector with given or random coordinates
 */
fun vectorRandom2D(
    x: Float = randomFloat(sign = true),
    y: Float = randomFloat(sign = true),
    z: Float = randomFloat(sign = true)
): Vector {
    val vector = vector(x, y, z)
    vector.normalize()
    return vector
}