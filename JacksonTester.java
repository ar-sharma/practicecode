package demo;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTester {
   public static void main(String args[]){
   
      ObjectMapper mapper = new ObjectMapper();
      String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
      
      
		
      try{
         Student student = mapper.readValue(jsonString, Student.class);
         
         System.out.println(student);
         
         
         jsonString = mapper.writeValueAsString(student);
         
         System.out.println(jsonString);
      }
      catch (JsonParseException e) { e.printStackTrace();}
    
      catch (IOException e) { e.printStackTrace(); }
   }
}

class Student {
   private String name;
   private int age;
	
   public Student(){}
	
   public String getName() {
      return name;
   }
	
   public void setName(String name) {
      this.name = name;
   }
	
   public int getAge() {
      return age;
   }
	
   public void setAge(int age) {
      this.age = age;
   }
   
   public String toString(){
	   return "Students [ name: "+name+", age: "+ age+ " ]";
   }
}