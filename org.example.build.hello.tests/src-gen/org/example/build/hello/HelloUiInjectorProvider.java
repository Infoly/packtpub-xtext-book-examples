/*
* generated by Xtext
*/
package org.example.build.hello;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class HelloUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.example.build.hello.ui.internal.HelloActivator.getInstance().getInjector("org.example.build.hello.Hello");
	}
	
}