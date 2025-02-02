import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

public class JSON_Decode 
{
	public static void main(String[] args)
	{
		JSONParser parser = new JSONParser();
		String str = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
		
	      try
	      {
	          Object obj = parser.parse(str);
	          JSONArray array = (JSONArray)obj;
	 			
	          System.out.println("The 2nd element of array");
	          System.out.println(array.get(1));
	          System.out.println();

	          JSONObject obj2 = (JSONObject)array.get(1);
	          System.out.println("Field \"1\"");
	          System.out.println(obj2.get("1"));    

	          str = "{}";
	          obj = parser.parse(str);
	          System.out.println(obj);

	          str = "[5,]";
	          obj = parser.parse(str);
	          System.out.println(obj);

	          str = "[5,,2]";
	          obj = parser.parse(str);
	          System.out.println(obj);
	       }catch(ParseException pe) 
	      {
	 		
	          System.out.println("position: " + pe.getPosition());
	          System.out.println(pe);
	       }
	}
}
