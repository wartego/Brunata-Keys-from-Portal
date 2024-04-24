package pl.brunata.DAO;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName  = "DeliveryNotes")
public class DeliveryNotes{

    @JacksonXmlProperty(localName ="Version" , isAttribute = true)
    private double version;
    @JacksonXmlProperty(localName = "DeliveryNote")
    private DeliveryNote deliveryNote;



}
