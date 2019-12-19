package com.practice;

public class Single {

	int id;
	
	private Single(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o==null) {
			return false;
		}
		if(getClass()== o.getClass()) {
			return true;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Single s = new Single(1);
		Single s2 = new Single(2);
		System.out.println(s.hashCode()+" "+s2.hashCode());
	}

	
}
