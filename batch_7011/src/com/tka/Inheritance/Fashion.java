package com.tka.Inheritance;

public class Fashion extends Amazon {
	
	protected String section;
	
	public Fashion(){
		super("ram");
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	


}
