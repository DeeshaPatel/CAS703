/*
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydsl1.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl1.services.WebMateGrammarAccess
import webmate.Abbreviation
import webmate.HTML

class WebMateFormatter extends AbstractFormatter2 {
	
	@Inject extension WebMateGrammarAccess

	def dispatch void format(HTML hTML, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (abbreviation : hTML.abbreviation) {
			abbreviation.format
		}
	}

	def dispatch void format(Abbreviation abbreviation, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (tag : abbreviation.tags) {
			tag.format
		}
		for (iD : abbreviation.ids) {
			iD.format
		}
		for (symbol : abbreviation.symbols) {
			symbol.format
		}
		for (_class : abbreviation.classes) {
			_class.format
		}
		for (attribute : abbreviation.attributes) {
			attribute.format
		}
		for (group : abbreviation.group) {
			group.format
		}
	}
	
	// TODO: implement for Symbol, Tag, Group
}
