package pl.brunata.DAO;


import lombok.*;

import javax.xml.bind.annotation.*;
import java.util.List;

@ToString
@Setter
@XmlRootElement(name = "DeliveryNote")
//@XmlAccessorType(XmlAccessType.PROPERTY)
public class DeliveryNote {


    private DeliveryHead DeliveryHead;
//    @XmlElement (name ="Devices")
//    private Devices Devices;

    private List<Device> devices;
    @XmlElement (name ="DeliveryHead")
    public pl.brunata.DAO.DeliveryHead getDeliveryHead() {
        return DeliveryHead;
    }
    @XmlElementWrapper(name = "Devices")
    @XmlElement (name = "Device")
    public List<Device> getDevices() {
        return devices;
    }


}
