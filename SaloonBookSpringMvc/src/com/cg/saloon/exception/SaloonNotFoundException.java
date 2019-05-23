/*@Author hsomagat
*Project name:SaloonBookApplication
*/
package com.cg.saloon.exception;
//***This class throws an exception at runtime***
public class SaloonNotFoundException extends Exception{
	public SaloonNotFoundException(){
		super();
}
	public SaloonNotFoundException(String s){
		super(s);
}
}
