package com.test3;

public class PolaroidCamera implements Camera{
	int pendingPhotoClicks;
	public PolaroidCamera() {
		this.pendingPhotoClicks=10;
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
