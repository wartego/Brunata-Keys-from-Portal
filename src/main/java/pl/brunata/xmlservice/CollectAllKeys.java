package pl.brunata.xmlservice;

import pl.brunata.xmlDAOmapper.DeliveryNotes;
import pl.brunata.xmlDAOmapper.Device;
import pl.brunata.xmlDAOmapper.MainDevice;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectAllKeys {

    public static List<MainDevice> allMainDevices = new ArrayList<>();
    public static Integer countAllRows = 0;


    public static void printCountAllRows(){
        System.out.println(countAllRows);
    }


    public static void getAllFilesFromPath(){
        List<File> filesFromDirectorys = FilesPathRetriver.getAllFilesFromDirectorys();
        filesFromDirectorys.forEach(s -> {
            System.out.println("Current file path is: " + s);
            getAllRowsFromAllFiles(s.getPath());
        });
    }

    public static void getAllRowsFromAllFiles(String path) {
        try {
            File file = new File(path);

            JAXBContext context = JAXBContext.newInstance(DeliveryNotes.class);
            Unmarshaller un = context.createUnmarshaller();
            DeliveryNotes deliveryNotes = (DeliveryNotes) un.unmarshal(file);

            countAllRows += Math.toIntExact(deliveryNotes.getDeliveryNote()
                    .getDevices()
                    .stream()
                    .map(i -> i.getMainDevice().getDevEUI())
                    .distinct()
                    .count());
//
            List<Device> deviceList = deliveryNotes.getDeliveryNote().getDevices();

            deviceList.stream()
                    .map(Device::getMainDevice)
                    .collect(Collectors.toCollection(() -> allMainDevices));

            System.out.println(allMainDevices.size());


            // System.out.println(deliveryNotes);
            //      deviceList.forEach(s -> System.out.println(s.getMainDevice().getSerialNoFull()));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

    }

}
