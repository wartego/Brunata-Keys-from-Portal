package pl.brunata;


import pl.brunata.controller.DevicesKeysController;
import pl.brunata.csv.CsvFileWriter;
import pl.brunata.csv.mcids.CsvFileMCIDGenerator;
import pl.brunata.dao.DeviceKeysDAO;
import pl.brunata.db.HibernateUtils;
import pl.brunata.entity.DevicesKey;
import pl.brunata.mapper.DeviceMapper;
import pl.brunata.mapper.MCIDNumberEnum;
import pl.brunata.service.DevicesKeysService;
import pl.brunata.xmlservice.CollectAllKeys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public final static DeviceKeysDAO deviceKeysDAO = new DeviceKeysDAO();
    public final static DeviceMapper deviceMapper = new DeviceMapper();
    public final static DevicesKeysService devicesKeysService = new DevicesKeysService();
    public final static DevicesKeysController devicesKeysController = new DevicesKeysController();




    public static void main(String[] args) throws IOException {

        HibernateUtils.getSessionFactory();

        CollectAllKeys.getAllFilesFromPath();
        CollectAllKeys.printCountAllRows();
        createCSVFile();
        createCSVFileForAllMCIDS();
        createKeys();



    }

    private static void createKeys(){

        getListWithoutRowsInDatabase();

        CollectAllKeys.allMainDevices.forEach( s -> {
            boolean exist = false;
            boolean existDevEUI = s.getDevEUI() == null || !s.getDevEUI().equals("") || !s.getDevEUI().isEmpty();
            boolean existPrintedSerialNo = s.getPrintedSerialNo() == null || !s.getPrintedSerialNo().equals("") || !s.getPrintedSerialNo().isEmpty();
            if (existDevEUI){
                exist = devicesKeysController.existByDevEUI(s);
            } else if (existPrintedSerialNo){
                exist = devicesKeysController.existByPrintedSerialNo(s);
            }
            if (!exist){
                devicesKeysController.create(s);
            }
        });
    }
    private static void createCSVFile() throws IOException {
        CsvFileWriter csvFileWriter = new CsvFileWriter();
        csvFileWriter.csvWriterToFile(CollectAllKeys.allMainDevices);
    }

    private static void createCSVFileForAllMCIDS() throws IOException {

        CsvFileMCIDGenerator csvFileMCIDGenerator = new CsvFileMCIDGenerator();

        List<MCIDNumberEnum> allMCIDS = List.of(MCIDNumberEnum.values());
        allMCIDS.forEach( s -> {
            try {
                csvFileMCIDGenerator.csvWriterToFile(CollectAllKeys.allMainDevices,s.getMcids(), s.getMcidNumber());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }


    private static List<DevicesKey> getListWithoutRowsInDatabase(){


        List<DevicesKey> listKeysFromFiles = new ArrayList<>(CollectAllKeys.allMainDevices.stream().map(i -> new DeviceMapper().map(i)).toList());
        List<DevicesKey> listFromDatabase = devicesKeysController.getAllRows();

         listFromDatabase.forEach(i-> i.setId(0));
         listKeysFromFiles.removeAll(listFromDatabase);


        return  listKeysFromFiles;


    }


}