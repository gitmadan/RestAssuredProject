package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement {
	
	public static  String jsonVariable(String Payload , String variableName , String variableValue){
		
	 Payload=Payload.replaceAll(Pattern.quote("{{" +variableName+ "}}" ), variableValue);
		return Payload;
		
		
	}

}
