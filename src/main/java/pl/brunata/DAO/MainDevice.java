package pl.brunata.DAO;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonIgnoreProperties({""})

public class MainDevice {

    @JacksonXmlProperty (localName = "ZennerShortDescription" , isAttribute = true)
    private String ZennerShortDescription ;
    @JacksonXmlProperty (localName = "ZennerMaterialNo" , isAttribute = true)
    private String ZennerMaterialNo;
    @JacksonXmlProperty (localName = "WaterMeterLength" , isAttribute = true)
    private String WaterMeterLength;
    @JacksonXmlProperty (localName = "TempRange" , isAttribute = true)
    private String TempRange;
    @JacksonXmlProperty (localName = "SubDeviceNr" , isAttribute = true)
    private int SubDeviceNr;
    @JacksonXmlProperty (localName = "SerialNoFull" , isAttribute = true)
    private String SerialNoFull;
    @JacksonXmlProperty (localName = "Scenario" , isAttribute = true)
    private String Scenario;
    @JacksonXmlProperty (localName = "RollerDigits" , isAttribute = true)
    private String RollerDigits;
    @JacksonXmlProperty (localName = "RadioTelegramType" , isAttribute = true)
    private String RadioTelegramType;
    @JacksonXmlProperty (localName = "RadioTechnology" , isAttribute = true)
    private String RadioTechnology;
    @JacksonXmlProperty (localName = "RadioProtocolMode" , isAttribute = true)
    private String RadioProtocolMode;
    @JacksonXmlProperty (localName = "PulseValue" , isAttribute = true)
    private String PulseValue;
    @JacksonXmlProperty (localName = "PrintedSerialNo" , isAttribute = true)
    private String PrintedSerialNo;
    @JacksonXmlProperty (localName = "PermanentFlow" , isAttribute = true)
    private String PermanentFlow;
    @JacksonXmlProperty (localName = "PacketType" , isAttribute = true)
    private String PacketType;
    @JacksonXmlProperty (localName = "NwkSKey" , isAttribute = true)
    private String NwkSKey;
    @JacksonXmlProperty (localName = "NetworkKey" , isAttribute = true)
    private String NetworkKey;
    @JacksonXmlProperty (localName = "Manufacturer" , isAttribute = true)
    private String Manufacturer;
    @JacksonXmlProperty (localName = "MAC_Address" , isAttribute = true)
    private String MAC_Address;
    @JacksonXmlProperty (localName = "LoRaWAN_Version" , isAttribute = true)
    private String LoRaWAN_Version;
    @JacksonXmlProperty (localName = "LoRaDeviceClass" , isAttribute = true)
    private String LoRaDeviceClass;
    @JacksonXmlProperty (localName = "JoinEUI" , isAttribute = true)
    private String JoinEUI;
    @JacksonXmlProperty (localName = "Item" , isAttribute = true)
    private String Item;
    @JacksonXmlProperty (localName = "Frequency" , isAttribute = true)
    private String Frequency;
    @JacksonXmlProperty (localName = "DeviceAddr" , isAttribute = true)
    private String DeviceAddr;
    @JacksonXmlProperty (localName = "DeviceActivationMode" , isAttribute = true)
    private String DeviceActivationMode;
    @JacksonXmlProperty (localName = "DevEUI" , isAttribute = true)
    private String DevEUI;
    @JacksonXmlProperty (localName = "Cycle" , isAttribute = true)
    private String Cycle;
    @JacksonXmlProperty (localName = "CustomerMaterialNo" , isAttribute = true)
    private String CustomerMaterialNo;
    @JacksonXmlProperty (localName = "Connection" , isAttribute = true)
    private String Connection;
    @JacksonXmlProperty (localName = "CommandVersion" , isAttribute = true)
    private String CommandVersion;
    @JacksonXmlProperty (localName = "AppSKey" , isAttribute = true)
    private String AppSKey;
    @JacksonXmlProperty (localName = "AppKey" , isAttribute = true)
    private String AppKey;
    @JacksonXmlProperty (localName = "AES_Key" , isAttribute = true)
    private String AES_Key;


    @Override
    public String toString() {
        return "MainDevice{" +
                "ZennerShortDescription='" + ZennerShortDescription + '\'' +
                ", ZennerMaterialNo='" + ZennerMaterialNo + '\'' +
                ", WaterMeterLength='" + WaterMeterLength + '\'' +
                ", TempRange='" + TempRange + '\'' +
                ", SubDeviceNr=" + SubDeviceNr +
                ", SerialNoFull='" + SerialNoFull + '\'' +
                ", Scenario='" + Scenario + '\'' +
                ", RollerDigits='" + RollerDigits + '\'' +
                ", RadioTelegramType='" + RadioTelegramType + '\'' +
                ", RadioTechnology='" + RadioTechnology + '\'' +
                ", RadioProtocolMode='" + RadioProtocolMode + '\'' +
                ", PulseValue='" + PulseValue + '\'' +
                ", PrintedSerialNo='" + PrintedSerialNo + '\'' +
                ", PermanentFlow='" + PermanentFlow + '\'' +
                ", PacketType='" + PacketType + '\'' +
                ", NwkSKey='" + NwkSKey + '\'' +
                ", NetworkKey='" + NetworkKey + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", MAC_Address='" + MAC_Address + '\'' +
                ", LoRaWAN_Version='" + LoRaWAN_Version + '\'' +
                ", LoRaDeviceClass='" + LoRaDeviceClass + '\'' +
                ", JoinEUI='" + JoinEUI + '\'' +
                ", Item='" + Item + '\'' +
                ", Frequency='" + Frequency + '\'' +
                ", DeviceAddr='" + DeviceAddr + '\'' +
                ", DeviceActivationMode='" + DeviceActivationMode + '\'' +
                ", DevEUI='" + DevEUI + '\'' +
                ", Cycle='" + Cycle + '\'' +
                ", CustomerMaterialNo='" + CustomerMaterialNo + '\'' +
                ", Connection='" + Connection + '\'' +
                ", CommandVersion='" + CommandVersion + '\'' +
                ", AppSKey='" + AppSKey + '\'' +
                ", AppKey='" + AppKey + '\'' +
                ", AES_Key='" + AES_Key + '\'' +
                '}';
    }
    @JacksonXmlProperty (localName = "ZennerShortDescription" , isAttribute = true)
    public String getZennerShortDescription() {
        return ZennerShortDescription;
    }

    public void setZennerShortDescription(String zennerShortDescription) {
        ZennerShortDescription = zennerShortDescription;
    }

    public String getZennerMaterialNo() {
        return ZennerMaterialNo;
    }

    public void setZennerMaterialNo(String zennerMaterialNo) {
        ZennerMaterialNo = zennerMaterialNo;
    }

    public String getWaterMeterLength() {
        return WaterMeterLength;
    }

    public void setWaterMeterLength(String waterMeterLength) {
        WaterMeterLength = waterMeterLength;
    }

    public String getTempRange() {
        return TempRange;
    }

    public void setTempRange(String tempRange) {
        TempRange = tempRange;
    }

    public int getSubDeviceNr() {
        return SubDeviceNr;
    }

    public void setSubDeviceNr(int subDeviceNr) {
        SubDeviceNr = subDeviceNr;
    }

    public String getSerialNoFull() {
        return SerialNoFull;
    }

    public void setSerialNoFull(String serialNoFull) {
        SerialNoFull = serialNoFull;
    }

    public String getScenario() {
        return Scenario;
    }

    public void setScenario(String scenario) {
        Scenario = scenario;
    }

    public String getRollerDigits() {
        return RollerDigits;
    }

    public void setRollerDigits(String rollerDigits) {
        RollerDigits = rollerDigits;
    }

    public String getRadioTelegramType() {
        return RadioTelegramType;
    }

    public void setRadioTelegramType(String radioTelegramType) {
        RadioTelegramType = radioTelegramType;
    }

    public String getRadioTechnology() {
        return RadioTechnology;
    }

    public void setRadioTechnology(String radioTechnology) {
        RadioTechnology = radioTechnology;
    }

    public String getRadioProtocolMode() {
        return RadioProtocolMode;
    }

    public void setRadioProtocolMode(String radioProtocolMode) {
        RadioProtocolMode = radioProtocolMode;
    }

    public String getPulseValue() {
        return PulseValue;
    }

    public void setPulseValue(String pulseValue) {
        PulseValue = pulseValue;
    }

    public String getPrintedSerialNo() {
        return PrintedSerialNo;
    }

    public void setPrintedSerialNo(String printedSerialNo) {
        PrintedSerialNo = printedSerialNo;
    }

    public String getPermanentFlow() {
        return PermanentFlow;
    }

    public void setPermanentFlow(String permanentFlow) {
        PermanentFlow = permanentFlow;
    }

    public String getPacketType() {
        return PacketType;
    }

    public void setPacketType(String packetType) {
        PacketType = packetType;
    }

    public String getNwkSKey() {
        return NwkSKey;
    }

    public void setNwkSKey(String nwkSKey) {
        NwkSKey = nwkSKey;
    }

    public String getNetworkKey() {
        return NetworkKey;
    }

    public void setNetworkKey(String networkKey) {
        NetworkKey = networkKey;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getMAC_Address() {
        return MAC_Address;
    }

    public void setMAC_Address(String MAC_Address) {
        this.MAC_Address = MAC_Address;
    }

    public String getLoRaWAN_Version() {
        return LoRaWAN_Version;
    }

    public void setLoRaWAN_Version(String loRaWAN_Version) {
        LoRaWAN_Version = loRaWAN_Version;
    }

    public String getLoRaDeviceClass() {
        return LoRaDeviceClass;
    }

    public void setLoRaDeviceClass(String loRaDeviceClass) {
        LoRaDeviceClass = loRaDeviceClass;
    }

    public String getJoinEUI() {
        return JoinEUI;
    }

    public void setJoinEUI(String joinEUI) {
        JoinEUI = joinEUI;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public String getFrequency() {
        return Frequency;
    }

    public void setFrequency(String frequency) {
        Frequency = frequency;
    }

    public String getDeviceAddr() {
        return DeviceAddr;
    }

    public void setDeviceAddr(String deviceAddr) {
        DeviceAddr = deviceAddr;
    }

    public String getDeviceActivationMode() {
        return DeviceActivationMode;
    }

    public void setDeviceActivationMode(String deviceActivationMode) {
        DeviceActivationMode = deviceActivationMode;
    }

    public String getDevEUI() {
        return DevEUI;
    }

    public void setDevEUI(String devEUI) {
        DevEUI = devEUI;
    }

    public String getCycle() {
        return Cycle;
    }

    public void setCycle(String cycle) {
        Cycle = cycle;
    }

    public String getCustomerMaterialNo() {
        return CustomerMaterialNo;
    }

    public void setCustomerMaterialNo(String customerMaterialNo) {
        CustomerMaterialNo = customerMaterialNo;
    }

    public String getConnection() {
        return Connection;
    }

    public void setConnection(String connection) {
        Connection = connection;
    }

    public String getCommandVersion() {
        return CommandVersion;
    }

    public void setCommandVersion(String commandVersion) {
        CommandVersion = commandVersion;
    }

    public String getAppSKey() {
        return AppSKey;
    }

    public void setAppSKey(String appSKey) {
        AppSKey = appSKey;
    }

    public String getAppKey() {
        return AppKey;
    }

    public void setAppKey(String appKey) {
        AppKey = appKey;
    }

    public String getAES_Key() {
        return AES_Key;
    }

    public void setAES_Key(String AES_Key) {
        this.AES_Key = AES_Key;
    }
}
