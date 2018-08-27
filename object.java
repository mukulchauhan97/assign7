class parent
{
void show()
{
System.out.println("Show of parent");
}
}
class child extends parent
{
void display()
{
System.out.println("Show of child");
}
}
class object
{
public static void main(String args[])
{
child c=new child();
c.show();
}
}
