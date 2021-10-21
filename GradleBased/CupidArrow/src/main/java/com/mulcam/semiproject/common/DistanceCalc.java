package com.mulcam.semiproject.common;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class DistanceCalc {

	class Point {
		double x;
		double y;
		
		Point(double x, double y){
			this.x = x;
			this.y = y;
		}
	}
	
	public double calcDistance(String addr1, String addr2) {

        Point pos1 = addrToPositon(addr1);
        Point pos2 = addrToPositon(addr2);
        System.out.println(pos1.y +"           " +pos1.x);
        System.out.println(pos2.y + "           " + pos2.x);

        return distance(pos1.y, pos1.x, pos2.y, pos2.x, "kilo");
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

/**
     * 두 지점간의 거리 계산
     *
     * @param lat1 지점 1 위도
     * @param lon1 지점 1 경도
     * @param lat2 지점 2 위도
     * @param lon2 지점 2 경도
     * @param unit 거리 표출단위
     * @return
     */
    private static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
          
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
          
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
          
        if (unit == "kilo") {
            dist = dist * 1.609344;
        } else if(unit == "meter"){
            dist = dist * 1609.344;
        } 
        return (dist);
    }
      
  
    // This function converts decimal degrees to radians
    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }
      
    // This function converts radians to decimal degrees
    private static double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }
	
	

}
