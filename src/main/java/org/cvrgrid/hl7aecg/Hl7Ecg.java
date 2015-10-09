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
* @author Andre Vilardo, Chris Jurado
*/
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.cvrgrid.hl7aecg.jaxb.beans.PORTMT020001AnnotatedECG;
import org.cvrgrid.hl7aecg.jaxb.beans.PORTMT020001Component9;

public class Hl7Ecg {

	private static HL7PreprocessReturn preprocess(JAXBContext context, File input) throws JAXBException, IOException {
		Unmarshaller reader = context.createUnmarshaller();
		@SuppressWarnings("unchecked")
		PORTMT020001AnnotatedECG ecg = ((JAXBElement<PORTMT020001AnnotatedECG>)reader.unmarshal(input)).getValue();
		List<PORTMT020001Component9> components = ecg.getComponent().get(0).getSeries().getComponent().get(0).getSequenceSet().getComponent();
		HL7PreprocessReturn temp = new HL7PreprocessReturn(components);
		return temp;
	}
	
	public static HL7PreprocessReturn preprocess(File input) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance(PORTMT020001AnnotatedECG.class.getPackage().getName());
		return preprocess(context, input);
	}
	
	private static HL7PreprocessReturn preprocess(JAXBContext context, InputStream inputStream) throws JAXBException, IOException {
		Unmarshaller reader = context.createUnmarshaller();
		@SuppressWarnings("unchecked")
		PORTMT020001AnnotatedECG ecg = ((JAXBElement<PORTMT020001AnnotatedECG>)reader.unmarshal(inputStream)).getValue();
		List<PORTMT020001Component9> components = ecg.getComponent().get(0).getSeries().getComponent().get(0).getSequenceSet().getComponent();
		HL7PreprocessReturn temp = new HL7PreprocessReturn(components);
		return temp;
	}
	
	public static HL7PreprocessReturn preprocess(InputStream inputStream) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance(PORTMT020001AnnotatedECG.class.getPackage().getName());
		return preprocess(context, inputStream);
	}	
}