/*
 * Copyright (C) 2011 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.vocabulary;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * <p>
 * Title: SSN
 * </p>
 * <p>
 * Description: Semantic Sensor Network vocabulary
 * </p>
 * <p>
 * Project: Wavellite Core
 * </p>
 * <p>
 * Copyright: Copyright (C) 2011
 * </p>
 * 
 * @author Markus Stocker
 */

public class SSN {

	/** http://purl.oclc.org/NET/ssnx/ssn */
	public static final String ns = "http://purl.oclc.org/NET/ssnx/ssn";

	/** http://purl.oclc.org/NET/ssnx/ssn#Sensor */
	public static final String Sensor = _("Sensor");

	/** http://purl.oclc.org/NET/ssnx/ssn#SensingDevice */
	public static final String SensingDevice = _("SensingDevice");

	/** http://purl.oclc.org/NET/ssnx/ssn#Observation */
	public static final String Observation = _("Observation");

	/** http://purl.oclc.org/NET/ssnx/ssn#FeatureOfInterest */
	public static final String FeatureOfInterest = _("FeatureOfInterest");

	/** http://purl.oclc.org/NET/ssnx/ssn#Property */
	public static final String Property = _("Property");

	/** http://purl.oclc.org/NET/ssnx/ssn#SensorOutput */
	public static final String SensorOutput = _("SensorOutput");

	/** http://purl.oclc.org/NET/ssnx/ssn#ObservationValue */
	public static final String ObservationValue = _("ObservationValue");

	/** http://purl.oclc.org/NET/ssnx/ssn#System */
	public static final String System = _("System");

	/** http://purl.oclc.org/NET/ssnx/ssn#featureOfInterest */
	public static final String featureOfInterest = _("featureOfInterest");

	/** http://purl.oclc.org/NET/ssnx/ssn#observedProperty */
	public static final String observedProperty = _("observedProperty");

	/** http://purl.oclc.org/NET/ssnx/ssn#observedBy */
	public static final String observedBy = _("observedBy");

	/** http://purl.oclc.org/NET/ssnx/ssn#hasProperty */
	public static final String hasProperty = _("hasProperty");

	/** http://purl.oclc.org/NET/ssnx/ssn#hasValue */
	public static final String hasValue = _("hasValue");

	/** http://purl.oclc.org/NET/ssnx/ssn#observationResultTime */
	public static final String observationResultTime = _("observationResultTime");

	/** http://purl.oclc.org/NET/ssnx/ssn#observationResult */
	public static final String observationResult = _("observationResult");

	/** http://purl.oclc.org/NET/ssnx/ssn#isPropertyOf */
	public static final String isPropertyOf = _("isPropertyOf");

	/** http://purl.oclc.org/NET/ssnx/ssn#observes */
	public static final String observes = _("observes");

	/** http://purl.oclc.org/NET/ssnx/ssn#qualityOfObservation */
	public static final String qualityOfObservation = _("qualityOfObservation");

	public static class asURI {
		
		private static final ValueFactory f = ValueFactoryImpl.getInstance();
		
		public static final URI observedBy = _uri(SSN.observedBy);
		public static final URI observedProperty = _uri(SSN.observedProperty);
		public static final URI featureOfInterest = _uri(SSN.featureOfInterest);
		public static final URI observationResult = _uri(SSN.observationResult);
		public static final URI SensorOutput = _uri(SSN.SensorOutput);
		public static final URI ObservationValue = _uri(SSN.ObservationValue);
		
		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}
	
	private static String _(String fragment) {
		return ns + "#" + fragment;
	}
	
}
