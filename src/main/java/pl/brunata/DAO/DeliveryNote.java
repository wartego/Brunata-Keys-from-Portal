package pl.brunata.DAO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryNote {
    @JacksonXmlProperty(localName = "DeliveryHead")
    private DeliveryHead deliveryHead;
    @JacksonXmlProperty(localName = "Devices")
    private Devices devices;
}
