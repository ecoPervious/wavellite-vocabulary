/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.vocabulary;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * <p>
 * Title: QB
 * </p>
 * <p>
 * Description: The RDF Data Cube Vocabulary
 * </p>
 * <p>
 * Project: Wavellite Vocabulary
 * </p>
 * <p>
 * Copyright: Copyright (C) 2013
 * </p>
 * 
 * @author Markus Stocker
 */

public class QB {

	public static final String ns = "http://purl.org/linked-data/cube";

	/** http://purl.org/linked-data/cube#DataSet */
	public static final String DataSet = _("DataSet");

	/** http://purl.org/linked-data/cube#DataStructureDefinition */
	public static final String DataStructureDefinition = _("DataStructureDefinition");

	/** http://purl.org/linked-data/cube#ComponentSpecification */
	public static final String ComponentSpecification = _("ComponentSpecification");

	/** http://purl.org/linked-data/cube#Observation */
	public static final String Observation = _("Observation");

	/** http://purl.org/linked-data/cube#ComponentProperty */
	public static final String ComponentProperty = _("ComponentProperty");

	/** http://purl.org/linked-data/cube#DimensionProperty */
	public static final String DimensionProperty = _("DimensionProperty");

	/** http://purl.org/linked-data/cube#MeasureProperty */
	public static final String MeasureProperty = _("MeasureProperty");

	/** http://purl.org/linked-data/cube#AttributeProperty */
	public static final String AttributeProperty = _("AttributeProperty");

	/** http://purl.org/linked-data/cube#dataSet */
	public static final String dataSet = _("dataSet");

	/** http://purl.org/linked-data/cube#component */
	public static final String component = _("component");

	/** http://purl.org/linked-data/cube#componentProperty */
	public static final String componentProperty = _("componentProperty");

	/** http://purl.org/linked-data/cube#structure */
	public static final String structure = _("structure");

	/** http://purl.org/linked-data/cube#dimension */
	public static final String dimension = _("dimension");

	/** http://purl.org/linked-data/cube#attribute */
	public static final String attribute = _("attribute");

	/** http://purl.org/linked-data/cube#measure */
	public static final String measure = _("measure");

	/** http://purl.org/linked-data/cube#order */
	public static final String order = _("order");

	/** http://purl.org/linked-data/cube#componentRequired */
	public static final String componentRequired = _("componentRequired");

	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI DataSet = _uri(QB.DataSet);
		public static final URI DataStructureDefinition = _uri(QB.DataStructureDefinition);
		public static final URI ComponentSpecification = _uri(QB.ComponentSpecification);
		public static final URI Observation = _uri(QB.Observation);
		public static final URI ComponentProperty = _uri(QB.ComponentProperty);
		public static final URI DimensionProperty = _uri(QB.DimensionProperty);
		public static final URI MeasureProperty = _uri(QB.MeasureProperty);
		public static final URI AttributeProperty = _uri(QB.AttributeProperty);
		public static final URI dataSet = _uri(QB.dataSet);
		public static final URI component = _uri(QB.component);
		public static final URI componentProperty = _uri(QB.componentProperty);
		public static final URI structure = _uri(QB.structure);
		public static final URI dimension = _uri(QB.dimension);
		public static final URI attribute = _uri(QB.attribute);
		public static final URI measure = _uri(QB.measure);
		public static final URI order = _uri(QB.order);
		public static final URI componentRequired = _uri(QB.componentRequired);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
