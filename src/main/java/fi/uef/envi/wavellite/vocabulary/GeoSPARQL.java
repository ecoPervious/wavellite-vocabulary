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
 * Title: GeoSPARQL
 * </p>
 * <p>
 * Description:
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

public class GeoSPARQL {

	/** http://www.opengis.net/ont/geosparql */
	public static final String ns = "http://www.opengis.net/ont/geosparql";
	
	/** http://www.opengis.net/ont/geosparql#hasGeometry **/
	public static final String hasGeometry = _("hasGeometry");
	
	/** http://www.opengis.net/ont/geosparql#wktLiteral **/
	public static final String wktLiteral = _("wktLiteral");
	
	/** http://www.opengis.net/ont/geosparql#asWKT **/
	public static final String asWKT = _("asWKT");
	
	public static final class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI hasGeometry = _uri(GeoSPARQL.hasGeometry);
		public static final URI wktLiteral = _uri(GeoSPARQL.wktLiteral);
		public static final URI asWKT = _uri(GeoSPARQL.asWKT);
		
		private static URI _uri(String s) {
			return f.createURI(s);
		}

	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}
}
