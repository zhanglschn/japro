package com.ju.japro.structalg.ten;

import com.ju.japro.common.util.Print;

public class Parcel7 {
	private void internalTracking(boolean b) {
		if (b) {
			class TrackingSlip {
				private String id;
				TrackingSlip(String s) {
					id = s;
				}
				String getSlip() {
					return id;
				}
			}
			
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			Print.print(s);
		}
	}
	
	public void track() {
		internalTracking(false);
	}
	
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		p.track();
	}
	
}
