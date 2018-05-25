package com.ju.japro.structalg.ten.test;

public class Parcal6 {
	public Parcal5 getParcal5() {
		class Parcal5Impl implements Parcal5 {
			private String label;
			public String getLabel() {
				return label;
			}
			public Parcal5Impl(String label){
				this.label = label;
			}
		}
		return new Parcal5Impl("123456");
	}
}