package json;

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
import java.util.List;  
import com.google.gson.Gson;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.util.ArrayList;  
import java.util.List;  

import org.json.simple.JSONValue;

import weblog.parsing.WebLogWritable;

import com.google.gson.Gson;  
  
/* 
 * @Author : Arpit Mandliya 
 */  
public class Weblogsimplejson {  
  
 public static void main(String[] args) {  
  
  WebLogWritable weblog = new WebLogWritable();
 // weblog.set("111.111.333", "Jan-31-2016", "Getf", "Post", "11", "11", "Google.com");

    
  // convert java object to JSON format,  
  // and returned as JSON formatted string  
  String json = JSONValue.toJSONString(weblog);
    
  try {  
   //write converted json data to a file named "CountryGSON.json"  
   FileWriter writer = new FileWriter("jsonoutput/weblogGSON.json");  
   writer.write(json);  
   writer.close();  
    
  } catch (IOException e) {  
   e.printStackTrace();  
  }  
  
System.out.println(weblog.toString()); 
  System.out.println(json.toString());  
    
     }  
}  

//Read more at http://www.java2blog.com/2013/11/gson-example-read-and-write-json.html#aCq40uqE860mL7tY.99
//Read more at http://www.java2blog.com/2013/11/gson-example-read-and-write-json.html#aCq40uqE860mL7tY.99