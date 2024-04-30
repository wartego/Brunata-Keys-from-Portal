package pl.brunata.csv;

import com.opencsv.CSVWriter;
import com.opencsv.ICSVWriter;
import pl.brunata.xmlDAOmapper.MainDevice;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CsvFileWriter {



    public void csvWriterToFile(List<MainDevice> mainDevices) throws IOException {
     String dateString = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));

        CSVWriter writer = new CSVWriter(new FileWriter("src/main/resources/csv_output/keys_"+dateString+".csv"),';',ICSVWriter.NO_QUOTE_CHARACTER);



        //convert List<MainDevices> into List<String[]>
        List<String[]> list = mainDevices.stream()
                //.filter(Objects::nonNull)
                .map(m -> new String[]{
                        m.getZennerShortDescription().replaceAll(",",""),
                        m.getZennerMaterialNo(),
                        m.getWaterMeterLength(),
                        m.getTempRange(),
                        m.getSubDeviceNr(),
                        m.getSerialNoFull(),
                        m.getScenario(),
                        m.getRollerDigits(),
                        m.getRadioTelegramType(),
                        m.getRadioTechnology(),
                        m.getRadioProtocolMode(),
                        m.getPulseValue(),
                        m.getPrintedSerialNo(),
                        m.getPermanentFlow(),
                        m.getPacketType(),
                        m.getNwkSKey(),
                        m.getNetworkKey(),
                        m.getManufacturer(),
                        m.getMAC_Address(),
                        m.getLoRaWAN_Version(),
                        m.getLoRaDeviceClass(),
                        m.getJoinEUI(),
                        m.getItem(),
                        m.getFrequency(),
                        m.getDeviceAddr(),
                        m.getDeviceActivationMode(),
                        m.getDevEUI(),
                        m.getCycle(),
                        m.getCustomerMaterialNo(),
                        m.getConnection(),
                        m.getCommandVersion(),
                        m.getAppSKey(),
                        m.getAppKey(),
                        m.getAES_Key()
                })
                .toList();
        //
        String[] header =  {
        "zennerShortDescription",
        "zennerMaterialNo",
        "waterMeterLength",
        "tempRange",
        "subDeviceNr",
        "serialNoFull",
        "scenario",
        "rollerDigits",
        "radioTelegramType",
        "radioTechnology",
        "radioProtocolMode",
        "pulseValue",
        "printedSerialNo",
        "permanentFlow",
        "packetType",
        "nwkSKey",
        "networkKey",
        "manufacturer",
        "MAC_Address",
        "loRaWAN_Version",
        "loRaDeviceClass",
        "joinEUI",
        "item",
        "frequency",
        "deviceAddr",
        "deviceActivationMode",
        "devEUI",
        "cycle",
        "customerMaterialNo",
        "connection",
        "commandVersion",
        "AppSKey",
        "AppKey",
        "AES_key",
        };
        writer.writeAll(Collections.singleton(header));
        writer.writeAll(list);
        writer.flush();
        writer.close();
    }
}
