/*
 * Copyright (C) 2013 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.vocabulary;

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
	
	/** http://envi.uef.fi/wavellite#MeasurementValue */
	public static final String MeasurementValue = _("MeasurementValue");
	
	/** http://envi.uef.fi/wavellite#MeasurementContext */
	public static final String MeasurementContext = _("MeasurementContext");
	
	/** http://envi.uef.fi/wavellite#MeasurementResult */
	public static final String MeasurementResult = _("MeasurementResult");
	
	/** http://envi.uef.fi/wavellite#DoubleMeasurementValue */
	public static final String DoubleMeasurementValue = _("DoubleMeasurementValue");
	
	/** http://envi.uef.fi/wavellite#Sensor */
	public static final String Sensor = _("Sensor");
	
	/** http://envi.uef.fi/wavellite#Feature */
	public static final String Feature = _("Feature");
	
	/** http://envi.uef.fi/wavellite#Property */
	public static final String Property = _("Property");
	
	/** http://envi.uef.fi/wavellite#SensorObservation */
	public static final String SensorObservation = _("SensorObservation");
	
	private static String _(String fragment) {
		return ns + "#" + fragment;
	}
	
}
