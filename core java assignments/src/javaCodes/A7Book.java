
package javaCodes;

import java.util.*;

class Book
{
	String bname;
	int bprice = 200;
	
	public String getBname()
	{
		return bname;
	}
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	
	public int getBprice()
	{
		return bprice;
	}
	public void setBprice(int bprice)
	{
		this.bprice=bprice;
	}
	
}


public class A7Book {

	public static void main(String[] args) {
		Book b =new Book();
		b.setBname("java");
		b.setBprice(100);
		
		System.out.println(b.getBname());
		System.out.println(b.getBprice());
	}

}
