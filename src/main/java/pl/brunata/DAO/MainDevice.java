package pl.brunata.DAO;


import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Setter
@XmlRootElement(name = "MainDevice")
@XmlAccessorType(XmlAccessType.PROPERTY)
@ToString
public class MainDevice {

    private String ZennerShortDescription;
    private String ZennerMaterialNo;
    private String WaterMeterLength;
    private String TempRange;
    private String SubDeviceNr;
    private String SerialNoFull;
    private String Scenario;
    private String RollerDigits;
    private String RadioTelegramType;
    private String RadioTechnology;
    private String RadioProtocolMode;
    private String PulseValue;
    private String PrintedSerialNo;
    private String PermanentFlow;
    private String PacketType;
    private String NwkSKey;
    private String NetworkKey;
    private String Manufacturer;
    private String MAC_Address;
    private String LoRaWAN_Version;
    private String LoRaDeviceClass;
    private String JoinEUI;
    private String Item;
    private String Frequency;
    private String DeviceAddr;
    private String DeviceActivationMode;
    private String DevEUI;
    private String Cycle;
    private String CustomerMaterialNo;
    private String Connection;
    private String CommandVersion;
    private String AppSKey;
    private String AppKey;
    private String AES_Key;

    @XmlAttribute (name = "ZennerShortDescription")
    public String getZennerShortDescription() {
        return ZennerShortDescription;
    }
    @XmlAttribute (name = "ZennerMaterialNo")
    public String getZennerMaterialNo() {
        return ZennerMaterialNo;
    }
    @XmlAttribute (name = "WaterMeterLength")
    public String getWaterMeterLength() {
        return WaterMeterLength;
    }
    @XmlAttribute (name = "TempRange")
    public String getTempRange() {
        return TempRange;
    }
    @XmlAttribute (name = "SubDeviceNr")
    public String getSubDeviceNr() {
        return SubDeviceNr;
    }
    @XmlAttribute (name = "SerialNoFull")
    public String getSerialNoFull() {
        return SerialNoFull;
    }
    @XmlAttribute (name = "Scenario")
    public String getScenario() {
        return Scenario;
    }
    @XmlAttribute (name = "RollerDigits")
    public String getRollerDigits() {
        return RollerDigits;
    }
    @XmlAttribute (name = "RadioTelegramType")
    public String getRadioTelegramType() {
        return RadioTelegramType;
    }
    @XmlAttribute (name = "RadioTechnology")
    public String getRadioTechnology() {
        return RadioTechnology;
    }
    @XmlAttribute (name = "RadioProtocolMode")
    public String getRadioProtocolMode() {
        return RadioProtocolMode;
    }
    @XmlAttribute (name = "PulseValue")
    public String getPulseValue() {
        return PulseValue;
    }
    @XmlAttribute (name = "PrintedSerialNo")
    public String getPrintedSerialNo() {
        return PrintedSerialNo;
    }
    @XmlAttribute (name = "PermanentFlow")
    public String getPermanentFlow() {
        return PermanentFlow;
    }
    @XmlAttribute (name = "PacketType")
    public String getPacketType() {
        return PacketType;
    }
    @XmlAttribute (name = "NwkSKey")
    public String getNwkSKey() {
        return NwkSKey;
    }
    @XmlAttribute (name = "NetworkKey")
    public String getNetworkKey() {
        return NetworkKey;
    }
    @XmlAttribute (name = "Manufacturer")
    public String getManufacturer() {
        return Manufacturer;
    }
    @XmlAttribute (name = "MAC_Address")
    public String getMAC_Address() {
        return MAC_Address;
    }
    @XmlAttribute (name = "LoRaWAN_Version")
    public String getLoRaWAN_Version() {
        return LoRaWAN_Version;
    }
    @XmlAttribute (name = "LoRaDeviceClass")
    public String getLoRaDeviceClass() {
        return LoRaDeviceClass;
    }
    @XmlAttribute (name = "JoinEUI")
    public String getJoinEUI() {
        return JoinEUI;
    }
    @XmlAttribute (name = "Item")
    public String getItem() {
        return Item;
    }
    @XmlAttribute (name = "Frequency")
    public String getFrequency() {
        return Frequency;
    }
    @XmlAttribute (name = "DeviceAddr")
    public String getDeviceAddr() {
        return DeviceAddr;
    }
    @XmlAttribute (name = "DeviceActivationMode")
    public String getDeviceActivationMode() {
        return DeviceActivationMode;
    }
    @XmlAttribute (name = "DevEUI")
    public String getDevEUI() {
        return DevEUI;
    }
    @XmlAttribute (name = "Cycle")
    public String getCycle() {
        return Cycle;
    }
    @XmlAttribute (name = "CustomerMaterialNo")
    public String getCustomerMaterialNo() {
        return CustomerMaterialNo;
    }

    @XmlAttribute (name = "Connection")
    public String getConnection() {
        return Connection;
    }
    @XmlAttribute (name = "CommandVersion")
    public String getCommandVersion() {
        return CommandVersion;
    }
    @XmlAttribute (name = "AppSKey")
    public String getAppSKey() {
        return AppSKey;
    }
    @XmlAttribute (name = "AppKey")
    public String getAppKey() {
        return AppKey;
    }
    @XmlAttribute (name = "AES_Key")
    public String getAES_Key() {
        return AES_Key;
    }
}
