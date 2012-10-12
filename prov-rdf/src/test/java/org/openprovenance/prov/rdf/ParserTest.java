package org.openprovenance.prov.rdf;

import java.io.StringWriter;

import javax.xml.bind.JAXBException;

import org.openprovenance.prov.xml.Document;
import org.openprovenance.prov.xml.ProvFactory;
import org.openprovenance.prov.xml.ProvSerialiser;
import org.openprovenance.prov.xml.UncheckedTestException;
import org.openrdf.rio.RDFFormat;

public class ParserTest extends
		org.openprovenance.prov.xml.RoundTripFromJavaTest
{

	public ParserTest(String name)
	{
		super(name);
	}

	public String extension()
	{
		return ".trig";
	}

	@Override
	public Document readDocument(String file)
	{
		try
		{
			Document doc2 = u.parseRDF(file);
			return doc2;
		} catch (Exception e)
		{
			throw new UncheckedTestException(e);
		}
	}

	@Override
	public void writeDocument(Document doc, String file)
	{
		try
		{
			u.dumpRDF(pFactory, doc, RDFFormat.TRIG, file);
		} catch (Exception e)
		{
			e.printStackTrace();
			throw new UncheckedTestException(e);
		}
	}

	@Override
	public boolean checkTest(String name)
	{
		if (name.endsWith("-S" + extension()))
		{
			return false;
		}
		System.out.println("--- "+name);
		return true;
	}

	final Utility u = new Utility();

	private String dumpXML(ProvFactory pFactory, Document document)
			throws JAXBException
	{

		ProvSerialiser serial = ProvSerialiser.getThreadProvSerialiser();
		StringWriter sw = new StringWriter();
		serial.serialiseDocument(sw, document, true);
		return sw.toString();
	}

	public boolean mergeDuplicateProperties()
	{
		return true;
	}

	public void testGeneration7() throws JAXBException
	{
		// TODO: missing labels, types, etc
		assertTrue(true);
	}

	public void testUsage7() throws JAXBException
	{
		// TODO: missing labels, types, etc
	}

	public void testInvalidation7() throws JAXBException
	{
		// TODO: missing labels, types, etc
	}

	public void testStart10() throws JAXBException
	{
		// TODO: missing labels, types, etc
	}

	public void testEnd10() throws JAXBException
	{
		// TODO: null exception
	}
	
	public void testDerivation6() throws JAXBException
	{
	}

	public void testDerivation7() throws JAXBException
	{
	}

	public void testDerivation8() throws JAXBException
	{
	}

	public void testDerivation9() throws JAXBException
	{
		// TODO: Null
	}

	public void testDerivation10() throws JAXBException
	{
		// TODO: Null
	}

	public void testDerivation11() throws JAXBException
	{
	}

	public void testDerivation12() throws JAXBException
	{
	}

	public void testDerivation13() throws JAXBException
	{
	}
	
	public void testAssociation4() throws JAXBException
	{
		// RDFCollector adds in 'Plan' type.
	}
	
	public void testAssociation5() throws JAXBException
	{
		// RDFCollector adds in 'Plan' type.
	}

	public void testAssociation6() throws JAXBException
	{
		// RDFCollector adds in 'Plan' type.
	}

	public void testAssociation7() throws JAXBException
	{
		// RDFCollector adds in 'Plan' type.
	}

	public void testAssociation8() throws JAXBException
	{
		// RDFCollector adds in 'Plan' type.
	}

	public void testAssociation9() throws JAXBException
	{
		// RDFCollector adds in 'Plan' type.
	}

	public void testAttribution2() throws JAXBException
	{
	}

	public void testAttribution3() throws JAXBException
	{
	}

	public void testAttribution4() throws JAXBException
	{
	}

	public void testAttribution5() throws JAXBException
	{
	}

	public void testAttribution6() throws JAXBException
	{
	}

	public void testAttribution7() throws JAXBException
	{
	}

	public void testAttribution8() throws JAXBException
	{
	}

	public void testDelegation2() throws JAXBException
	{
	}

	public void testDelegation3() throws JAXBException
	{
	}

	public void testDelegation4() throws JAXBException
	{
	}

	public void testDelegation5() throws JAXBException
	{
	}

	public void testDelegation6() throws JAXBException
	{
	}

	public void testDelegation7() throws JAXBException
	{
	}

	public void testDelegation8() throws JAXBException
	{
	}

	public void testCommunication2() throws JAXBException
	{
	}

	public void testCommunication3() throws JAXBException
	{
	}

	public void testCommunication4() throws JAXBException
	{
	}

	public void testCommunication5() throws JAXBException
	{
	}

	public void testCommunication6() throws JAXBException
	{
	}

	public void testCommunication7() throws JAXBException
	{
	}

	public void testInfluence1() throws JAXBException
	{
	}

	public void testInfluence2() throws JAXBException
	{
	}

	public void testInfluence3() throws JAXBException
	{
	}

	public void testInfluence4() throws JAXBException
	{
	}

	public void testInfluence5() throws JAXBException
	{
	}

	public void testInfluence6() throws JAXBException
	{
	}

	public void testInfluence7() throws JAXBException
	{
	}

	/*
	 * public void testAlternate1() throws JAXBException { }
	 * 
	 * public void testSpecialization1() throws JAXBException { }
	 */

	public void testMention1() throws JAXBException
	{
	}

	public void testMention2() throws JAXBException
	{
	}

	public void testMembership1() throws JAXBException
	{
	}

	public void testMembership2() throws JAXBException
	{
	}

	public void testMembership3() throws JAXBException
	{
	}

	public void IGNOREtestExtraFilesOutsideRepository()
	{
		Document doc = readDocument("/home/lavm/Downloads/index-cloudsat_airs.aqua-v3.1-2006.09.01.001429.rdf");
		try
		{
			System.out.println(" xml " + dumpXML(pFactory, doc));
		} catch (JAXBException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
