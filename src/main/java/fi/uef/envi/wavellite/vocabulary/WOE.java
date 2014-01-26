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

	/** http://envi.uef.fi/wavellite/ontology/entity */
	public static final String ns = "http://envi.uef.fi/wavellite/ontology/entity";

	/** http://envi.uef.fi/wavellite/ontology/entity#Entity */
	public static final String Entity = _("Entity");

	/** http://envi.uef.fi/wavellite/ontology/entity#TemporalLocation */
	public static final String TemporalLocation = _("TemporalLocation");

	/** http://envi.uef.fi/wavellite/ontology/entity#TimePoint */
	public static final String TimePoint = _("TimePoint");

	/** http://envi.uef.fi/wavellite/ontology/entity#TimeInterval */
	public static final String TimeInterval = _("TimeInterval");

	/** http://envi.uef.fi/wavellite/ontology/entity#SpatialLocation */
	public static final String SpatialLocation = _("SpatialLocation");

	/** http://envi.uef.fi/wavellite/ontology/entity#SpatialPlace */
	public static final String SpatialPlace = _("SpatialPlace");

	/** http://envi.uef.fi/wavellite/ontology/entity#SpatialRegion */
	public static final String SpatialRegion = _("SpatialRegion");

	/** http://envi.uef.fi/wavellite/ontology/entity#MeasurementValue */
	public static final String MeasurementValue = _("MeasurementValue");

	/** http://envi.uef.fi/wavellite/ontology/entity#MeasurementValueContext */
	public static final String MeasurementValueContext = _("MeasurementValueContext");

	/** http://envi.uef.fi/wavellite/ontology/entity#MeasurementResult */
	public static final String MeasurementResult = _("MeasurementResult");

	/** http://envi.uef.fi/wavellite/ontology/entity#SensorObservation */
	public static final String SensorObservation = _("SensorObservation");

	/** http://envi.uef.fi/wavellite/ontology/entity#DatasetObservation */
	public static final String DatasetObservation = _("DatasetObservation");

	/** http://envi.uef.fi/wavellite/ontology/entity#Component */
	public static final String Component = _("Component");
	
	/** http://envi.uef.fi/wavellite/ontology/entity#ComponentPropertyValue */
	public static final String ComponentPropertyValue = _("ComponentPropertyValue");

	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

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
