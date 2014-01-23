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
 * Title: SF
 * </p>
 * <p>
 * Description: Simple Features Ontology
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

public class SF {

	/** http://www.opengis.net/ont/sf */
	public static final String ns = "http://www.opengis.net/ont/sf";
	
	/** http://www.opengis.net/ont/sf#Geometry */
	public static final String Geometry = _("Geometry");
	
	/** http://www.opengis.net/ont/sf#Point */
	public static final String Point = _("Point");
	
	/** http://www.opengis.net/ont/sf#Polygon */
	public static final String Polygon = _("Polygon");
	
	/** http://www.opengis.net/ont/sf#LineString */
	public static final String LineString = _("LineString");
	
	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI Geometry = _uri(SF.Geometry);
		public static final URI Point = _uri(SF.Point);
		public static final URI Polygon = _uri(SF.Polygon);
		public static final URI LineString = _uri(SF.LineString);
		
		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}
	
}
