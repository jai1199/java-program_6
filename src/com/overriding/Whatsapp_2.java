package com.overriding;

public class Whatsapp_2 extends Whatsapp_1
{
  @Override
  public void msgreport()
  {
	  super.msgreport();
	System.out.println("msg received");  
  }
}
