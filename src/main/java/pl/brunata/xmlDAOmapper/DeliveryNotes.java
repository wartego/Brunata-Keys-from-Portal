package pl.brunata.DAO;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@ToString
@Setter
@XmlRootElement(name = "DeliveryNotes")
public class DeliveryNotes{


    private double Version;

    private DeliveryNote DeliveryNote;

    @XmlAttribute (name = "Version")
    public double getVersion() {
        return Version;
    }
    @XmlElement (name = "DeliveryNote")
    public pl.brunata.DAO.DeliveryNote getDeliveryNote() {
        return DeliveryNote;
    }



}
