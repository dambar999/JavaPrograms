package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Item implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String Model="KKM";
	double price;
	String size;
}

public class ShoopingCart implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 Item item;
     int n=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoopingCart sc=  new ShoopingCart();
		
		try {
			File fr= new File("E://obj3.ser");
			FileOutputStream fis;
			fis = new  FileOutputStream(fr);
			ObjectOutputStream oos= new ObjectOutputStream(fis);
			oos.writeObject(sc);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		File fr1= new File("E://obj3.ser");
		FileInputStream fis = new FileInputStream(fr1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ShoopingCart sc1= (ShoopingCart)ois.readObject();
		System.out.println(sc1.item.Model);
		System.out.println(sc1.n);
		
		
		}
		catch(Exception e) {
			
		}
		

	}

}
