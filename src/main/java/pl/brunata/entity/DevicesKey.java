package pl.brunata.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "devices_details")
public class DevicesKeys {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String zennerShortDescription;
    private String zennerMaterialNo;
    private String waterMeterLength;
    private String tempRange;
    private String subDeviceNr;
    private String serialNoFull;
    private String scenario;
    private String rollerDigits;
    private String radioTelegramType;
    private String radioTechnology;
    private String radioProtocolMode;
    private String pulseValue;
    private String printedSerialNo;
    private String permanentFlow;
    private String packetType;
    private String nwkSKey;
    private String networkKey;
    private String manufacturer;
    private String MAC_Address;
    private String loRaWAN_Version;
    private String loRaDeviceClass;
    private String joinEUI;
    private String item;
    private String frequency;
    private String deviceAddr;
    private String deviceActivationMode;
    private String devEUI;
    private String cycle;
    private String customerMaterialNo;
    private String connection;
    private String commandVersion;
    private String AppSKey;
    private String AppKey;
    private String AES_key;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DevicesKeys that = (DevicesKeys) o;
        return id == that.id && Objects.equals(zennerShortDescription, that.zennerShortDescription) && Objects.equals(zennerMaterialNo, that.zennerMaterialNo) && Objects.equals(waterMeterLength, that.waterMeterLength) && Objects.equals(tempRange, that.tempRange) && Objects.equals(subDeviceNr, that.subDeviceNr) && Objects.equals(serialNoFull, that.serialNoFull) && Objects.equals(scenario, that.scenario) && Objects.equals(rollerDigits, that.rollerDigits) && Objects.equals(radioTelegramType, that.radioTelegramType) && Objects.equals(radioTechnology, that.radioTechnology) && Objects.equals(radioProtocolMode, that.radioProtocolMode) && Objects.equals(pulseValue, that.pulseValue) && Objects.equals(printedSerialNo, that.printedSerialNo) && Objects.equals(permanentFlow, that.permanentFlow) && Objects.equals(packetType, that.packetType) && Objects.equals(nwkSKey, that.nwkSKey) && Objects.equals(networkKey, that.networkKey) && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(MAC_Address, that.MAC_Address) && Objects.equals(loRaWAN_Version, that.loRaWAN_Version) && Objects.equals(loRaDeviceClass, that.loRaDeviceClass) && Objects.equals(joinEUI, that.joinEUI) && Objects.equals(item, that.item) && Objects.equals(frequency, that.frequency) && Objects.equals(deviceAddr, that.deviceAddr) && Objects.equals(deviceActivationMode, that.deviceActivationMode) && Objects.equals(devEUI, that.devEUI) && Objects.equals(cycle, that.cycle) && Objects.equals(customerMaterialNo, that.customerMaterialNo) && Objects.equals(connection, that.connection) && Objects.equals(commandVersion, that.commandVersion) && Objects.equals(AppSKey, that.AppSKey) && Objects.equals(AppKey, that.AppKey) && Objects.equals(AES_key, that.AES_key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, zennerShortDescription, zennerMaterialNo, waterMeterLength, tempRange, subDeviceNr, serialNoFull, scenario, rollerDigits, radioTelegramType, radioTechnology, radioProtocolMode, pulseValue, printedSerialNo, permanentFlow, packetType, nwkSKey, networkKey, manufacturer, MAC_Address, loRaWAN_Version, loRaDeviceClass, joinEUI, item, frequency, deviceAddr, deviceActivationMode, devEUI, cycle, customerMaterialNo, connection, commandVersion, AppSKey, AppKey, AES_key);
    }
}
