package pl.brunata.csv.mcids;

import pl.brunata.xmlDAOmapper.MainDevice;

import java.util.List;

public interface ICsvFileMCIDWriter {

    void csvWriterToFile(List<MainDevice> mainDevices);
    void filterRows();
}
