package myapp;

public class Test_RuntimeBinding {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//car c=new car();
//c.speed();
//System.out.println();
//Bmw b=new Bmw();
//b.speed();
////
//Car cObj;
//cObj=new Ferrari;
//base class object can hold ref of Derived class
	Car baseObj=new Bmw();
	//upcasting : implicit
	//baseObj//compiler:car class
	//baseObj//RunTime:Bmw class
	baseObj.speed();
	baseObj=new Ferrari();
	baseObj.speed();
	baseObj=new Nano();
	baseObj.speed();
	
	}

}
