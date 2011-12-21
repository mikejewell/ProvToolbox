package org.openprovenance.prov.dot;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.openprovenance.prov.xml.ProvFactory;
import org.openprovenance.prov.xml.ProvSerialiser;
import org.openprovenance.prov.xml.Container;

import javax.xml.bind.JAXBException;
import java.io.File;

import org.antlr.runtime.tree.CommonTree;
import org.openprovenance.prov.asn.Utility;

public class FileExampleTest extends TestCase {

    public void fileToDot(String asnFile, String xmlFile, String dotFile, String pdfFile)
        throws java.io.FileNotFoundException,  java.io.IOException, JAXBException, Throwable {
        Utility u=new Utility();

        CommonTree tree = u.parseASNTree(asnFile);

        Container o= (Container) u.convertToJavaBean(tree);

        ProvSerialiser serial=ProvSerialiser.getThreadProvSerialiser();
        
        serial.serialiseContainer(new File(xmlFile),o,true);

        ProvToDot toDot=new ProvToDot("src/main/resources/defaultConfigWithRoleNoLabel.xml"); 
        
        toDot.convert(o,dotFile,pdfFile);
    }

    public void testFileExampleToDot1() throws java.io.FileNotFoundException,  java.io.IOException, JAXBException, Throwable {
        fileToDot("../asn/src/test/resources/prov/prov-dm-example1.prov-asn",
                  "target/file.prov-xml",
                  "target/file.dot",
                  "target/file.pdf");
    }
}