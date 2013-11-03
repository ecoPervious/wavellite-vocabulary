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
 * Title: SDMX
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Project: SDMX
 * </p>
 * <p>
 * Copyright: Copyright (C) 2013
 * </p>
 * 
 * @author Markus Stocker
 */

public class SDMX {

	private static final ValueFactory f = ValueFactoryImpl.getInstance();

	public static class Dimension {

		public static final String ns = "http://purl.org/linked-data/sdmx/2009/dimension";

		/** http://purl.org/linked-data/sdmx/2009/dimension#timePeriod */
		public static final String timePeriod = _(ns, "timePeriod");

		public static class asURI {

			public static final URI timePeriod = _uri(SDMX.Dimension.timePeriod);

		}

	}

	public static class Measure {
		public static final String ns = "http://purl.org/linked-data/sdmx/2009/measure";

		/** http://purl.org/linked-data/sdmx/2009/measure#obsValue */
		public static final String obsValue = _(ns, "obsValue");

		public static final class asURI {

			public static final URI obsValue = _uri(SDMX.Measure.obsValue);

		}
	}

	private static String _(String ns, String fragment) {
		return ns + "#" + fragment;
	}

	private static URI _uri(String s) {
		return f.createURI(s);
	}
}
