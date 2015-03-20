package org.cvrgrid.hl7aecg;
/*
Copyright 2015 Johns Hopkins University Institute for Computational Medicine

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
/**
* @author Andre Vilardo
* 
*/
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
