package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import com.sun.tools.javac.parser.ReferenceParser.ParseException;

public class JSONReader {
	
	
	public JSONArray jsonReaderData(String filePath) throws FileNotFoundException
	{
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(filePath);
		//Read Json File
		
		Object obj = null;
		try {
			obj = jsonParser.parse(reader);
		} catch (IOException e)  {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONArray List = (JSONArray) obj;
		return List;
	}

}
