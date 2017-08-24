package uk.ac.york.eclipse.epsilon.emu.examples.atl.launcher.files;

import java.util.HashMap;
import java.util.Map;

public class SimpleClass2SimpleRDBMS {
	static private Map<String, String> properties;

	public static Map<String, String> properties() {
		properties = new HashMap<String, String>();
		String module_name = "SimpleClass2SimpleRDBMS";
		String path = "/Users/AFADF_F/Git/Fhma/runtime-EclipseApplication/uk.ac.york.eclipse.epsilon.emu.examples.atl/transformations/";
		path += module_name + "/";

		properties.put("TRANSFORMATION_DIR", path);
		properties.put("IN_METAMODEL", path + "SimpleClass.ecore");
		properties.put("IN_METAMODEL_NAME", "SimpleClass");
		properties.put("OUT_METAMODEL", path + "SimpleRDBMS.ecore");
		properties.put("OUT_METAMODEL_NAME", "SimpleRDBMS");
		properties.put("TRANSFORMATION_MODULE", module_name);
		return properties;
	}

	private SimpleClass2SimpleRDBMS() {
	}
}
