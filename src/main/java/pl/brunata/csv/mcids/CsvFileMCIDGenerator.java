package pl.brunata.csv.mcids;

import com.opencsv.CSVWriter;
import pl.brunata.xmlDAOmapper.MainDevice;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

public abstract class CSV_MCID_ABSTRACT {

    public void csvWriterToFile(List<MainDevice> mainDevices , List<String> filterList, String MCID) throws IOException {
        String dateString = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));

        CSVWriter writer = new CSVWriter(new FileWriter(String.format("src/main/resources/csv_mcids/%s/%s_%s.csv",MCID,dateString,MCID)));


        //convert List<MainDevices> into List<String[]>

        List<String[]> list = mainDevices.stream()
                .filter( item -> filterList.contains(item.getZennerMaterialNo()))
                .map(m -> new String[]{
                        formatPrinterSerialNo(m.getPrintedSerialNo()),
                        m.getAppKey()
                })
                .toList();


        //
        String[] header =  {
        "SerialNo",
        "Key"
        };
        writer.writeAll(Collections.singleton(header));
        writer.writeAll(list);
        writer.flush();
        writer.close();
    }

    public String formatPrinterSerialNo(String serial){
        int length;
        String newSerial = null;
        if(serial.trim().length() == 16){
                newSerial = serial.trim().substring(7,15);
        }
        return newSerial;
        }

    }
