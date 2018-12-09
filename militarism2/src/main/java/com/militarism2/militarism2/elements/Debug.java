package com.militarism2.militarism2.elements;

public class Debug {
	
	public static String sub = "   ";
	public static  void log(String info, String text) {
		System.out.println("["+info+"]: "+text);			
	}
	public static  void log(String info, int n) {
		System.out.println("["+info+"]: "+n);			
	}
	public static  void log(String text) {
		System.out.println(text);		
	}
	public static  void log(int n) {
		System.out.println(n);		
	}
	
	public static  void sub(String info, String text) {
		System.out.print(sub);
		System.out.println("["+info+"]: "+text);			
	}		
	public static  void sub(String text) {
		System.out.print(sub);
		System.out.println(text);			
	}
	
	public static  void sub(String info, int n) {
		System.out.print(sub);
		System.out.println("["+info+"]: "+n);			
	}		
	public static  void sub(int n) {
		System.out.print(sub);
		System.out.println(n);			
	}
	
	public static void method(String className,String methodName) {
		System.out.print("mthd");	
		log(className+"."+methodName,"");
	}
	public static void ctor(String className) {
		System.out.print("ctor");	
		log(className+".CTOR","");
	}
	
	
	public static String xy(int x,int y) {
		return "("+x+","+y+")";			
	}
}
