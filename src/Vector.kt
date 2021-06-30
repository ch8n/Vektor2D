import kotlin.math.*


fun main(){
    val vector = vector(50f,50f)
    println("""
        ${vector}
        ${vector.magnitude}
        ${vector.magnitudeSquare}
        ${vector.set(3f)}
        ${vector}
        ${vector.limit(2f)}
        ${vector}
        ${vector.normalize()}
        ${vector}
        ${vector.distance(vectorRandom2D())}
        ${vector.heading()}
        wip setHeading
        //0.7853981633974483
    """.trimIndent())
}

interface Vector {
    val x: Float
    val y: Float
    val z: Float

    /**
     * Calculates the magnitude (length) of the vector and returns the result as a float
     * (this is simply the equation sqrt(x*x + y*y + z*z).)
     */
    val magnitude: Float

    /**
     * Calculates the squared magnitude of the vector and returns the result as a float
     * (this is simply the equation (x*x + y*y + z*z).)
     */
    val magnitudeSquare: Float

    /**
     *  Normalize the vector to length 1 (make it a unit vector).
     */
    fun normalize()

    /**
     *  Limit the magnitude of this vector to the value used for the max parameter.
     */
    fun limit(maxMagnitude: Float)

    /**
     *  Set the magnitude of this vector to the value used for the len parameter.
     */
    fun setMagnitude(times: Float)

    /**
     * Calculates the Euclidean distance between two points
     * (considering a point as a vector object).
     */
    fun distance(from: Vector): Float

    /**
     * Sets the x, y, and z component of the vector
     */
    fun set(x: Float = this.x, y: Float = this.y, z: Float = this.z)

    /**
     * Calculates the dot product of two vectors.
     */
    fun dot(vector: Vector) : Float

    /**
     * Calculates and returns a vector composed of the cross product between two vectors
     */
    fun cross(vector: Vector) : Vector

    /**
     * Calculate the angle of rotation for this vector(only 2D vectors) in Radian
     */
    fun heading():Float

    /**
     * Rotate the vector to a specific angle (only 2D vectors), magnitude remains the same
     */
    fun setHeading(rotateBy: Float)
}

data class VectorImpl(
    override var x: Float,
    override var y: Float,
    override var z: Float,
) : Vector {

    /**
     * Calculates the magnitude (length) of the vector and returns the result as a float
     * (this is simply the equation sqrt(x*x + y*y + z*z).)
     */
    override var magnitude: Float = 0.0f
        get() = sqrt(x.pow(2) + y.pow(2) + z.pow(2))
        private set

    /**
     * Calculates the squared magnitude of the vector and returns the result as a float
     * (this is simply the equation (x*x + y*y + z*z).)
     */
    override val magnitudeSquare: Float
        get() = magnitude.pow(2)

    /**
     *  Normalize the vector to length 1 (make it a unit vector).
     */
    override fun normalize() {
        if (magnitude != 0f) {
            this / magnitude
        }
    }

    /**
     *  Limit the magnitude of this vector to the value used for the max parameter.
     */
    override fun limit(maxMagnitude: Float) {
        if (magnitude > maxMagnitude) {
            setMagnitude(maxMagnitude)
        }
    }

    /**
     *  Set the magnitude of this vector to the value used for the len parameter.
     */
    override fun setMagnitude(times: Float) {
        normalize()
        this * times
    }

    /**
     * Calculates the Euclidean distance between two points
     * (considering a point as a vector object).
     */
    override fun distance(from: Vector): Float {
        return sqrt((from.y - this.y).pow(2) + (from.x - this.x).pow(2))
    }

    /**
     * Sets the x, y, and z component of the vector
     */
    override fun set(x: Float, y: Float, z: Float) {
        this.x = x
        this.y = y
        this.z = z
    }

    /**
     * Calculates the dot product of two vectors.
     */
    override fun dot(vector: Vector): Float {
        TODO("Not yet implemented")
    }

    /**
     * Calculates and returns a vector composed of the cross product between two vectors
     */
    override fun cross(vector: Vector) : Vector {
        TODO("Not yet implemented")
    }

    /**
     * Calculate the angle of rotation for this vector(only 2D vectors) in Radian
     */
    override fun heading(): Float {
        val angleInRad = atan((y/x).toDouble())
        return angleInRad.toFloat()
    }

    /**
     * Rotate the vector to a specific angle (only 2D vectors), magnitude remains the same
     */
    override fun setHeading(rotateBy: Float) {
        val mag = this.magnitude
        this.x = mag * cos(rotateBy.toDouble()).toFloat()
        this.y = mag * sin(rotateBy.toDouble()).toFloat()
    }

    /**
     * Adds x, y, and z components to a vector, adds one vector to another,
     * or adds two independent vectors together.
     */
    operator fun plus(that: Vector) {
        this.x += that.x
        this.y += that.y
        this.z += that.z
    }

    /**
     * Subtracts x, y, and z components from a vector, subtracts one vector from another,
     * or subtracts two independent vectors.
     */
    operator fun minus(that: Vector) {
        this.x -= that.x
        this.y -= that.y
        this.z -= that.z
    }

    /**
     * Multiplies the vector by a scalar, multiplies the x, y, and z components from a vector,
     * or multiplies the x, y, and z components of two independent vectors
     */
    operator fun times(value: Float) {
        this.x *= value
        this.y *= value
        this.z *= value
    }

    /**
     *  Divides the vector by a scalar, divides a vector by the x, y, and z arguments,
     *  or divides the x, y, and z components of two vectors against each other.
     */
    operator fun div(value: Float) {
        if (value > 0) {
            this.x /= value
            this.y /= value
            this.z /= value
        }
    }

    /**
     * Gives remainder of a vector when it is divided by another vector
     */
    operator fun rem(value: Float) {
        if (value > 0) {
            this.x %= value
            this.y %= value
            this.z %= value
        }
    }



}

