package pl.brunata;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import pl.brunata.DAO.DeliveryNotes;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        startParser();
    }

    public static void startParser() {
        try {
            File file = new File("src/main/resources/xml/DK231120/Test.xml");
            // Create an XmlMapper
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

            // Deserialize XML from the file into a Java object
            DeliveryNotes person = xmlMapper.readValue(file, DeliveryNotes.class);

            System.out.println(person);

        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}