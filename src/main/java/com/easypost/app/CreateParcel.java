package com.easypost.app;

import java.util.HashMap;
import java.util.Map;

import com.easypost.EasyPost;
import com.easypost.exception.EasyPostException;
import com.easypost.model.Parcel;

public class CreateParcel {

	public static void main(String[] args) throws EasyPostException {
		EasyPost.apiKey = "ZbgdBriHYkcBkoKeiFWB2w";

		Map<String, Object> parcelMap = new HashMap<String, Object>();
		parcelMap.put("height", 10);
		parcelMap.put("width", 10);
		parcelMap.put("length", 2);
		parcelMap.put("weight", 10.2);

		Parcel parcel = Parcel.create(parcelMap);
		
		System.out.println(parcel.toString());
		
		

	}
}
