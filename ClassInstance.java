class Instance
{
 int id;
 String name;
 int salary;
 
 void setId(int i)
 {
   id=i;
 }
  
 void setName(String n)
 {
  name=n;
 }
 void setSalary(int s)
 {
   salary=s;
 }
 void getEmployeeDetails()
 {
  System.out.println(name+"salary is"+salary);
  }
public static void main(String args[])
{
  Instance emp=new Instance();
  emp.setId(10);
  emp.setName("KV");
  emp.setSalary(5000000);
  emp.getEmployeeDetails();
}
}