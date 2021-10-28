interface FirstInterface
{
int addMethod(int x,int y);
float divMethod(int m,int n);
void display();
int VAR1=10;
float VAR2 =20.65f;
}
class MyClass implements FirstInterface{
public int addMethod(int a,int b){
return(a+b);
}
public float divMethod(int i,int j){
return(i/j);
}
public void display(){
System.out.println("Variable1:" +VAR1);
System.out.println("Variable2:" +VAR2);
}
public static void main(String args[])
{
MyClass m=new MyClass();
m.addMethod(10,20);
m.divMethod(20,4);
m.display();
}
}