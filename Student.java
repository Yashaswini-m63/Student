 class Student 
{
  String name;
  int age;
  char gender;


Student(String n ,int a, char g)
 {
  this.name=n;
  this.age=a;
  this.gender=g;
}
public static void main(String[] args)
{
  Student s1=new Student("raksha",21,'f');
  Student s2=new Student("adil",22,'m');
  Student s3=new Student("pooja",20,'f');
  Student s4=new Student("sabreen",23,'f');
  Student s5=new Student("ashnet",24,'f');
  


System.out.println(s2.name);

}
}