package object.json.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class CreateJSON {
	
	public static void main(String[] args) throws JsonProcessingException{
		
		ObjectMapper mapper = new ObjectMapper();
		ArrayNode arrayNode = mapper.createArrayNode();
		
		ObjectNode objectNode1 = mapper.createObjectNode();
		objectNode1.put("bookname", "Java");
		objectNode1.put("price", "100");
		
		ObjectNode objectNode2 = mapper.createObjectNode();
		objectNode2.put("bookname", "OOPS");
		objectNode2.put("price", "150");
		
		ObjectNode objectNode3= mapper.createObjectNode();
		objectNode3.put("bookname", "Data Structures");
		objectNode3.put("price", "200");
		
		ArrayNode authorsArray = mapper.createArrayNode();
		ObjectNode author1 = mapper.createObjectNode();
		author1.put("firstname", "Jane");
		author1.put("middlename", "");
		author1.put("lastname", "Doe");
		
		ObjectNode author2 = mapper.createObjectNode();
		author2.put("firstname", "John");
		author2.put("middlename", "");
		author2.put("lastname", "Dum");
		
		authorsArray.add(author1);
		authorsArray.add(author2);
		
		ObjectNode objectNode4 = mapper.createObjectNode();
		objectNode4.putPOJO("authors", authorsArray);
		
		arrayNode.add(objectNode1);
		arrayNode.add(objectNode2);
		arrayNode.add(objectNode3);
		arrayNode.add(objectNode4);

		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNode));
		
	}

}
