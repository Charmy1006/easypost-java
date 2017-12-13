package com.easypost.app;

import com.easypost.EasyPost;
import com.easypost.exception.EasyPostException;
import com.easypost.model.CarrierAccount;

public class CarrierAccountDetails {
	public static void main(String[] args) throws EasyPostException {
		EasyPost.apiKey = "O2nyr309RkytrTOHMDC8Jw";
		CarrierAccount caacc = CarrierAccount.retrieve("");
		System.out.println(caacc);
	}
}
