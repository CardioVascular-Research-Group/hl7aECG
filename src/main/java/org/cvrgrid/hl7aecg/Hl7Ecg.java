package org.cvrgrid.hl7aecg;

import java.io.File;
import java.io.IOException;
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
		PORTMT020001AnnotatedECG ecg = ((JAXBElement<PORTMT020001AnnotatedECG>)reader.unmarshal(input)).getValue();
		
		List<PORTMT020001Component9> components = ecg.getComponent().get(0).getSeries().getComponent().get(0).getSequenceSet().getComponent();
		
		HL7PreprocessReturn temp = new HL7PreprocessReturn(components);
		
		return temp;
	}
	
	public static HL7PreprocessReturn preprocess(File input) throws IOException, JAXBException {
		JAXBContext context = JAXBContext.newInstance(PORTMT020001AnnotatedECG.class.getPackage().getName());
		
		return preprocess(context, input);
	}
}
