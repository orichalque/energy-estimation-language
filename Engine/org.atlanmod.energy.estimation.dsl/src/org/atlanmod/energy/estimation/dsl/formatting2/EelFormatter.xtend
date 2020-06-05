/*
 * generated by Xtext 2.14.0
 */
package org.atlanmod.energy.estimation.dsl.formatting2

import com.google.inject.Inject
import org.atlanmod.energy.estimation.dsl.services.EelGrammarAccess
import org.atlanmod.energy.estimation.metamodel.eel.MeasurementUncertainty
import org.atlanmod.energy.estimation.metamodel.eel.Platform
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class EelFormatter extends AbstractFormatter2 {
	
	@Inject extension EelGrammarAccess

	def dispatch void format(Platform platform, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (variable : platform.variables) {
			variable.format
		}
		for (measure : platform.measures) {
			measure.format
		}
	}

	def dispatch void format(MeasurementUncertainty measurementUncertainty, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		measurementUncertainty.information.format
	}
	
	// TODO: implement for Interval, Sampling, Sample, EClass, EOperation, EAnnotation, ETypeParameter, EGenericType, EAttribute, EReference, EDataType, EEnum, EEnumLiteral, EParameter
}