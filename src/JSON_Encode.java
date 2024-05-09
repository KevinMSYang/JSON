import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

public class JSON_Encode 
{
	public static void main(String[] args)
	{
		JSONObject obj = new JSONObject();
		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));
		
		System.out.println(obj);
		
		StringWriter out =  new StringWriter();
		try 
		{
			obj.writeJSONString(out);
			
			String jsonText = out.toString();
			System.out.println(jsonText);
		} catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
