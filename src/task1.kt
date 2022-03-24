
fun main() {
    var f1  = Point(3.0,3.0)

    var f2  = Point(7.0,4.0)

    var f3 = Point(5.4, -2.3)

    println(f1.equals(f2))
    println(f1.toString())
    println(f2.toString())
    println(f3.transitionToParallelPoint(f3))

}

class Point(var x: Double,var y: Double){

    override fun toString(): String {
        return "x=$x,y=$y"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point){
            if (x*other.y/y == other.x)
                return true
        }
        return false
    }

    fun transitionToParallelPoint(point: Point) : Point{

            point.x = -x;
            point.y = -y;

        return point;

    }
    }

