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
 * Title: WTO
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project: Wavellite Task Ontology
 * </p>
 * <p>
 * Copyright: Copyright (C) 2013
 * </p>
 * 
 * @author Markus Stocker
 */

public class WTO {

	/** http://envi.uef.fi/wavellite/wto */
	public static final String ns = "http://envi.uef.fi/wavellite/wto";

	/** http://envi.uef.fi/wavellite/wto#Entity */
	public static final String Entity = _("Entity");
	
	/** http://envi.uef.fi/wavellite/wto#TemporalLocationDateTime */
	public static final String TemporalLocationDateTime = _("TemporalLocationDateTime");

	/** http://envi.uef.fi/wavellite/wto#MeasurementValue */
	public static final String MeasurementValue = _("MeasurementValue");

	/** http://envi.uef.fi/wavellite/wto#MeasurementValueContext */
	public static final String MeasurementValueContext = _("MeasurementValueContext");

	/** http://envi.uef.fi/wavellite/wto#MeasurementResult */
	public static final String MeasurementResult = _("MeasurementResult");

	/** http://envi.uef.fi/wavellite/wto#MeasurementValueDouble */
	public static final String MeasurementValueDouble = _("MeasurementValueDouble");

	/** http://envi.uef.fi/wavellite/wto#Sensor */
	public static final String Sensor = _("Sensor");

	/** http://envi.uef.fi/wavellite/wto#Feature */
	public static final String Feature = _("Feature");

	/** http://envi.uef.fi/wavellite/wto#Property */
	public static final String Property = _("Property");

	/** http://envi.uef.fi/wavellite/wto#SensorObservation */
	public static final String SensorObservation = _("SensorObservation");

	/** http://envi.uef.fi/wavellite/wto#DatasetObservation */
	public static final String DatasetObservation = _("DatasetObservation");
	
	/** http://envi.uef.fi/wavellite/wto#Component */
	public static final String Component = _("Component");
	
	/** http://envi.uef.fi/wavellite/wto#ComponentPropertyDimension */
	public static final String ComponentPropertyDimension = _("ComponentPropertyDimension");
	
	/** http://envi.uef.fi/wavellite/wto#ComponentPropertyMeasure */
	public static final String ComponentPropertyMeasure = _("ComponentPropertyMeasure");

	/** http://envi.uef.fi/wavellite/wto#ComponentPropertyValueDouble */
	public static final String ComponentPropertyValueDouble = _("ComponentPropertyValueDouble");

	/** http://envi.uef.fi/wavellite/wto#ComponentPropertyValueInteger */
	public static final String ComponentPropertyValueInteger = _("ComponentPropertyValueInteger");

	/** http://envi.uef.fi/wavellite/wto#ComponentPropertyValueTemporalLocation */
	public static final String ComponentPropertyValueTemporalLocation = _("ComponentPropertyValueTemporalLocation");

	/** http://envi.uef.fi/wavellite/wto#ComponentPropertyValueUri */
	public static final String ComponentPropertyValueUri = _("ComponentPropertyValueUri");
	
	/** http://envi.uef.fi/wavellite/wto#AttributeValueDouble */
	public static final String AttributeValueDouble = _("AttributeValueDouble");
	
	/** http://envi.uef.fi/wavellite/wto#AttributeValueTemporalLocation */
	public static final String AttributeValueTemporalLocation = _("AttributeValueTemporalLocation");
	
	/** http://envi.uef.fi/wavellite/wto#AttributeValueString */
	public static final String AttributeValueString = _("AttributeValueString");
	
	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI Sensor = _uri(WTO.Sensor);
		public static final URI Property = _uri(WTO.Property);
		public static final URI Feature = _uri(WTO.Feature);
		public static final URI SensorObservation = _uri(WTO.SensorObservation);
		public static final URI TemporalLocationDateTime = _uri(WTO.TemporalLocationDateTime);
		public static final URI DatasetObservation = _uri(WTO.DatasetObservation);
		public static final URI Component = _uri(WTO.Component);
		public static final URI ComponentPropertyDomain = _uri(WTO.ComponentPropertyDimension);
		public static final URI ComponentPropertyRange = _uri(WTO.ComponentPropertyMeasure);
		public static final URI ComponentPropertyValueDouble = _uri(WTO.ComponentPropertyValueDouble);
		public static final URI ComponentPropertyValueInteger = _uri(WTO.ComponentPropertyValueInteger);
		public static final URI ComponentPropertyValueTemporalLocation = _uri(WTO.ComponentPropertyValueTemporalLocation);
		public static final URI ComponentPropertyValueUri = _uri(WTO.ComponentPropertyValueUri);
		public static final URI AttributeValueDouble = _uri(WTO.AttributeValueDouble);
		public static final URI AttributeValueTemporalLocation = _uri(WTO.AttributeValueTemporalLocation);
		public static final URI AttributeValueString = _uri(WTO.AttributeValueString);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
