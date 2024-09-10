class shape{
    public double getArea(){
        return 0;
    }
}
class Triangle extends shape{// extends from shape class
private double base;
private double height;
public Triangle(double base,double heigt){
    this.base = base;
    this.height= height;
}
public double getArea(){// area of a triangel 1/2*b*h
return 0.5 *base * height;
}
}
class Square extends Shape {
private double side;
public square (double side){
    this.side=side;
}
public double get area(){
    return side *side;
}
}
class main776 {
   public static void main(String[] args) {
       shape[]shape=new shape[2];
       shape[0]=new Square(5);
       shape[1]=new Triangle(2,2);
   } 
}

