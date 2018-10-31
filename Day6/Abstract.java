abstract class Vehicle
{
<<<<<<< HEAD
public abstract void start();

=======
 public abstract void start();
>>>>>>> 829abfea3ea2e6d319c66117674d21ec0f25a009
public void stop()
{
System.out.println("Stop Vehicle");
}
}
class twowheeler extends Vehicle
{
public void start()
{
System.out.println("Start Two wheeler");
}
public void stop()
{
System.out.println("Stop Two wheeler");
}
}
class fourwheeler extends Vehicle
{
public void start()
{
System.out.println("Start Four wheeler");
}
public void stop()
{
System.out.println("Stop Four wheeler");
}
}
class Abstract
{
public static void main(String args[])
{
twowheeler T=new twowheeler();
fourwheeler F=new fourwheeler();
T.start();
T.stop();
F.start();
F.stop();
}
}
