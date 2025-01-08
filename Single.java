class Father
{
void eat()
{
System.out.println("i can eat.");
}
}
class Son extends Father
{
void read()
{
System.out.println("i can read");
}
}
public class Single
{
public static void main(String args[])
{
Son s = new Son();
s.eat();
s.read();
}
}