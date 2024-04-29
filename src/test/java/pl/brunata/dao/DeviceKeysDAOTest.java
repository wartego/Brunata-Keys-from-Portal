package pl.brunata.dao;

import org.junit.jupiter.api.Test;
import pl.brunata.db.HibernateUtils;
import pl.brunata.entity.DevicesKey;

import static org.junit.jupiter.api.Assertions.*;

class DeviceKeysDAOTest {

    @Test
    void existByPrintedSerial() {
        HibernateUtils.getSessionFactory();
        DeviceKeysDAO deviceKeysDAO = new DeviceKeysDAO();

        DevicesKey devicesKey = new DevicesKey();
            devicesKey.setPrintedSerialNo("6ZRI8811182340");

        boolean b = deviceKeysDAO.existByPrintedSerial(devicesKey);

        System.out.println(b);


    }
}