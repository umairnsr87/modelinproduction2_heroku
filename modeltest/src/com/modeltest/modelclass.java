package com.modeltest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.omg.CORBA.PRIVATE_MEMBER;

import com.google.gson.Gson;

//import com.ibm.json.java.JSONObject;

public class modelclass {

	public static void main(String[] args)throws JSONException, IOException {
		// TODO Auto-generated method stub
		
//			CloseableHttpClient client = HttpClientBuilder.create().build();
//			HttpPost httpPost = new HttpPost("https://ml-salary-prediction-flask.herokuapp.com/predict");


//			JSONObject jsonObject = new JSONObject();
//			Map<String, Integer> strStrMap = new HashMap<String, Integer>();
//
//			strStrMap.put("experience", 9);
//			strStrMap.put("test_score", 9);
//			strStrMap.put("interview_score", 9);
//
//			jsonObject.put("json", strStrMap);
//
//			HttpPost post = new HttpPost("https://ml-salary-prediction-flask.herokuapp.com/predict");
//			JSONObject payload = new JSONObject();
//			payload.put("experience", 9);
//			payload.put("test_score", 9);
//			payload.put("interview_score", 9);
//			post.setEntity(new StringEntity(payload.toString(), ContentType.APPLICATION_JSON));
//
//
//			HttpResponse response = HttpClient.execute(post);

		
//		
//
		
		
		
		HttpClient httpClient = new DefaultHttpClient();
//
//		try {
//		    HttpPost request = new HttpPost("https://ml-salary-prediction-flask.herokuapp.com/predict_api");
//		    StringEntity params =new StringEntity("details={"+"'"+"experience"+"'"+":9"+","+"'"+"test_score"+"'"+":9"+","+"'"+"interview_score"+"'"+":9"+"} ");
//		    request.addHeader("content-type", "application/json");
//		    request.addHeader("Accept","application/json");
//		    request.setEntity(params);
//		    HttpResponse response = httpClient.execute(request);
//
//			//verify the valid error code first
//	        int statusCode = response.getStatusLine().getStatusCode();
//	        if (statusCode != 200) 
//	        {
//	            throw new RuntimeException("Failed with HTTP error code : " + statusCode);
//	        }
//	         
//	        //Now pull back the response object
//	        HttpEntity httpEntity = response.getEntity();
//	        String apiOutput = EntityUtils.toString(httpEntity);
//// handle response here...
//		}catch (Exception ex) {
//
//			System.out.println(ex.getMessage());
//		} finally {
//		    httpClient.getConnectionManager().shutdown();
//		}
		
		
//			System.out.println("This is the json object"+jsonObject.toString(2));
//		CloseableHttpClient client = HttpClientBuilder.create().build();
//		HttpPost httpPost = new HttpPost("https://ml-salary-prediction-flask.herokuapp.com/predict_api");
//
//		String json = "{"+"'"+"experience"+"'"+":9"+","+"'"+"test_score"+"'"+":9"+","+"'"+"interview_score"+"'"+":9"+"}";
//
//			System.out.println("This is the json object"+json);
//			
//			        try {
//			            StringEntity entity = new StringEntity(json);
//			           // System.out.println("the string entity after is "+entity);
//			            httpPost.setEntity(entity);
//
//			            // set your POST request headers to accept json contents
//			            httpPost.setHeader("Accept", "application/json");
//			            httpPost.setHeader("Content-type", "application/json");
//
//			            try {
//			                // your closeablehttp response
//			                CloseableHttpResponse response = client.execute(httpPost);
//
//			                // print your status code from the response
//			                System.out.println(response.getStatusLine().getStatusCode());
//
//			                // take the response body as a json formatted string 
//			                String responseJSON = EntityUtils.toString(response.getEntity());
//
//			                System.out.println(responseJSON);
//			                // convert/parse the json formatted string to a json object
//			                JSONObject jobj = new JSONObject(responseJSON);
//			                //responseJSON.
//			                //print your response body that formatted into json
//			                System.out.println(jobj);
//
//			            } catch (IOException e) {
//			                e.printStackTrace();
//			            }
//
//			        } catch (UnsupportedEncodingException e) {
//			            e.printStackTrace();
//			        } 

//step4
//		
//		HttpsURLConnection connection;
//		
//		try {
//			URL url=new URL("https://ml-salary-prediction-flask.herokuapp.com/predict");
//			connection=(HttpsURLConnection) url.openConnection();
//			connection.setRequestMethod("POST");
//			connection.setReadTimeout(5000);
//			connection.setReadTimeout(5000);
//			
//			int status=connection.getResponseCode();
//			System.out.println(status);
//			
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//			// TODO: handle exception
//		}

		
		//step5:
		JSONObject obj=new JSONObject();
		  obj.put("Pclass",new Integer(3));
		  obj.put("Age",new Integer(2));
		  obj.put("SibSp",new Integer(1));
		  obj.put("Fare",new Integer(50));
		  //obj.put("nickname",null);
		  System.out.print(obj);
		  String json = new flexjson.JSONSerializer().serialize(obj);
		  HttpPost request = new HttpPost("https://titanic-app-predictions.herokuapp.com/");

		  StringEntity params =new StringEntity(obj.toString());
//		  request.addHeader("content-type", "application/json");
//		  request.addHeader("Accept","application/json");
		  request.setEntity(params);
		  //request.set
		  HttpResponse response = httpClient.execute(request);

		    //System.out.println("this is the code"+response.getStatusLine().getStatusCode());
		  //using flex
		  
		  //Now pull back the response object
	        HttpEntity httpEntity = response.getEntity();
	        String apiOutput = EntityUtils.toString(httpEntity);

	        
	        System.out.println(apiOutput);
//	        JSONParser parser = new JSONParser();
	        String json1=null;
//	        try {
//				 json1= (JSONObject) parser.parse(apiOutput);
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	        
//	        Gson g = new Gson();
//	        json1=g.toJson(apiOutput);
//	        //Player p = g.fromJson(jsonString, Player.class)
	        //JSONObject jjJsonObject=new JSONObject();
	        //jjJsonObject=apiOutput.toJson();
	       
	        System.out.print(apiOutput.length());
	        System.out.println('\n');
	        System.out.println(apiOutput.substring(12,23));
//	        String resultString=apiOutput.substring(21,33);
//	        String resultString1[]=resultString.split(":");
//	        System.out.println("The result is "+resultString1[1]);
//	        

		  
		//Result: {"balance":1000.21,"num":100,"nickname":null,"is_vip":true,"name":"foo"}
		
		
	}

}
