class A
{
 int a;
 A()
 {
  a=10;
  System.out.println("In class A Constructor");
 }

A(int val)
 {
   a=val;
  }
}
class B extends A
{
 int b;
 B()
 {
  b=20;
  System.out.println("In class B Constructor");
 }
B(int val)
{
b=val;
System.out.println("a is"+a+"b is"+b);
}
}
class C
{
public static void main(String args[])
{
A s=new A();
System.out.println(s.a);
B b1=new B(50);
System.out.println(b1.a+""+b1.b);
}
}


