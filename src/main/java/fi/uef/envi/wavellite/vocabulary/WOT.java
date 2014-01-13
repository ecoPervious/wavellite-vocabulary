/*
 * Copyright (C) 2014 see CREDITS.txt
 * All rights reserved.
 */

package fi.uef.envi.wavellite.vocabulary;

import org.openrdf.model.URI;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.ValueFactoryImpl;

/**
 * <p>
 * Title: WOT
 * </p>
 * <p>
 * Description: Wavellite Task Ontology
 * </p>
 * <p>
 * Project: Wavellite Vocabulary
 * </p>
 * <p>
 * Copyright: Copyright (C) 2014
 * </p>
 * 
 * @author Markus Stocker
 */

public class WOT {

	/** http://envi.uef.fi/wavellite/ontology/task */
	public static final String ns = "http://envi.uef.fi/wavellite/ontology/task";

	/** http://envi.uef.fi/wavellite/ontology/task#ComplexTask */
	public static final String ComplexTask = _("ComplexTask");
	
	/** http://envi.uef.fi/wavellite/ontology/task#WavelliteTask */
	public static final String WavelliteTask = _("WavelliteTask");
	
	/** http://envi.uef.fi/wavellite/ontology/task#SimpleTask */
	public static final String SimpleTask = _("SimpleTask");
	
	/** http://envi.uef.fi/wavellite/ontology/task#CompositeTask */
	public static final String CompositeTask = _("CompositeTask");
	
	/** http://envi.uef.fi/wavellite/ontology/task#AtomicTask */
	public static final String AtomicTask = _("AtomicTask");
	
	/** http://envi.uef.fi/wavellite/ontology/task#DataAcquisition */
	public static final String DataAcquisition = _("DataAcquisition");
	
	/** http://envi.uef.fi/wavellite/ontology/task#DataProcessing */
	public static final String DataProcessing = _("DataProcessing");
	
	/** http://envi.uef.fi/wavellite/ontology/task#DatasetObservationAcquisition */
	public static final String DatasetObservationAcquisition = _("DatasetObservationAcquisition");
	
	/** http://envi.uef.fi/wavellite/ontology/task#DatasetObservationPersistence */
	public static final String DatasetObservationPersistence = _("DatasetObservationPersistence");
	
	/** http://envi.uef.fi/wavellite/ontology/task#DatasetObservationProcessing */
	public static final String DatasetObservationProcessing = _("DatasetObservationProcessing");
	
	/** http://envi.uef.fi/wavellite/ontology/task#KnowledgeRepresentation */
	public static final String KnowledgeRepresentation = _("KnowledgeRepresentation");
	
	/** http://envi.uef.fi/wavellite/ontology/task#MeasurementResultAcquisition */
	public static final String MeasurementResultAcquisition = _("MeasurementResultAcquisition");
	
	/** http://envi.uef.fi/wavellite/ontology/task#MeasurementResultTranslation */
	public static final String MeasurementResultTranslation = _("MeasurementResultTranslation");
	
	/** http://envi.uef.fi/wavellite/ontology/task#SensorObservationAcquisition */
	public static final String SensorObservationAcquisition = _("SensorObservationAcquisition");
	
	/** http://envi.uef.fi/wavellite/ontology/task#SensorObservationPersistence */
	public static final String SensorObservationPersistence = _("SensorObservationPersistence");
	
	/** http://envi.uef.fi/wavellite/ontology/task#SensorObservationTranslation */
	public static final String SensorObservationTranslation = _("SensorObservationTranslation");
	
	/** http://envi.uef.fi/wavellite/ontology/task#SituationPersistence */
	public static final String SituationPersistence = _("SituationPersistence");
	
	/** http://envi.uef.fi/wavellite/ontology/task#SituationRepresentation */
	public static final String SituationRepresentation = _("SituationRepresentation");
	
	/** http://envi.uef.fi/wavellite/ontology/task#performs */
	public static final String performs = _("performs");
	
	/** http://envi.uef.fi/wavellite/ontology/task#isPerformedBy */
	public static final String isPerformedBy = _("isPerformedBy");

	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI ComplexTask = _uri(WOT.ComplexTask);
		public static final URI WavelliteTask = _uri(WOT.WavelliteTask);
		public static final URI SimpleTask = _uri(WOT.SimpleTask);
		public static final URI CompositeTask = _uri(WOT.CompositeTask);
		public static final URI AtomicTask = _uri(WOT.AtomicTask);
		public static final URI DataAcquisition = _uri(WOT.DataAcquisition);
		public static final URI DataProcessing = _uri(WOT.DataProcessing);
		public static final URI DatasetObservationAcquisition = _uri(WOT.DatasetObservationAcquisition);
		public static final URI DatasetObservationPersistence = _uri(WOT.DatasetObservationPersistence);
		public static final URI DatasetObservationProcessing = _uri(WOT.DatasetObservationProcessing);		
		public static final URI KnowledgeRepresentation = _uri(WOT.KnowledgeRepresentation);
		public static final URI MeasurementResultAcquisition = _uri(WOT.MeasurementResultAcquisition);
		public static final URI MeasurementResultTranslation = _uri(WOT.MeasurementResultTranslation);
		public static final URI SensorObservationAcquisition = _uri(WOT.SensorObservationAcquisition);
		public static final URI SensorObservationPersistence = _uri(WOT.SensorObservationPersistence);
		public static final URI SensorObservationTranslation = _uri(WOT.SensorObservationTranslation);
		public static final URI SituationPersistence = _uri(WOT.SituationPersistence);
		public static final URI SituationRepresentation = _uri(WOT.SituationRepresentation);
		public static final URI performs = _uri(WOT.performs);
		public static final URI isPerformedBy = _uri(WOT.isPerformedBy);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
