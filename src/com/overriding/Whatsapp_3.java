package com.overriding;

public class Whatsapp_3 extends Whatsapp_2
{
	@Override
  public void msgreport()
  {
	System.out.println("msg seen"); 
	super.msgreport();
  }
}
