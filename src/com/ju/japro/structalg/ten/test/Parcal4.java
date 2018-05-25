package com.ju.japro.structalg.ten.test;

import com.ju.japro.common.util.Print;

public class Parcal4 {
	private void internalTracking(boolean bl) {
		if (bl) {
			class TrackingSlip {
				private String id;
				TrackingSlip(String id) {
					this.id = id;
				}
				String getSlip() {
					return id;
				}
			}
			
			TrackingSlip ts = new TrackingSlip("trackingSlip");
			String str = ts.getSlip();
			Print.print(str);
			
		}
	}
	
	
	public void track() {
		internalTracking(true);
	}
	
	
	public static void main(String[] args) {
		Parcal4 pc = new Parcal4();
		pc.track();
	}
}