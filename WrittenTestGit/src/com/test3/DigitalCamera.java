package com.test3;

public class DigitalCamera implements Camera {
	int pendingPhotoClicks;
	public DigitalCamera() {
		 this.pendingPhotoClicks=2000;
	}
 

	@Override
	public String takePhoto() {
		if(pendingPhotoClicks>0)
		{
			pendingPhotoClicks--;
			return "Taking a picture on my digital camera!";
		}
		else
		{
			return "You have Exhausted your clicks";
			
		}
		}

}
