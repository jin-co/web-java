package com.mulcam.project;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class AddrToPositon {

	public class Point {
		public double x;
		public double y;
		
		Point(double x, double y){
			this.x = x;
			this.y = y;
		}
	}

	
	public Point addrToPositon( String keyword) {
		
		String apiURL = "http://api.vworld.kr/req/address";
        double posX = 0;
        double posY = 0;
        try{
              int responseCode = 0;
              URL url = new URL(apiURL);
              HttpURLConnection con = (HttpURLConnection)url.openConnection();
              con.setRequestMethod("POST");
 
              String text_content =  URLEncoder.encode(keyword.toString(), "utf-8");
              //String text_content =  URLEncoder.encode(keyword.toString());
               
              // post request
              String postParams = "service=address";
                     postParams += "&request=getcoord";                     
                     postParams += "&version=2.0";
                     postParams += "&crs=EPSG:4326";
                     postParams += "&address="+text_content;                                    
                     postParams += "&arefine=true";
                     postParams += "&simple=false";                  
                     postParams += "&format=json";
                     postParams += "&type=road";    
                     postParams += "&errorFormat=json";
                     postParams += "&key=76FC005B-66EE-3C38-A2DE-5DDEB906BD8E";                 
 
              con.setDoOutput(true);
              DataOutputStream wr = new DataOutputStream(con.getOutputStream());
              wr.writeBytes(postParams);
              wr.flush();
              wr.close();
              responseCode = con.getResponseCode();
              BufferedReader br;
               
              if(responseCode==200) { // 정상 호출
                  br = new BufferedReader(new InputStreamReader(con.getInputStream()));
              }else{  // 에러 발생
                  br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
              }
 
              String inputLine;
              StringBuffer response = new StringBuffer();
 
              while ((inputLine = br.readLine()) != null) {
                  response.append(inputLine);
              }
              
              
              System.out.println("response : " + response);
              
              
              br.close();
              con.disconnect();

              try {
      			JSONParser parser = new JSONParser();
      			JSONObject object = (JSONObject)parser.parse(response.toString());
      			
      			JSONObject resObj = (JSONObject)object.get("response");
      			
      			JSONObject rstObj = (JSONObject)resObj.get("result");
      			
      			JSONObject pntObj = (JSONObject)rstObj.get("point");
      			
      			 posX = Double.parseDouble( (String)pntObj.get("x"))   ;   
      			 posY = Double.parseDouble((String)pntObj.get("y"))   ;
      			
      			
      			
      			
      			System.out.println(posX);
      			System.out.println(posY);

      		} catch(Exception e) {
      			e.printStackTrace();
      		}
              
              
          }catch(Exception e){          
              e.printStackTrace();
          }
		
		
		return new Point(posX ,posY);
	}


}
