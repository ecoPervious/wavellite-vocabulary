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
 * Title: WOE
 * </p>
 * <p>
 * Description: Wavellite Entity Ontology
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

public class WOE {

	/** http://envi.uef.fi/wavellite/wo/entity */
	public static final String ns = "http://envi.uef.fi/wavellite/wo/entity";

	/** http://envi.uef.fi/wavellite/wo/entity#Entity */
	public static final String Entity = _("Entity");

	/** http://envi.uef.fi/wavellite/wo/entity#TemporalLocation */
	public static final String TemporalLocation = _("TemporalLocation");

	/** http://envi.uef.fi/wavellite/wo/entity#TimePoint */
	public static final String TimePoint = _("TimePoint");

	/** http://envi.uef.fi/wavellite/wo/entity#TimeInterval */
	public static final String TimeInterval = _("TimeInterval");

	/** http://envi.uef.fi/wavellite/wo/entity#SpatialLocation */
	public static final String SpatialLocation = _("SpatialLocation");

	/** http://envi.uef.fi/wavellite/wo/entity#SpatialPlace */
	public static final String SpatialPlace = _("SpatialPlace");

	/** http://envi.uef.fi/wavellite/wo/entity#SpatialRegion */
	public static final String SpatialRegion = _("SpatialRegion");

	/** http://envi.uef.fi/wavellite/wo/entity#MeasurementValue */
	public static final String MeasurementValue = _("MeasurementValue");

	/** http://envi.uef.fi/wavellite/wo/entity#MeasurementValueContext */
	public static final String MeasurementValueContext = _("MeasurementValueContext");

	/** http://envi.uef.fi/wavellite/wo/entity#MeasurementResult */
	public static final String MeasurementResult = _("MeasurementResult");

	/** http://envi.uef.fi/wavellite/wo/entity#MeasurementValueDouble */
	public static final String MeasurementValueDouble = _("MeasurementValueDouble");

	/** http://envi.uef.fi/wavellite/wo/entity#Sensor */
	public static final String Sensor = _("Sensor");

	/** http://envi.uef.fi/wavellite/wo/entity#Feature */
	public static final String Feature = _("Feature");

	/** http://envi.uef.fi/wavellite/wo/entity#Property */
	public static final String Property = _("Property");

	/** http://envi.uef.fi/wavellite/wo/entity#SensorObservation */
	public static final String SensorObservation = _("SensorObservation");
	
	/** http://envi.uef.fi/wavellite/wo/entity#ObservationValueDouble */
	public static final String ObservationValueDouble = _("ObservationValueDouble");

	/** http://envi.uef.fi/wavellite/wo/entity#DatasetObservation */
	public static final String DatasetObservation = _("DatasetObservation");

	/** http://envi.uef.fi/wavellite/wo/entity#Component */
	public static final String Component = _("Component");

	/** http://envi.uef.fi/wavellite/wo/entity#ComponentPropertyDimension */
	public static final String ComponentPropertyDimension = _("ComponentPropertyDimension");

	/** http://envi.uef.fi/wavellite/wo/entity#ComponentPropertyMeasure */
	public static final String ComponentPropertyMeasure = _("ComponentPropertyMeasure");

	/** http://envi.uef.fi/wavellite/wo/entity#ComponentPropertyValueDouble */
	public static final String ComponentPropertyValueDouble = _("ComponentPropertyValueDouble");

	/** http://envi.uef.fi/wavellite/wo/entity#ComponentPropertyValueInteger */
	public static final String ComponentPropertyValueInteger = _("ComponentPropertyValueInteger");

	/** http://envi.uef.fi/wavellite/wo/entity#ComponentPropertyValueString */
	public static final String ComponentPropertyValueString = _("ComponentPropertyValueString");

	/** http://envi.uef.fi/wavellite/wo/entity#ComponentPropertyValueTemporalLocation */
	public static final String ComponentPropertyValueTemporalLocation = _("ComponentPropertyValueTemporalLocation");

	/** http://envi.uef.fi/wavellite/wo/entity#ComponentPropertyValueSpatialLocation */
	public static final String ComponentPropertyValueSpatialLocation = _("ComponentPropertyValueSpatialLocation");

	/** http://envi.uef.fi/wavellite/wo/entity#ComponentPropertyValueUri */
	public static final String ComponentPropertyValueUri = _("ComponentPropertyValueUri");

	/** http://envi.uef.fi/wavellite/wo/entity#AttributeValueDouble */
	public static final String AttributeValueDouble = _("AttributeValueDouble");

	/** http://envi.uef.fi/wavellite/wo/entity#AttributeValueTemporalLocation */
	public static final String AttributeValueTemporalLocation = _("AttributeValueTemporalLocation");

	/** http://envi.uef.fi/wavellite/wo/entity#AttributeValueString */
	public static final String AttributeValueString = _("AttributeValueString");

	/** http://envi.uef.fi/wavellite/wo/entity#AttributeValueUri */
	public static final String AttributeValueUri = _("AttributeValueUri");

	/** http://envi.uef.fi/wavellite/wo/entity#AttributeValueInteger */
	public static final String AttributeValueInteger = _("AttributeValueInteger");

	/** http://envi.uef.fi/wavellite/wo/entity#AttributeValueSpatialLocation */
	public static final String AttributeValueSpatialLocation = _("AttributeValueSpatialLocation");

	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI Sensor = _uri(WOE.Sensor);
		public static final URI Property = _uri(WOE.Property);
		public static final URI Feature = _uri(WOE.Feature);
		public static final URI SensorObservation = _uri(WOE.SensorObservation);
		public static final URI ObservationValueDouble = _uri(WOE.ObservationValueDouble);
		public static final URI TemporalLocation = _uri(WOE.TemporalLocation);
		public static final URI TimePoint = _uri(WOE.TimePoint);
		public static final URI TimeInterval = _uri(WOE.TimeInterval);
		public static final URI SpatialLocation = _uri(WOE.SpatialLocation);
		public static final URI SpatialPlace = _uri(WOE.SpatialPlace);
		public static final URI SpatialRegion = _uri(WOE.SpatialRegion);
		public static final URI DatasetObservation = _uri(WOE.DatasetObservation);
		public static final URI Component = _uri(WOE.Component);
		public static final URI ComponentPropertyDomain = _uri(WOE.ComponentPropertyDimension);
		public static final URI ComponentPropertyRange = _uri(WOE.ComponentPropertyMeasure);
		public static final URI ComponentPropertyValueDouble = _uri(WOE.ComponentPropertyValueDouble);
		public static final URI ComponentPropertyValueInteger = _uri(WOE.ComponentPropertyValueInteger);
		public static final URI ComponentPropertyValueString = _uri(WOE.ComponentPropertyValueString);
		public static final URI ComponentPropertyValueTemporalLocation = _uri(WOE.ComponentPropertyValueTemporalLocation);
		public static final URI ComponentPropertyValueUri = _uri(WOE.ComponentPropertyValueUri);
		public static final URI ComponentPropertyValueSpatialLocation = _uri(WOE.ComponentPropertyValueSpatialLocation);
		public static final URI AttributeValueDouble = _uri(WOE.AttributeValueDouble);
		public static final URI AttributeValueTemporalLocation = _uri(WOE.AttributeValueTemporalLocation);
		public static final URI AttributeValueString = _uri(WOE.AttributeValueString);
		public static final URI AttributeValueInteger = _uri(WOE.AttributeValueInteger);
		public static final URI AttributeValueUri = _uri(WOE.AttributeValueUri);
		public static final URI AttributeValueSpatialLocation = _uri(WOE.AttributeValueSpatialLocation);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
