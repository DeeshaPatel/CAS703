/*
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.WebMateRuntimeModule;
import org.xtext.example.mydsl.WebMateStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class WebMateIdeSetup extends WebMateStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new WebMateRuntimeModule(), new WebMateIdeModule()));
	}
	
}
