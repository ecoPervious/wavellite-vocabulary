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
 * Title: PROV
 * </p>
 * <p>
 * Description: The PROV Ontology
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

public class PROV {

	public static final String ns = "http://www.w3.org/ns/prov";

	/** http://www.w3.org/ns/prov#Entity */
	public static final String Entity = _("Entity");
	
	/** http://www.w3.org/ns/prov#Activity */
	public static final String Activity = _("Activity");
	
	/** http://www.w3.org/ns/prov#Agent */
	public static final String Agent = _("Agent");
	
	/** http://www.w3.org/ns/prov#wasDerivedFrom */
	public static final String wasDerivedFrom = _("wasDerivedFrom");
	
	/** http://www.w3.org/ns/prov#wasAttributedTo */
	public static final String wasAttributedTo = _("wasAttributedTo");
	
	/** http://www.w3.org/ns/prov#wasGeneratedBy */
	public static final String wasGeneratedBy = _("wasGeneratedBy");
	
	/** http://www.w3.org/ns/prov#used */
	public static final String used = _("used");
	
	/** http://www.w3.org/ns/prov#endedAtTime */
	public static final String endedAtTime = _("endedAtTime");
	
	/** http://www.w3.org/ns/prov#wasInformedBy */
	public static final String wasInformedBy = _("wasInformedBy");
	
	/** http://www.w3.org/ns/prov#startedAtTime */
	public static final String startedAtTime = _("startedAtTime");
	
	/** http://www.w3.org/ns/prov#wasAssociatedWith */
	public static final String wasAssociatedWith = _("wasAssociatedWith");
	
	/** http://www.w3.org/ns/prov#wasAssociateFor */
	public static final String wasAssociateFor = _("wasAssociateFor");
	
	/** http://www.w3.org/ns/prov#actedOnBehalfOf */
	public static final String actedOnBehalfOf = _("actedOnBehalfOf");
	
	public static final class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();
		
		public static final URI Entity = _uri(PROV.Entity);
		public static final URI Activity = _uri(PROV.Activity);
		public static final URI Agent = _uri(PROV.Agent);
		public static final URI wasDerivedFrom = _uri(PROV.wasDerivedFrom);
		public static final URI wasAttributedTo = _uri(PROV.wasAttributedTo);
		public static final URI wasGeneratedBy = _uri(PROV.wasGeneratedBy);
		public static final URI used = _uri(PROV.used);
		public static final URI endedAtTime = _uri(PROV.endedAtTime);
		public static final URI wasInformedBy = _uri(PROV.wasInformedBy);
		public static final URI startedAtTime = _uri(PROV.startedAtTime);
		public static final URI wasAssociatedWith = _uri(PROV.wasAssociatedWith);
		public static final URI wasAssociateFor = _uri(PROV.wasAssociateFor);
		public static final URI actedOnBehalfOf = _uri(PROV.actedOnBehalfOf);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}
	
}
