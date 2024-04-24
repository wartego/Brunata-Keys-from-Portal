package pl.brunata.DAO;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryHead {
    @JacksonXmlProperty(localName = "DeliveryNoteNo" ,isAttribute = true)
    private int deliveryNoteNo;
    @JacksonXmlProperty(localName = "DeliveryDate" ,isAttribute = true)
    private Date deliveryDate;
}
