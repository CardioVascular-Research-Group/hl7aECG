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
* 
*/
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.bind.JAXBException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	final String HL7AECG_INPUT_FILE_PATH = "/hl7aecg-Example2.xml";
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	
    	try {

			URL resourceUrl = getClass().getResource(HL7AECG_INPUT_FILE_PATH);
			File file = new File(resourceUrl.toURI());
			Hl7Ecg.preprocess(file);
		
		} catch (URISyntaxException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (JAXBException e) {

			e.printStackTrace();
		}
    	
        assertTrue( true );
    }
    
    //CRJ Test InputStream processing
    public void testInputStream()
    {
    	boolean result = false;
    	
    	try {
			InputStream inputStream = getClass().getResourceAsStream(HL7AECG_INPUT_FILE_PATH);
			Hl7Ecg.preprocess(inputStream);
			result = true;
			
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
        assertTrue(result);
    }
}
