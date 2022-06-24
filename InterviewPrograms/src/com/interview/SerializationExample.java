package com.interview;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample implements java.io.Serializable{

public	String employee;
	public int empid;
	public transient String emp2;
	public String emp3;
	
	
	public static void main(String[] args) {
	SerializationExample ser=new SerializationExample();
	ser.employee="madhu sudha";
	ser.empid=22;
	ser.emp2="ravi";
	ser.emp3="dhruva";
	try {
	FileOutputStream fos=new FileOutputStream("employee details.txt");
	ObjectOutputStream out= new ObjectOutputStream(fos);
	out.writeObject(ser);
	out.close();
	fos.close();
	}catch(IOException o) {
	 o.printStackTrace();	
	}
	}

}
