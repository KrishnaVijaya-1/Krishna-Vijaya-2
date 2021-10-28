abstract class Figure
{
double dimension1;
double dimension2;
Figure(double x,double y)
{
dimension1=x;
dimension2=y;
}
abstract double area();
}
class Rectangle extends Figure
{
Rectangle(double x,double y)
{
super(x,y);
}
double area()
{
System.out.println("Area of rectangle is:");
return dimension1*dimension2;
}
}
class Triangle extends Figure
{
Triangle(double x,double y)
{
super(x,y);
}
double area()
{
System.out.println("Area of rectangle is:");
return dimension1*dimension2/2;
}
}
class FindArea
{
public static void main(String args[])
{
Figure fig;
Rectangle r=new Rectangle(9,5);
Triangle t=new Triangle(10,8);
fig=r;
System.out.println("Area of rectangle is:"+fig.area());
fig=t;
System.out.println("Area of triangle is:"+fig.area());
}
}


