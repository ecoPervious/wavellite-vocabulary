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
 * Title: WOM
 * </p>
 * <p>
 * Description: Wavellite Module Ontology
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

public class WOM {

	/** http://envi.uef.fi/wavellite/ontology/module */
	public static final String ns = "http://envi.uef.fi/wavellite/ontology/module";

	/** http://envi.uef.fi/wavellite/ontology/module#Module */
	public static final String Module = _("Module");

	/** http://envi.uef.fi/wavellite/ontology/module#ProcessingModule */
	public static final String ProcessingModule = _("ProcessingModule");

	/** http://envi.uef.fi/wavellite/ontology/module#LearningModule */
	public static final String LearningModule = _("LearningModule");

	/** http://envi.uef.fi/wavellite/ontology/module#StoreModule */
	public static final String StoreModule = _("StoreModule");

	/** http://envi.uef.fi/wavellite/ontology/module#hasConsidered */
	public static final String hasConsidered = _("hasConsidered");

	/** http://envi.uef.fi/wavellite/ontology/module#operates */
	public static final String operates = _("operates");

	/** http://envi.uef.fi/wavellite/ontology/module#isOperatedBy */
	public static final String isOperatedBy = _("isOperatedBy");

	/**
	 * http://envi.uef.fi/wavellite/ontology/module#10d71027-3c1a-4dc8-be29-
	 * 39118ee94758
	 */
	public static final String theMeasurementResultProcessingModule = _("10d71027-3c1a-4dc8-be29-39118ee94758");

	/**
	 * http://envi.uef.fi/wavellite/ontology/module#5833f15f-bc6c-4f42-83aa-
	 * b0dd0848ba77
	 */
	public static final String theFileStoreModule = _("5833f15f-bc6c-4f42-83aa-b0dd0848ba77");

	/**
	 * http://envi.uef.fi/wavellite/ontology/module#f5fa32c5-333b-417f-831f-2
	 * b70dd150ebd
	 */
	public static final String theStardogStoreModule = _("f5fa32c5-333b-417f-831f-2b70dd150ebd");

	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI Module = _uri(WOM.Module);
		public static final URI ProcessingModule = _uri(WOM.ProcessingModule);
		public static final URI LearningModule = _uri(WOM.LearningModule);
		public static final URI StoreModule = _uri(WOM.StoreModule);
		public static final URI hasConsidered = _uri(WOM.hasConsidered);
		public static final URI operates = _uri(WOM.operates);
		public static final URI isOperatedBy = _uri(WOM.isOperatedBy);
		public static final URI theMeasurementResultProcessingModule = _uri(WOM.theMeasurementResultProcessingModule);
		public static final URI theFileStoreModule = _uri(WOM.theFileStoreModule);
		public static final URI theStardogStoreModule = _uri(WOM.theStardogStoreModule);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
