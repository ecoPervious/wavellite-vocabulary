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
 * Title: Time
 * </p>
 * <p>
 * Description: The OWL-Time Ontology
 * </p>
 * <p>
 * Project:
 * </p>
 * <p>
 * Copyright: Copyright (C) 2013
 * </p>
 * 
 * @author Markus Stocker
 */

public class Time {

	public static final String ns = "http://www.w3.org/2006/time";

	/** http://www.w3.org/2006/time#Instant **/
	public static final String Instant = _("Instant");

	/** http://www.w3.org/2006/time#DateTimeInterval **/
	public static final String DateTimeInterval = _("DateTimeInterval");

	/** http://www.w3.org/2006/time#DateTimeDescription **/
	public static final String DateTimeDescription = _("DateTimeDescription");

	/** http://www.w3.org/2006/time#DurationDescription **/
	public static final String DurationDescription = _("DurationDescription");

	/** http://www.w3.org/2006/time#inXSDDateTime **/
	public static final String inXSDDateTime = _("inXSDDateTime");

	/** http://www.w3.org/2006/time#hasBeginning **/
	public static final String hasBeginning = _("hasBeginning");

	/** http://www.w3.org/2006/time#hasEnd **/
	public static final String hasEnd = _("hasEnd");

	/** http://www.w3.org/2006/time#inDateTime **/
	public static final String inDateTime = _("inDateTime");

	/** http://www.w3.org/2006/time#hasDurationDescription **/
	public static final String hasDurationDescription = _("hasDurationDescription");

	public static final class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI Instant = _uri(Time.Instant);
		public static final URI DateTimeInterval = _uri(Time.DateTimeInterval);
		public static final URI inXSDDateTime = _uri(Time.inXSDDateTime);
		public static final URI hasBeginning = _uri(Time.hasBeginning);
		public static final URI hasEnd = _uri(Time.hasEnd);
		public static final URI inDateTime = _uri(Time.inDateTime);
		public static final URI hasDurationDescription = _uri(Time.hasDurationDescription);

		private static URI _uri(String s) {
			return f.createURI(s);
		}

	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
