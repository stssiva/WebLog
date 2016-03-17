package weblog.parsing;

import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class WebLogMapper extends Mapper<Text, WebLogWritable, NullWritable, Text> {


	protected void map(Text key, WebLogWritable value, Context context) throws IOException, InterruptedException {
//		String[] tokens = value.toString().split(",");
		  Gson gson = new GsonBuilder().disableHtmlEscaping().create();  
		    // convert java object to JSON format,  
		  // and returned as JSON formatted string  
		  String json = gson.toJson(value)		;
		//context.write(NullWritable.get(), new Text(json));
		context.write(NullWritable.get(), new Text(json));
			
		}
	
}
