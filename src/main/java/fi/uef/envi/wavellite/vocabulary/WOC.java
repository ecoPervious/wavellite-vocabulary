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
 * Title: WOC
 * </p>
 * <p>
 * Description: Wavellite Component Ontology
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

public class WOC {

	/** http://envi.uef.fi/wavellite/ontology/component */
	public static final String ns = "http://envi.uef.fi/wavellite/ontology/component";

	/** http://envi.uef.fi/wavellite/ontology/component#Component */
	public static final String Component = _("Component");

	/** http://envi.uef.fi/wavellite/ontology/component#Engine */
	public static final String Engine = _("Engine");

	/** http://envi.uef.fi/wavellite/ontology/component#Reader */
	public static final String Reader = _("Reader");

	/** http://envi.uef.fi/wavellite/ontology/component#Writer */
	public static final String Writer = _("Writer");

	/** http://envi.uef.fi/wavellite/ontology/component#MeasurementEngine */
	public static final String MeasurementEngine = _("MeasurementEngine");

	/** http://envi.uef.fi/wavellite/ontology/component#ObservationEngine */
	public static final String ObservationEngine = _("ObservationEngine");

	/** http://envi.uef.fi/wavellite/ontology/component#DatasetEngine */
	public static final String DatasetEngine = _("DatasetEngine");

	/** http://envi.uef.fi/wavellite/ontology/component#DerivationEngine */
	public static final String DerivationEngine = _("DerivationEngine");

	/** http://envi.uef.fi/wavellite/ontology/component#SituationEngine */
	public static final String SituationEngine = _("SituationEngine");

	/** http://envi.uef.fi/wavellite/ontology/component#ObservationReader */
	public static final String ObservationReader = _("ObservationReader");

	/** http://envi.uef.fi/wavellite/ontology/component#DerivationReader */
	public static final String DerivationReader = _("DerivationReader");

	/** http://envi.uef.fi/wavellite/ontology/component#ObservationWriter */
	public static final String ObservationWriter = _("ObservationWriter");

	/** http://envi.uef.fi/wavellite/ontology/component#DerivationWriter */
	public static final String DerivationWriter = _("DerivationWriter");

	/** http://envi.uef.fi/wavellite/ontology/component#SituationWriter */
	public static final String SituationWriter = _("SituationWriter");

	/** http://envi.uef.fi/wavellite/ontology/component#hasEmitted */
	public static final String hasEmitted = _("hasEmitted");

	/** http://envi.uef.fi/wavellite/ontology/component#hasEmitted */
	public static final String hasExecuted = _("hasExecuted");

	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI Component = _uri(WOC.Component);
		public static final URI Engine = _uri(WOC.Engine);
		public static final URI Reader = _uri(WOC.Reader);
		public static final URI Writer = _uri(WOC.Writer);
		public static final URI MeasurementEngine = _uri(WOC.MeasurementEngine);
		public static final URI ObservationEngine = _uri(WOC.ObservationEngine);
		public static final URI DatasetEngine = _uri(WOC.DatasetEngine);
		public static final URI DerivationEngine = _uri(WOC.DerivationEngine);
		public static final URI SituationEngine = _uri(WOC.SituationEngine);
		public static final URI ObservationReader = _uri(WOC.ObservationReader);
		public static final URI DerivationReader = _uri(WOC.DerivationReader);
		public static final URI ObservationWriter = _uri(WOC.ObservationWriter);
		public static final URI DerivationWriter = _uri(WOC.DerivationWriter);
		public static final URI SituationWriter = _uri(WOC.SituationWriter);
		public static final URI hasEmitted = _uri(WOC.hasEmitted);
		public static final URI hasExecuted = _uri(WOC.hasExecuted);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
