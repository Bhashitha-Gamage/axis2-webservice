package com.web;

/**
 * @author user
 *
 */
public class Tester {
public static void main(String args[]){
	 try{
		 HelloWorldServiceStub stub=new HelloWorldServiceStub();
		 SayHello req=new SayHello();
		 req.setMsg("Himali you will become genius on AXIS2 !");
		 
		 SayHelloResponse response=stub.sayHello(req);
		 System.out.println(response.get_return());
	 }
	 catch(Exception e){
		 
	
	 }
	
}}
