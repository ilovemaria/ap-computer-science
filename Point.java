public class Point {
    
	private int x;
	private int y;

    private Point() {   
        this.x = 3;
        this.y = 1;
    }

    public String otString() {
        return "(" + x + "," + y + ")";
       }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }




}