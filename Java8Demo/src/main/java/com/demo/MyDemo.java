/**
 * 
 */
package com.demo;

/**
 * @author adms.java1
 *
 */
public class MyDemo implements Interface1, Interface2 {

	/**
	 * @param args
	 */
	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	@Override
	public void log(String str) {
		System.out.println("MyClass logging::" + str);
		//Interface1
	}

}
