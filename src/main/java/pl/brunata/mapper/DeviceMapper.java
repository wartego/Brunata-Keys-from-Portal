package pl.brunata.mapper;

import pl.brunata.entity.DevicesKey;
import pl.brunata.xmlDAOmapper.MainDevice;

public class DeviceMapper {


    public DevicesKey map(MainDevice m){

        return DevicesKey.builder()
                .AES_key(m.getAES_Key())
                .AppKey(m.getAppKey())
                .commandVersion(m.getCommandVersion())
                .cycle(m.getCycle())
                .deviceActivationMode(m.getDeviceActivationMode())
                .AppSKey(m.getAppSKey())
                .deviceAddr(m.getDeviceAddr())
                .item(m.getItem())
                .customerMaterialNo(m.getCustomerMaterialNo())
                .loRaDeviceClass(m.getLoRaDeviceClass())
                .devEUI(m.getDevEUI())
                .frequency(m.getFrequency())
                .manufacturer(m.getManufacturer())
                .networkKey(m.getNetworkKey())
                .connection(m.getConnection())
                .loRaWAN_Version(m.getLoRaWAN_Version())
                .MAC_Address(m.getMAC_Address())
                .printedSerialNo(m.getPrintedSerialNo())
                .nwkSKey(m.getNwkSKey())
                .packetType(m.getPacketType())
                .permanentFlow(m.getPermanentFlow())
                .pulseValue(m.getPulseValue())
                .radioProtocolMode(m.getRadioProtocolMode())
                .radioTechnology(m.getRadioTechnology())
                .radioTelegramType(m.getRadioTelegramType())
                .subDeviceNr(m.getSubDeviceNr())
                .rollerDigits(m.getRollerDigits())
                .scenario(m.getScenario())
                .serialNoFull(m.getSerialNoFull())
                .tempRange(m.getTempRange())
                .waterMeterLength(m.getWaterMeterLength())
                .zennerMaterialNo(m.getZennerMaterialNo())
                .zennerShortDescription(m.getZennerShortDescription().replaceAll("," ," "))
                .joinEUI(m.getJoinEUI())
                .build();

    }
}
