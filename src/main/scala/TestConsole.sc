val f = (x:Double) => math.Pi/2 - x
val cos = f andThen math.sin
cos(12.0)