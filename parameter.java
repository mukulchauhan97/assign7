class parameter
{
parameter()
{
System.out.println("Default constructor!");
}
parameter(int a)
{
this();
}
public static void main(String args[])
{
parameter p=new parameter(2);
}
}