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
 * Title: WOO
 * </p>
 * <p>
 * Description: Wavellite Operator Ontology
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

public class WOO {

	/** http://envi.uef.fi/wavellite/ontology/operator */
	public static final String ns = "http://envi.uef.fi/wavellite/ontology/operator";

	/** http://envi.uef.fi/wavellite/ontology/operator#Operator */
	public static final String Operator = _("Operator");

	/** http://envi.uef.fi/wavellite/ontology/operator#Translator */
	public static final String Translator = _("Translator");

	/** http://envi.uef.fi/wavellite/ontology/operator#Processor */
	public static final String Processor = _("Processor");

	/** http://envi.uef.fi/wavellite/ontology/operator#Extractor */
	public static final String Extractor = _("Extractor");

	/**
	 * http://envi.uef.fi/wavellite/ontology/operator#
	 * MeasurementResultTranslator
	 */
	public static final String MeasurementResultTranslator = _("MeasurementResultTranslator");

	/**
	 * http://envi.uef.fi/wavellite/ontology/operator#
	 * SensorObservationTranslator
	 */
	public static final String SensorObservationTranslator = _("SensorObservationTranslator");

	/**
	 * http://envi.uef.fi/wavellite/ontology/operator#
	 * DatasetObservationProcessor
	 */
	public static final String DatasetObservationProcessor = _("DatasetObservationProcessor");

	/** http://envi.uef.fi/wavellite/ontology/operator#SituationExtractor */
	public static final String SituationExtractor = _("SituationExtractor");

	/** http://envi.uef.fi/wavellite/ontology/operator#hasTranslated */
	public static final String hasTranslated = _("hasTranslated");

	/** http://envi.uef.fi/wavellite/ontology/operator#hasProcessed */
	public static final String hasProcessed = _("hasProcessed");

	/** http://envi.uef.fi/wavellite/ontology/operator#hasExtracted */
	public static final String hasExtracted = _("hasExtracted");

	/**
	 * http://envi.uef.fi/wavellite/ontology/operator#575f901c-4e5c-4ff9-93db-
	 * b0bc6e759d49
	 */
	public static final String theBaseMeasurementResultTranslator = _("575f901c-4e5c-4ff9-93db-b0bc6e759d49");

	/**
	 * http://envi.uef.fi/wavellite/ontology/operator#
	 * 21ebf942-a0f7-47c3-91c3-d5bebd710fa3
	 */
	public static final String theBaseSensorObservationTranslator = _("21ebf942-a0f7-47c3-91c3-d5bebd710fa3");

	/**
	 * http://envi.uef.fi/wavellite/ontology/operator#2561e068-7f67-4568-bea5-
	 * d70b27b59cf4
	 */
	public static final String theAggregateDatasetObservationProcessor = _("2561e068-7f67-4568-bea5-d70b27b59cf4");

	/**
	 * http://envi.uef.fi/wavellite/ontology/operator#2c005cfb-a0c3-403f-a11a-
	 * fecad6ceb83a
	 */
	public static final String theMergeDatasetObservationProcessor = _("2c005cfb-a0c3-403f-a11a-fecad6ceb83a");

	/**
	 * http://envi.uef.fi/wavellite/ontology/operator#725e72c0-cb3a-4e4f-95b5-17
	 * bb8210df67
	 */
	public static final String theWekaSituationExtractor = _("725e72c0-cb3a-4e4f-95b5-17bb8210df67");

	/**
	 * http://envi.uef.fi/wavellite/ontology/operator#b95ce68c-3bae-
	 * 43ef-acb4-9af404f01c3c
	 */
	public static final String theEsperSituationExtractor = _("b95ce68c-3bae-43ef-acb4-9af404f01c3c");

	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI Operator = _uri(WOO.Operator);
		public static final URI Translator = _uri(WOO.Translator);
		public static final URI Processor = _uri(WOO.Processor);
		public static final URI Extractor = _uri(WOO.Extractor);
		public static final URI MeasurementResultTranslator = _uri(WOO.MeasurementResultTranslator);
		public static final URI SensorObservationTranslator = _uri(WOO.SensorObservationTranslator);
		public static final URI DatasetObservationProcessor = _uri(WOO.DatasetObservationProcessor);
		public static final URI SituationExtractor = _uri(WOO.SituationExtractor);
		public static final URI hasTranslated = _uri(WOO.hasTranslated);
		public static final URI hasProcessed = _uri(WOO.hasProcessed);
		public static final URI hasExtracted = _uri(WOO.hasExtracted);
		public static final URI theBaseMeasurementResultTranslator = _uri(WOO.theBaseMeasurementResultTranslator);
		public static final URI theBaseSensorObservationTranslator = _uri(WOO.theBaseSensorObservationTranslator);
		public static final URI theAggregateDatasetObservationProcessor = _uri(WOO.theAggregateDatasetObservationProcessor);
		public static final URI theMergeDatasetObservationProcessor = _uri(WOO.theMergeDatasetObservationProcessor);
		public static final URI theWekaSituationExtractor = _uri(WOO.theWekaSituationExtractor);
		public static final URI theEsperSituationExtractor = _uri(WOO.theEsperSituationExtractor);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
