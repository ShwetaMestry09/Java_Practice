class Science
{
void sci()
{
System.out.println("Main branch");
}
}
class physics extends Science
{
void phy()
{
System.out.println("Physics.. ");
}
}
class Chemistry extends Science
{
void chem()
{
System.out.println("Chemistry..");
}
}
class Biology extends Science
{
void bio()
{
System.out.println("Biology..");
}
}
public class Hierarchical
{
public static void main(String args[])
{
Biology s = new Biology();
s.talk();
s.hear();
s.see();
}
}