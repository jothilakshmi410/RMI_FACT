import java.net.*;

import java.rmi.*;

public class serverfact

{

public static void main(String args[])

{

try

{

factorialImpl m=new factorialImpl();

Naming.rebind("abc",m);

}

catch(Exception e)

{

System.out.println("Exception"+e);

}

}

}
