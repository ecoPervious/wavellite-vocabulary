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
 * Title: DUL
 * </p>
 * <p>
 * Description: DOLCE+DnS Ultralite Ontology vocabulary
 * </p>
 * <p>
 * Project: Wavellite Vocabulary
 * </p>
 * <p>
 * Copyright: Copyright (C) 2011
 * </p>
 * 
 * @author Markus Stocker
 */

public class DUL {

	public static final String ns = "http://www.loa-cnr.it/ontologies/DUL.owl";

	/** http://www.loa-cnr.it/ontologies/DUL.owl#Quality */
	public static final String Quality = _("Quality");

	/** http://www.loa-cnr.it/ontologies/DUL.owl#Region */
	public static final String Region = _("Region");

	/** http://www.loa-cnr.it/ontologies/DUL.owl#TimeInterval */
	public static final String TimeInterval = _("TimeInterval");
	
	/** http://www.loa-cnr.it/ontologies/DUL.owl#PhysicalPlace */
	public static final String PhysicalPlace = _("PhysicalPlace");
	
	/** http://www.loa-cnr.it/ontologies/DUL.owl#SpaceRegion */
	public static final String SpaceRegion = _("SpaceRegion");

	/** http://www.loa-cnr.it/ontologies/DUL.owl#hasRegionDataValue */
	public static final String hasRegionDataValue = _("hasRegionDataValue");

	/** http://www.loa-cnr.it/ontologies/DUL.owl#hasRegion */
	public static final String hasRegion = _("hasRegion");

	public static final class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();
		
		public static final URI Quality = _uri(DUL.Quality);
		public static final URI Region = _uri(DUL.Region);
		public static final URI TimeInterval = _uri(DUL.TimeInterval);
		public static final URI PhysicalPlace = _uri(DUL.PhysicalPlace);
		public static final URI SpaceRegion = _uri(DUL.SpaceRegion);
		public static final URI hasRegionDataValue = _uri(DUL.hasRegionDataValue);
		public static final URI hasRegion = _uri(DUL.hasRegion);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}
}
