public class Rectangle {
    int length;
    int width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle( int l, int w){
        this.length = l;
        this.width = w;

    }
    public  String toString() {
		return "The rect width is " + width + " the length is " + length;
	}
    
    public int area() {
        return this.length * this.width; 
    }

    public int perimeter() {
        return this.length * 2 + this.width * 2;
    }

    public void scale(int x) {
        this.length *= x;
        this.width *= x;
    }

}
