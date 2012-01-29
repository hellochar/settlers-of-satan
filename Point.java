//Point class for representing points on the map

class Point {

            float x;
            float y;
            final float sideLength = (float) 69.28;
            final float radius = 60;



            public Point(float x, float y) {
                this.x = x;
                this.y = y;
            }

            public Point(int num, float angle) {
		this.x = (float)(num * this.radius * Math.cos(angle));
		this.y = (float)(num * this.radius * Math.sin(angle));
            }

	    public Point(float angle){
                this.x = (float) ((2 * this.radius + this.sideLength) * Math.cos(angle));
		this.y = (float)((2 * this.radius + this.sideLength) * Math.sin(angle));

            }

	    public String toString(){
		return "(".concat(Double.toString(this.x)).concat(", ").concat(Double.toString(this.y)).concat(")");
	    }

	    public boolean equals(Point other){
		return (this.x == other.x && this.y == other.y);
	    }

        }


