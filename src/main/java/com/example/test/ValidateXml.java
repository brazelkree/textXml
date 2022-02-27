package com.example.test;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.ValidationEventCollector;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.ByteArrayInputStream;
import java.io.File;

public class ValidateXml {

    private static final String SCHEMA_PATH = "D:\\projects\\testXml\\src\\main\\resources\\gems.xsd";

    @SuppressWarnings("unchecked")
    public boolean isValidOnScheme(Gems gems, byte[] xmlStringInBytes) throws Exception {
        File schema = new File(SCHEMA_PATH);
        Gems value = ((JAXBElement<Gems>) getUnmarshaller(gems.getClass().getPackage().getName(), schema)
                .unmarshal(new ByteArrayInputStream(xmlStringInBytes))).getValue();
        System.out.println(value.getGem().get(0).getValue().getOrigin());
        return true;
    }

    private static Unmarshaller getUnmarshaller(String packageName, File schema) throws Exception {
        final SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        final Unmarshaller out = getUnmarshaller(packageName);
        final Schema xsdSchema = sf.newSchema(schema);
        ValidationEventCollector vec = new ValidationEventCollector();
        out.setSchema(xsdSchema);
        out.setEventHandler(vec);
        return out;
    }

    private static Unmarshaller getUnmarshaller(String packageName) throws JAXBException {
        final JAXBContext jaxbContext = JAXBContext.newInstance(packageName);
        return jaxbContext.createUnmarshaller();
    }

}
