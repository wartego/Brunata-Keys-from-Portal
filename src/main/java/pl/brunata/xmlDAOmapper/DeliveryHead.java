package pl.brunata.xmlDAOmapper;



import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@ToString
@Setter
@XmlRootElement(name = "DeliveryHead")
public class DeliveryHead {


    private int DeliveryNoteNo;

    private Date DeliveryDate;
    @XmlAttribute (name ="DeliveryNoteNo")
    public int getDeliveryNoteNo() {
        return DeliveryNoteNo;
    }
    @XmlAttribute (name ="DeliveryDate")
    public Date getDeliveryDate() {
        return DeliveryDate;
    }
}
