package uk.ac.york.eclipse.epsilon.emu.examples.atl.launcher.files;

import java.util.HashMap;
import java.util.Map;

/**
 * Configuration of the 'Book2Publication' transformation module.
 */
public class Book2Publication {

	static private Map<String, String> properties;

	public static Map<String, String> properties() {
		properties = new HashMap<String, String>();
		String module_name = "Book2Publication";
		String path = "/Users/AFADF_F/Git/Fhma/runtime-EclipseApplication/uk.ac.york.eclipse.epsilon.emu.examples.atl/transformations/";
		path += module_name + "/";
		
		properties.put("TRANSFORMATION_DIR", path);
		properties.put("IN_METAMODEL", path + "Book.ecore");
		properties.put("IN_METAMODEL_NAME", "Book");
		properties.put("OUT_METAMODEL", path + "Publication.ecore");
		properties.put("OUT_METAMODEL_NAME", "Publication");
		properties.put("TRANSFORMATION_MODULE", module_name);
		return properties;
	}

	private Book2Publication() {
	}
}