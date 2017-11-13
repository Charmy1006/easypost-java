package com.easypost.app;

import java.util.HashMap;
import java.util.Map;

import com.easypost.EasyPost;
import com.easypost.model.User;

public class EasyPostUserRegister {
	
	public static void main(String[] args) throws Exception {
		
		try{
			EasyPost.apiKey = "KUkJhaAWGRZhirUIB5HHuQ";
			Map<String, Object> userMap = new HashMap();
			userMap.put("name", "Rucha Trivedi");
			User easypostUser = User.create(userMap);
			System.out.println("User: " + easypostUser.toString());
		}catch(Exception e){
			throw e;
		}
		
	}

}
