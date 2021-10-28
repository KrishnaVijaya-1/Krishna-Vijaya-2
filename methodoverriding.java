class Shapes
{
public void area()
{
System.out.println("The formula for area of");
}
}
class Triangle extends Shapes
{
public void area()
{
System.out.println("Trinagle is 1/2*base*height");
}
}
class Circle extends Shapes
{
public void area()
{
System.out.println("circle is 3.14*radius*radius");
}
}
class Main
{
public static void main(String[] args)
{
Shapes myshape=new Shapes();
Shapes myTriangle=new Triangle();
Shapes myCircle=new Circle();
myshape.area();
myTriangle.area();
myCircle.area();
}
}
