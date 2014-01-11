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

	public static class asURI {

		private static final ValueFactory f = ValueFactoryImpl.getInstance();

		public static final URI Module = _uri(WOM.Module);

		private static URI _uri(String s) {
			return f.createURI(s);
		}
	}

	private static String _(String fragment) {
		return ns + "#" + fragment;
	}

}
