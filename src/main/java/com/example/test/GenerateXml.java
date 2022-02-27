package com.example.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;

public class GenerateXml {

    public static void main(String[] args) throws Exception {
        ObjectFactory factory = new ObjectFactory();
        Gems gems = new Gems();

//        можете значения в сеттерах менять на рандом значения, чтобы посмотреть как их будет обрабатывать ХСД схема

        VisualParameters visualParameters = new VisualParameters();
        visualParameters.setColor("blue");
        visualParameters.setCutting("2");
        visualParameters.setTransparency(3);

        Precious precious = new Precious();
        precious.setVisualParameters(visualParameters);
        precious.setName("emerald");
        precious.setValue("000");

        LocalDate date = LocalDate.of(2022, 01, 01);
        GregorianCalendar gregorianCalendar = GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));
        XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);

        precious.setDateOfProcessing(xmlGregorianCalendar);

        precious.setOrigin("SSS");
        precious.setId("gem-1");

        //уберите комментарий, чтобы в список Гемс добавился абстрактный GemType - увидите ошибку при проверке на ХСД

        /*
        GemType gem = new GemType();
        gem.setVisualParameters(visualParameters);
        gem.setValue("some value");
        gem.setDateOfProcessing(xmlGregorianCalendar);
        gem.setOrigin("some origin");
        gem.setId("111-qqq");
        gems.getGem().add(factory.createGem(gem));
        gems.getGem().add(factory.createGem(gem));

         */

        gems.getGem().add(factory.createPrecious(precious));

        String gemsXml = toXmlString(factory.createGems(gems));
        System.out.println(gemsXml);

        new ValidateXml().isValidOnScheme(gems, gemsXml.getBytes());
    }

    public static String toXmlString(JAXBElement message) throws JAXBException, UnsupportedEncodingException {
        final JAXBContext jaxbContext = JAXBContext.newInstance(message.getDeclaredType());
        final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.FALSE);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final StreamResult res = new StreamResult(byteArrayOutputStream);
        jaxbMarshaller.marshal(message, res);
        return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
    }

}
