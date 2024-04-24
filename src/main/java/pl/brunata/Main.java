package pl.brunata;


import pl.brunata.DAO.DeliveryNotes;
import pl.brunata.DAO.Device;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        startParser();
    }

    public static void startParser() {
        try {
            File file = new File("src/main/resources/xml/DK231120/DeliveryNote_20240424_XML (44).xml");

            JAXBContext context = JAXBContext.newInstance(DeliveryNotes.class);
            Unmarshaller un = context.createUnmarshaller();
            DeliveryNotes deliveryNotes = (DeliveryNotes) un.unmarshal(file);
//
            //List<Device> deviceList = deliveryNotes.getDeliveryNote().getDevices().getDevice();
            System.out.println(deliveryNotes);
      //      deviceList.forEach(s -> System.out.println(s.getMainDevice().getSerialNoFull()));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


    }
}