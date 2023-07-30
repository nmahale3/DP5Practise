package com.test3;

public class PhoneCamera implements Camera{
	int pendingPhotoClicks;
	public PhoneCamera() {
		this.pendingPhotoClicks=12600;
	}


	@Override
	public String takePhoto() {
		if(pendingPhotoClicks>0)
		{
			pendingPhotoClicks--;
			return "Taking a picture on my Polaroid Camera!";
		}
		else
		{
			return "You have Exhausted your clicks";

		}
	}
}
