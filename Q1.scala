object Q1 extends App{

    var x = Point( 10,25 );
    var y = Point( 6,2 );
    
    println(x.add(y));

    x.move( 2, 4 );
    println(x);
    
    var z = x.distance(y);
    println(z);

    x.invert();
    println(x);

}

case class Point(a:Int, b:Int){
    
    var x :Int = a;
    var y :Int = b;

    // part 1

    def add (p:Point)={
        new Point(this.x + p.x , this.y + p.y);
    }

    // part 2

    def move (dx : Int ,dy : Int )={
        this.x += dx;
        this.y += dy;
    }

    // part 3
    def distance(p: Point)={

        var distanceOfx:Int = this.x - p.x;
        var distanceOfy:Int = this.y - p.y;
        var result: Int = distanceOfx*distanceOfx + distanceOfy*distanceOfy;

        scala.math.sqrt(result);

    }


    // part 4
    def invert ()={
        val temp = this.x;

        this.x = this.y;
        this.y = temp;
    }
}
