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

	/** http://envi.uef.fi/wavellite/wo/entity#Sensor */
	public static final String Sensor = _("Sensor");

	/** http://envi.uef.fi/wavellite/wo/entity#Feature */
	public static final String Feature = _("Feature");

	/** http://envi.uef.fi/wavellite/wo/entity#Property */
	public static final String Property = _("Property");

	/** http://envi.uef.fi/wavellite/wo/entity#SensorObservation */
	public static final String SensorObservation = _("SensorObservation");

	/** http://envi.uef.fi/wavellite/wo/entity#DatasetObservation */
	public static final String DatasetObservation = _("DatasetObservation");

	/** http://envi.uef.fi/wavellite/wo/entity#Component */
	public static final String Component = _("Component");
	
	/** http://envi.uef.fi/wavellite/wo/entity#ComponentPropertyValue */
	public static final String ComponentPropertyValue = _("ComponentPropertyValue");
	
	/** http://envi.uef.fi/wavellite/wo/entity#RelevantObject */
	public static final String RelevantObject = _("RelevantObject");

	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI Sensor = _uri(WOE.Sensor);
		public static final URI Property = _uri(WOE.Property);
		public static final URI Feature = _uri(WOE.Feature);
		public static final URI SensorObservation = _uri(WOE.SensorObservation);
		public static final URI TemporalLocation = _uri(WOE.TemporalLocation);
		public static final URI TimePoint = _uri(WOE.TimePoint);
		public static final URI TimeInterval = _uri(WOE.TimeInterval);
		public static final URI SpatialLocation = _uri(WOE.SpatialLocation);
		public static final URI SpatialPlace = _uri(WOE.SpatialPlace);
		public static final URI SpatialRegion = _uri(WOE.SpatialRegion);
		public static final URI DatasetObservation = _uri(WOE.DatasetObservation);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
