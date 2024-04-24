package pl.brunata.DAO;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Device {
    @JacksonXmlProperty(localName = "MainDevice")
    public MainDevice MainDevice;
}
