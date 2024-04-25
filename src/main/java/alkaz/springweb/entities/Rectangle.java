package alkaz.springweb.entities;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) throws Exception {
        if(width <0 || height <0)
            throw new Exception("отрицательная длина отрезка");

        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }

    public double getPerim(){
        return 2*(width+height);
    }
}
