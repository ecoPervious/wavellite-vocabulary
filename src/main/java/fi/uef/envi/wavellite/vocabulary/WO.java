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
 * Title: WO
 * </p>
 * <p>
 * Description:
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

public class WO {

	/** http://envi.uef.fi/wavellite */
	public static final String ns = "http://envi.uef.fi/wavellite";

	/** http://envi.uef.fi/wavellite#Entity */
	public static final String Entity = _("Entity");
	
	/** http://envi.uef.fi/wavellite#TemporalLocationDateTime */
	public static final String TemporalLocationDateTime = _("TemporalLocationDateTime");

	/** http://envi.uef.fi/wavellite#MeasurementValue */
	public static final String MeasurementValue = _("MeasurementValue");

	/** http://envi.uef.fi/wavellite#MeasurementValueContext */
	public static final String MeasurementValueContext = _("MeasurementValueContext");

	/** http://envi.uef.fi/wavellite#MeasurementResult */
	public static final String MeasurementResult = _("MeasurementResult");

	/** http://envi.uef.fi/wavellite#MeasurementValueDouble */
	public static final String MeasurementValueDouble = _("MeasurementValueDouble");

	/** http://envi.uef.fi/wavellite#Sensor */
	public static final String Sensor = _("Sensor");

	/** http://envi.uef.fi/wavellite#Feature */
	public static final String Feature = _("Feature");

	/** http://envi.uef.fi/wavellite#Property */
	public static final String Property = _("Property");

	/** http://envi.uef.fi/wavellite#SensorObservation */
	public static final String SensorObservation = _("SensorObservation");

	/** http://envi.uef.fi/wavellite#DatasetObservation */
	public static final String DatasetObservation = _("DatasetObservation");
	
	/** http://envi.uef.fi/wavellite#Component */
	public static final String Component = _("Component");
	
	/** http://envi.uef.fi/wavellite#ComponentPropertyDimension */
	public static final String ComponentPropertyDimension = _("ComponentPropertyDimension");
	
	/** http://envi.uef.fi/wavellite#ComponentPropertyMeasure */
	public static final String ComponentPropertyMeasure = _("ComponentPropertyMeasure");

	/** http://envi.uef.fi/wavellite#ComponentPropertyValueDouble */
	public static final String ComponentPropertyValueDouble = _("ComponentPropertyValueDouble");

	/** http://envi.uef.fi/wavellite#ComponentPropertyValueInteger */
	public static final String ComponentPropertyValueInteger = _("ComponentPropertyValueInteger");

	/** http://envi.uef.fi/wavellite#ComponentPropertyValueTemporalLocation */
	public static final String ComponentPropertyValueTemporalLocation = _("ComponentPropertyValueTemporalLocation");

	/** http://envi.uef.fi/wavellite#ComponentPropertyValueUri */
	public static final String ComponentPropertyValueUri = _("ComponentPropertyValueUri");
	
	/** http://envi.uef.fi/wavellite#AttributeValueDouble */
	public static final String AttributeValueDouble = _("AttributeValueDouble");
	
	/** http://envi.uef.fi/wavellite#AttributeValueTemporalLocation */
	public static final String AttributeValueTemporalLocation = _("AttributeValueTemporalLocation");
	
	/** http://envi.uef.fi/wavellite#AttributeValueString */
	public static final String AttributeValueString = _("AttributeValueString");
	
	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI Sensor = _uri(WO.Sensor);
		public static final URI Property = _uri(WO.Property);
		public static final URI Feature = _uri(WO.Feature);
		public static final URI SensorObservation = _uri(WO.SensorObservation);
		public static final URI TemporalLocationDateTime = _uri(WO.TemporalLocationDateTime);
		public static final URI DatasetObservation = _uri(WO.DatasetObservation);
		public static final URI Component = _uri(WO.Component);
		public static final URI ComponentPropertyDomain = _uri(WO.ComponentPropertyDimension);
		public static final URI ComponentPropertyRange = _uri(WO.ComponentPropertyMeasure);
		public static final URI ComponentPropertyValueDouble = _uri(WO.ComponentPropertyValueDouble);
		public static final URI ComponentPropertyValueInteger = _uri(WO.ComponentPropertyValueInteger);
		public static final URI ComponentPropertyValueTemporalLocation = _uri(WO.ComponentPropertyValueTemporalLocation);
		public static final URI ComponentPropertyValueUri = _uri(WO.ComponentPropertyValueUri);
		public static final URI AttributeValueDouble = _uri(WO.AttributeValueDouble);
		public static final URI AttributeValueTemporalLocation = _uri(WO.AttributeValueTemporalLocation);
		public static final URI AttributeValueString = _uri(WO.AttributeValueString);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
