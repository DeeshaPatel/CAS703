/*
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl1.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.webmate.ui.internal.WebmateActivator;

public class WebMateUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return WebmateActivator.getInstance().getInjector("org.xtext.example.mydsl1.WebMate");
	}

}
