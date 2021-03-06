package org.openprovenance.prov.dot;
import junit.framework.TestCase;
import org.openprovenance.prov.xml.Document;
import org.openprovenance.prov.xml.ProvSerialiser;
import javax.xml.bind.JAXBException;
import java.io.File;

import org.openprovenance.prov.notation.Utility;

public class SculptureTest extends TestCase {

    public void sculptureToDot(String asnFile, String xmlFile, String dotFile, String pdfFile)
        throws java.io.FileNotFoundException,  java.io.IOException, JAXBException, Throwable {
        Utility u=new Utility();


        Document o= (Document) u.convertASNToJavaBean(asnFile);

        ProvSerialiser serial=ProvSerialiser.getThreadProvSerialiser();
        
        serial.serialiseDocument(new File(xmlFile),o,true);

        ProvToDot toDot=new ProvToDot("src/main/resources/defaultConfigWithRoleNoLabel.xml"); 
        
        toDot.convert(o,dotFile,pdfFile);
    }

    public void testSculptureToDot1() throws java.io.FileNotFoundException,  java.io.IOException, JAXBException, Throwable {
        sculptureToDot("../prov-n/src/test/resources/prov/sculpture.prov-asn",
                       "target/sculpture.prov-xml",
                       "target/sculpture.dot",
                       "target/sculpture.pdf");
    }
}
