package com.easypost.app;

import java.util.HashMap;
import java.util.Map;

import com.easypost.EasyPost;
import com.easypost.model.CarrierAccount;
import com.easypost.model.CarrierDetail;
import com.easypost.model.User;

public class EasyPostUserRegister {
	
	public static void main(String[] args) throws Exception {
		
		try{
			EasyPost.apiKey = "KUkJhaAWGRZhirUIB5HHuQ";
			Map<String, Object> userMap = new HashMap();
			userMap.put("name", "Kruti Rawal");
			User easypostUser = User.create(userMap);
			System.out.println("User: " + easypostUser.toString());
			}catch(Exception e){
			throw e;
		}
		
	}

}
