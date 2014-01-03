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
 * Description: The Wavellite task can be described as the acquisition and
 * representation of situational knowledge from sensor data for environmental
 * phenomena. The WTO describes the Wavellite entities that are relevant to this
 * task.
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

	/** http://envi.uef.fi/wavellite/wto#TemporalLocation */
	public static final String TemporalLocation = _("TemporalLocation");

	/** http://envi.uef.fi/wavellite/wto#TemporalLocationDateTime */
	public static final String TemporalLocationDateTime = _("TemporalLocationDateTime");

	/** http://envi.uef.fi/wavellite/wto#TemporalLocationInterval */
	public static final String TemporalLocationInterval = _("TemporalLocationInterval");

	/** http://envi.uef.fi/wavellite/wto#SpatialLocation */
	public static final String SpatialLocation = _("SpatialLocation");

	/** http://envi.uef.fi/wavellite/wto#SpatialLocationQualitative */
	public static final String SpatialLocationQualitative = _("SpatialLocationQualitative");

	/** http://envi.uef.fi/wavellite/wto#SpatialLocationQuantitative */
	public static final String SpatialLocationQuantitative = _("SpatialLocationQuantitative");

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

	/** http://envi.uef.fi/wavellite/wto#ComponentPropertyValueString */
	public static final String ComponentPropertyValueString = _("ComponentPropertyValueString");

	/** http://envi.uef.fi/wavellite/wto#ComponentPropertyValueTemporalLocation */
	public static final String ComponentPropertyValueTemporalLocation = _("ComponentPropertyValueTemporalLocation");

	/** http://envi.uef.fi/wavellite/wto#ComponentPropertyValueSpatialLocation */
	public static final String ComponentPropertyValueSpatialLocation = _("ComponentPropertyValueSpatialLocation");

	/** http://envi.uef.fi/wavellite/wto#ComponentPropertyValueUri */
	public static final String ComponentPropertyValueUri = _("ComponentPropertyValueUri");

	/** http://envi.uef.fi/wavellite/wto#AttributeValueDouble */
	public static final String AttributeValueDouble = _("AttributeValueDouble");

	/** http://envi.uef.fi/wavellite/wto#AttributeValueTemporalLocation */
	public static final String AttributeValueTemporalLocation = _("AttributeValueTemporalLocation");

	/** http://envi.uef.fi/wavellite/wto#AttributeValueString */
	public static final String AttributeValueString = _("AttributeValueString");

	/** http://envi.uef.fi/wavellite/wto#AttributeValueUri */
	public static final String AttributeValueUri = _("AttributeValueUri");

	/** http://envi.uef.fi/wavellite/wto#AttributeValueInteger */
	public static final String AttributeValueInteger = _("AttributeValueInteger");

	/** http://envi.uef.fi/wavellite/wto#AttributeValueSpatialLocation */
	public static final String AttributeValueSpatialLocation = _("AttributeValueSpatialLocation");

	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI Sensor = _uri(WTO.Sensor);
		public static final URI Property = _uri(WTO.Property);
		public static final URI Feature = _uri(WTO.Feature);
		public static final URI SensorObservation = _uri(WTO.SensorObservation);
		public static final URI TemporalLocation = _uri(WTO.TemporalLocation);
		public static final URI TemporalLocationDateTime = _uri(WTO.TemporalLocationDateTime);
		public static final URI TemporalLocationInterval = _uri(WTO.TemporalLocationInterval);
		public static final URI SpatialLocation = _uri(WTO.SpatialLocation);
		public static final URI SpatialLocationQualitative = _uri(WTO.SpatialLocationQualitative);
		public static final URI SpatialLocationQuantitative = _uri(WTO.SpatialLocationQuantitative);
		public static final URI DatasetObservation = _uri(WTO.DatasetObservation);
		public static final URI Component = _uri(WTO.Component);
		public static final URI ComponentPropertyDomain = _uri(WTO.ComponentPropertyDimension);
		public static final URI ComponentPropertyRange = _uri(WTO.ComponentPropertyMeasure);
		public static final URI ComponentPropertyValueDouble = _uri(WTO.ComponentPropertyValueDouble);
		public static final URI ComponentPropertyValueInteger = _uri(WTO.ComponentPropertyValueInteger);
		public static final URI ComponentPropertyValueString = _uri(WTO.ComponentPropertyValueString);
		public static final URI ComponentPropertyValueTemporalLocation = _uri(WTO.ComponentPropertyValueTemporalLocation);
		public static final URI ComponentPropertyValueUri = _uri(WTO.ComponentPropertyValueUri);
		public static final URI ComponentPropertyValueSpatialLocation = _uri(WTO.ComponentPropertyValueSpatialLocation);
		public static final URI AttributeValueDouble = _uri(WTO.AttributeValueDouble);
		public static final URI AttributeValueTemporalLocation = _uri(WTO.AttributeValueTemporalLocation);
		public static final URI AttributeValueString = _uri(WTO.AttributeValueString);
		public static final URI AttributeValueInteger = _uri(WTO.AttributeValueInteger);
		public static final URI AttributeValueUri = _uri(WTO.AttributeValueUri);
		public static final URI AttributeValueSpatialLocation = _uri(WTO.AttributeValueSpatialLocation);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
