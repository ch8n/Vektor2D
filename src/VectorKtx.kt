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