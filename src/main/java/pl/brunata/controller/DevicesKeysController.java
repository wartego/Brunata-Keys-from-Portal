package pl.brunata.controller;

import lombok.extern.slf4j.Slf4j;
import pl.brunata.entity.DevicesKey;
import pl.brunata.mapper.DeviceMapper;
import pl.brunata.service.DevicesKeysService;
import pl.brunata.xmlDAOmapper.MainDevice;

import java.util.List;

@Slf4j


public class DevicesKeysController {

  private final DevicesKeysService devicesKeysService = new DevicesKeysService();
  private final DeviceMapper deviceMapper = new DeviceMapper();

  public void create(MainDevice mainDevice){
    DevicesKey devicesKey = deviceMapper.map(mainDevice);
    devicesKeysService.create(devicesKey);
  }

  public boolean existByDevEUI(MainDevice mainDevice){
    DevicesKey devicesKey = deviceMapper.map(mainDevice);
    return devicesKeysService.existByDevEUI(devicesKey);
  }
  public boolean existByPrintedSerialNo(MainDevice mainDevice){
    DevicesKey devicesKey = deviceMapper.map(mainDevice);
    return devicesKeysService.existByPrintedSerialNo(devicesKey);
  }

  public List<DevicesKey> getAllRows(){
    return devicesKeysService.getAllRows();
  }








}
