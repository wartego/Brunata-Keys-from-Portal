package pl.brunata.csv.mcids;

import com.opencsv.CSVWriter;
import lombok.NoArgsConstructor;
import pl.brunata.xmlDAOmapper.MainDevice;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CsvFileMCIDGenerator {

    private static String currentDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    private String pathToDirectores = "src/main/resources/csv_mcids/" + currentDate;
    private final String[] header =  {
            "SerialNo",
            "Key"
    };

    public CsvFileMCIDGenerator() {
        DirectoresController.listDirectoresUsingJavaIO(pathToDirectores);
    }

    public void csvWriterToFile(List<MainDevice> mainDevices , List<String> filterList, String MCID) throws IOException {
        String dateString = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        //convert List<MainDevices> into List<String[]>

        List<String[]> list = mainDevices.stream()
                .filter( item -> filterList.contains(item.getZennerMaterialNo()))
                .map(m -> new String[]{
                        formatPrinterSerialNo(m.getPrintedSerialNo(), MCID),
                        m.getAES_Key()
                })
                .toList();
        //


        if(!list.isEmpty()){
            if(list.size() <= 2000){
                saveRowsToFile(list,MCID,dateString,false,0);
            } else {
                createMultiplyFilesForONEMCid(list, MCID, dateString);
            }

        }

    }

    private void createMultiplyFilesForONEMCid(List<String[]> list, String MCID, String dateString) throws IOException {
                List<String[]> remainingList = new ArrayList<>(list);
                int counter = 1;
                do{
                    List<String[]> tempList = new ArrayList<>();

                        if(remainingList.size() > 2000){
                            tempList = remainingList.stream()
                                    .limit(2000)
                                    .collect(Collectors.toList());
                        } else {
                            tempList = remainingList.stream()
                                    .limit(remainingList.size())
                                    .collect(Collectors.toList());
                        }
                    saveRowsToFile(tempList,MCID,dateString,true, counter);
                    remainingList.removeAll(tempList);

                    counter++;
                } while (!remainingList.isEmpty());
    }

    private String formatPrinterSerialNo(String serial, String MCID){
        String newSerial = null;
        if(serial.trim().length() == 14){
            if(MCID.equals("821")) {
                newSerial = serial.trim().substring(8, 14);
            } else {
                newSerial = serial.trim().substring(6, 14);
            }
        }
        return newSerial;
    }

    private void saveRowsToFile(List<String[]> list, String MCID, String dateString, boolean multiplyFilesWillBe, int counter ) throws IOException {
        String path = null;

        if(!multiplyFilesWillBe){
            path = String.format("%s/%s/%s_%s.csv",pathToDirectores,MCID,dateString,MCID);
        } else {
            path = String.format("%s/%s/%s_%s_v%d.csv",pathToDirectores,MCID,dateString,MCID,counter);
        }
            CSVWriter writer = new CSVWriter(new FileWriter(path));
            writer.writeAll(Collections.singleton(header));
            writer.writeAll(list);
            writer.flush();
            writer.close();
    }
 }
