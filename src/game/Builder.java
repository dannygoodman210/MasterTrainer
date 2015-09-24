package game;

import java.io.File;
import java.io.FileNotFoundException;

import org.json.simple.parser.ParseException;

public interface Builder {

	void builder(File f) throws FileNotFoundException, ParseException, ClassNotFoundException, InstantiationException, IllegalAccessException;

}
