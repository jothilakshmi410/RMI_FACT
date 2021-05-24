import java.io.*;

import java.rmi.*;

public class clientfact

{

public static void main(String args[])throws Exception

{

try

{

String s="rmi://"+args[0]+"/abc";

Interfacefact f=(Interfacefact)Naming.lookup(s);

DataInputStream m=new DataInputStream(System.in);

int n1=Integer.parseInt(m.readLine());

System.out.println("the factorial of the given number is :"+f.fact(n1));

}

catch(Exception e)

{

System.out.println(e);

}

}

}



