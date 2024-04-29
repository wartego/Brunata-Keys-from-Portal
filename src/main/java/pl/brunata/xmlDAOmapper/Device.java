package pl.brunata.xmlDAOmapper;


import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@ToString
@XmlRootElement(name = "Device")
public class Device {

    public MainDevice MainDevice;


    @XmlElement (name ="MainDevice")
    public pl.brunata.xmlDAOmapper.MainDevice getMainDevice() {
        return MainDevice;
    }
}
