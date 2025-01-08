class Human
{
void see()
{
System.out.println("i can see.");
}
}
class Girl extends Human
{
void hear()
{
System.out.println("i can hear.");
}
}
class Boy extends Girl
{
void talk()
{
System.out.println("i can talk");
}
}

public class Multilevel
{
public static void main(String args[])
{
Boy s = new Boy();
s.talk();
s.hear();
s.see();
}
}