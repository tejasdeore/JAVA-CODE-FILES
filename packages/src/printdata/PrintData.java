package printdata;

 import com.user.Greeter;

import pack1.*;
 import pack2.*;

 public class PrintData 
 {

	public static void main(String[] args) 
	{
		Student s =new Student();
		Batch b =new Batch();
		Greeter g=new Greeter();
		g.greet();
		s.accept();
		b.accept();
		s.display();
		b.display();
	}

}
