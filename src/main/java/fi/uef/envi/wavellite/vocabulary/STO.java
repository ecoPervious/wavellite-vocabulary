/*
 * Copyright (C) 2012 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.vocabulary;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * <p>
 * Title: STO
 * </p>
 * <p>
 * Description: Situation Theory Ontology vocabulary
 * </p>
 * <p>
 * Project: Wavellite Vocabulary
 * </p>
 * <p>
 * Copyright: Copyright (C) 2012
 * </p>
 * 
 * @author Markus Stocker
 */

public class STO {

	public static final String ns = "http://vistology.com/ont/2008/STO/STO.owl";

	/** http://vistology.com/ont/2008/STO/STO.owl#Situation **/
	public static final String Situation = _("Situation");

	/** http://vistology.com/ont/2008/STO/STO.owl#ElementaryInfon **/
	public static final String ElementaryInfon = _("ElementaryInfon");

	/** http://vistology.com/ont/2008/STO/STO.owl#Individual **/
	public static final String Individual = _("Individual");

	/** http://vistology.com/ont/2008/STO/STO.owl#Relation **/
	public static final String Relation = _("Relation");

	/** http://vistology.com/ont/2008/STO/STO.owl#Time **/
	public static final String Time = _("Time");

	/** http://vistology.com/ont/2008/STO/STO.owl#Value **/
	public static final String Value = _("Value");

	/** http://vistology.com/ont/2008/STO/STO.owl#RelevantIndividual **/
	public static final String RelevantIndividual = _("RelevantIndividual");

	/** http://vistology.com/ont/2008/STO/STO.owl#Attribute **/
	public static final String Attribute = _("Attribute");

	/** http://vistology.com/ont/2008/STO/STO.owl#Dimensionality **/
	public static final String Dimensionality = _("Dimensionality");

	/** http://vistology.com/ont/2008/STO/STO.owl#supportedInfon **/
	public static final String supportedInfon = _("supportedInfon");

	/** http://vistology.com/ont/2008/STO/STO.owl#relation **/
	public static final String relation = _("relation");

	/** http://vistology.com/ont/2008/STO/STO.owl#polarity **/
	public static final String polarity = _("polarity");

	/** http://vistology.com/ont/2008/STO/STO.owl#hasAttributeValue **/
	public static final String hasAttributeValue = _("hasAttributeValue");

	/** http://vistology.com/ont/2008/STO/STO.owl#attributeValue **/
	public static final String attributeValue = _("attributeValue");

	/** http://vistology.com/ont/2008/STO/STO.owl#hasAttribute **/
	public static final String hasAttribute = _("hasAttribute");

	/** http://vistology.com/ont/2008/STO/STO.owl#relevantIndividual **/
	public static final String relevantIndividual = _("relevantIndividual");

	/** http://vistology.com/ont/2008/STO/STO.owl#dimensionality **/
	public static final String dimensionality = _("dimensionality");
	
	/** http://vistology.com/ont/2008/STO/STO.owl#anchor1 **/
	public static final String anchor1 = _("anchor1");
	
	/** http://vistology.com/ont/2008/STO/STO.owl#anchor2 **/
	public static final String anchor2 = _("anchor2");
	
	/** http://vistology.com/ont/2008/STO/STO.owl#anchor3 **/
	public static final String anchor3 = _("anchor3");

	/** http://vistology.com/ont/2008/STO/STO.owl#_0 **/
	public static final String _0 = _("_0");

	/** http://vistology.com/ont/2008/STO/STO.owl#_1 **/
	public static final String _1 = _("_1");

	public static final class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();
		
		public static final URI Situation = _uri(STO.Situation);
		public static final URI ElementaryInfon = _uri(STO.ElementaryInfon);
		public static final URI Individual = _uri(STO.Individual);
		public static final URI Relation = _uri(STO.Relation);
		public static final URI Time = _uri(STO.Time);
		public static final URI Value = _uri(STO.Value);
		public static final URI RelevantIndividual = _uri(STO.RelevantIndividual);
		public static final URI Attribute = _uri(STO.Attribute);
		public static final URI Dimensionality = _uri(STO.Dimensionality);
		public static final URI _0 = _uri(STO._0);
		public static final URI _1 = _uri(STO._1);
		public static final URI supportedInfon = _uri(STO.supportedInfon);
		public static final URI relation = _uri(STO.relation);
		public static final URI polarity = _uri(STO.polarity);
		public static final URI hasAttributeValue = _uri(STO.hasAttributeValue);
		public static final URI attributeValue = _uri(STO.attributeValue);
		public static final URI hasAttribute = _uri(STO.hasAttribute);
		public static final URI relevantIndividual = _uri(STO.relevantIndividual);
		public static final URI dimensionality = _uri(STO.dimensionality);
		public static final URI anchor1 = _uri(STO.anchor1);
		public static final URI anchor2 = _uri(STO.anchor2);
		public static final URI anchor3 = _uri(STO.anchor3);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
		
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
