package Miscellanous;
interface i1 { 	public default void m1() {}}
interface i2 {	public  default void m1(){}}

public class Test implements i1,i2 {
	@Override
	public void  m1(){
		System.out.println("in test m1");
    
	
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t= new Test();
		t.m1();
	}
	

}	
		
