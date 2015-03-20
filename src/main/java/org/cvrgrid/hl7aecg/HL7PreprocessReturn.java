package org.cvrgrid.hl7aecg;

import java.util.List;

import org.cvrgrid.hl7aecg.jaxb.beans.PORTMT020001Component9;

public class HL7PreprocessReturn {

	private List<PORTMT020001Component9> components;
	
	public HL7PreprocessReturn(List<PORTMT020001Component9> c9s) {
		components = c9s;
	}

	public List<PORTMT020001Component9> getComponents() {
		return components;
	}
	
	
}
