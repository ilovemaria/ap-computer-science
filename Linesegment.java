
public class Linesegment {
    int x1;
    int y1;
    int x2;
    int y2;


    public Linesegment(int ix1, int ix2, int iy1, int iy2) {   
        this.x1 = ix1;
        this.y1 = iy1;
        this.x2 = ix2;
        this.y2 = iy2;
    }

    public String getSlope()  {
        return x1 + "/" + y1 + " " +  x2 + "/" + y2;
    }

    public double getDistance(){
        return Math.sqrt((x1 - x2)^2 + (y1 - y2)^2);
    }

    public String toString() {
        return "(" + x1 + "," + y1 + ")" + " " + "(" + x1 + "," + y2 + ")";
       }






}
