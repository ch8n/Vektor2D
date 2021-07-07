# Vektor2D
`2D Vector` implemented in Kotlin for Jetpack Compose Canvas API :rocket:

# Motivation
Recently I have been poking around with `Jetpack Compose Canvas API` to make some computer graphics stuff which requires lots of Vector maths and operation, some of the cool examples I found were built over one of the processing framework called `p5.js`,  There you will see `p5.Vector`  which represent groupings of coordinate values and make it easy to understand and work with them.

[Official p5.js Reference Guide on Vectors](https://p5js.org/reference/#/p5.Vector) and [Github Source-Code](https://github.com/processing/p5.js/blob/main/src/math/p5.Vector.js) are linked here if you want to refer the original material.

I Have ported over these 2D Vector function over Kotlin, Hope you all enjoy them and for `contribution`/`issues` and discussion follow the [Contribution Guide](https://chetangupta.net) [TODO CONTRIBUTION GUIDE]

## Documentation
TODO(In progress...)
You can recommend me tooling by opening discussion or issues.

## Collection : 

Vector(`[x]`, `[y]`, `[z]`)

## Parameters
- `x` Float: x component of the vector (Optional)
- `y` Float: y component of the vector (Optional)
- `z` Float: z component of the vector (Optional)

## Methods

| Method      | Description |
| ----------- | ----------- |
| toString()      | Returns a string representation of a vector |
| clone()   | Gets a copy of the vector        |
| +   | Adds x, y, and z components to a vector, adds one vector to another, or adds two independent vectors together.  |
| %   |  Gives remainder of a vector when it is divided by another vector. |
| -   |  Multiplies the vector by a scalar, multiplies the x, y, and z components from a vector, or multiplies the x, y, and z components of two independent vectors |
| /   |  Divides the vector by a scalar, divides a vector by the x, y, and z arguments, or divides the x, y, and z components of two vectors against each other. |
| magnitude   | Calculates the magnitude (length) of the vector and returns the result as a float |
| magnitudeSquare   |  Calculates the squared magnitude of the vector and returns the result as a float        |
| dot()   |  Calculates the dot product of two vectors.        |
| cross()   | Calculates and returns a vector composed of the cross product between two vectors        |
| distance()   | Calculates the Euclidean distance between two points (considering a point as a vector object).        |
| normalize()   |  Normalize the vector to length 1 (make it a unit vector).        |
| limit()   |  Limit the magnitude of this vector to the value used for the max parameter.        |
| setMagnitude()   |  Set the magnitude of this vector to the value used for the len parameter.        |
| heading()   |  Calculate the angle of rotation for this vector(only 2D vectors)        |
| setHeading()   | Rotate the vector to a specific angle (only 2D vectors), magnitude remains the same |
| rotate()   |  Rotate the vector by an angle (only 2D vectors), magnitude remains the same        |
| angleBetween()   | Calculates and returns the angle between two vectors.        |
| linearInterpolateTo()   | Linear interpolate the vector to another vector        |
| reflection()   |  Reflect the incoming vector about a normal to a line in 2D        |
| toList()   |  Return a representation of this vector as a float array        |
| equalCoordinates()  | Equality check coordinate values        |
| vectorOfAngle()  | Make a new 2D vector from an angle|
| vectorRandom2D()  | Creates a 2D `Unit` Vector with given or random coordinates |
| vector()  | Creates a 2D Vector with given coordinates |


## :eyes: Social
[LinkedIn](https://bit.ly/ch8n-linkdIn) |
[Medium](https://bit.ly/ch8n-medium-blog) |
[Twitter](https://bit.ly/ch8n-twitter) |
[StackOverflow](https://bit.ly/ch8n-stackOflow) |
[CodeWars](https://bit.ly/ch8n-codewar) |
[Portfolio](https://bit.ly/ch8n-home) |
[Github](https://bit.ly/ch8n-git) |
[Instagram](https://bit.ly/ch8n-insta) |
[Youtube](https://bit.ly/ch8n-youtube)


## :cop: License
Shield: [![CC BY-SA 4.0][cc-by-sa-shield]][cc-by-sa]

This work is licensed under a
[Creative Commons Attribution-ShareAlike 4.0 International License][cc-by-sa].

[![CC BY-SA 4.0][cc-by-sa-image]][cc-by-sa]

[cc-by-sa]: http://creativecommons.org/licenses/by-sa/4.0/
[cc-by-sa-image]: https://licensebuttons.net/l/by-sa/4.0/88x31.png
[cc-by-sa-shield]: https://img.shields.io/badge/License-CC%20BY--SA%204.0-lightgrey.svg