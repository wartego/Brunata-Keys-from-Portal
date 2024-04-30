package pl.brunata.service;

import lombok.RequiredArgsConstructor;
import pl.brunata.dao.DeviceKeysDAO;
import pl.brunata.entity.DevicesKey;

import java.util.List;

@RequiredArgsConstructor
public class DevicesKeysService {

    private final DeviceKeysDAO deviceKeysDAO = new DeviceKeysDAO();

    public void create(DevicesKey devicesKey){
        deviceKeysDAO.create(devicesKey);
    }

    public void createBatch(List<DevicesKey> devicesKeys){
        deviceKeysDAO.createBatch(devicesKeys);
    }
    public boolean existByDevEUI(DevicesKey devicesKey){
        return deviceKeysDAO.existByDevEUI(devicesKey);
    }
    public boolean existByPrintedSerialNo(DevicesKey devicesKey){
        return deviceKeysDAO.existByPrintedSerial(devicesKey);
    }
    public List<DevicesKey> getAllRows(){
        return deviceKeysDAO.getAllRows();
    }

}
