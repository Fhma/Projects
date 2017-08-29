package uk.ac.york.eclipse.epsilon.emu.examples.atl.launcher.files;

import java.util.HashMap;
import java.util.Map;

public class HTML2XML {
	static private Map<String, String> properties;

	public static Map<String, String> properties() {
		properties = new HashMap<String, String>();
		// meta-variables
		String module_name = "HTML2XML";
		String helpers_list = null;
		String inMM_name = "HTML";
		String outMM_name = "XML";
		String path = "/Users/AFADF_F/Git/Fhma/runtime-EclipseApplication/uk.ac.york.eclipse.epsilon.emu.examples.atl/transformations/";
		path += module_name + "/";

		properties.put("TRANSFORMATION_DIR", path);
		properties.put("IN_METAMODEL", path + inMM_name + ".ecore");
		properties.put("IN_METAMODEL_NAME", inMM_name);
		properties.put("OUT_METAMODEL", path + outMM_name + ".ecore");
		properties.put("OUT_METAMODEL_NAME", outMM_name);
		properties.put("TRANSFORMATION_MODULE", module_name);
		properties.put("TRANSFORMATION_HELPERS", helpers_list);
		return properties;
	}

	private HTML2XML() {
	}
}
