package pl.brunata.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pl.brunata.db.HibernateUtils;
import pl.brunata.entity.DevicesKey;

import java.util.List;
import java.util.Optional;

public class DeviceKeysDAO {


    public void create(DevicesKey devicesKey){
        try(Session session = HibernateUtils.openSession()){
            Transaction transaction = session.beginTransaction();
            //session.

            session.persist(devicesKey);
            transaction.commit();
        }
    }


    public void createBatch(List<DevicesKey> devicesKey){
        try(Session session = HibernateUtils.openSession()){
            int batchSize = 3000;
            Transaction transaction = session.beginTransaction();
            int counter =1;
            for(DevicesKey row : devicesKey){

               session.persist(row);
               if(counter % batchSize == 0){
                   session.flush();
                   session.clear();
               } else if (counter == devicesKey.size() - 1){
                   session.flush();
                   session.clear();
               }
               counter++;

           }
            transaction.commit();

        }
    }




    public boolean existByPrintedSerial(DevicesKey devicesKey){

        try(Session session = HibernateUtils.openSession()){

            Query<DevicesKey> query = session.createQuery("SELECT d.printedSerialNo FROM DevicesKey d WHERE d.printedSerialNo = :printedSerialNo",DevicesKey.class);
            query.setParameter("printedSerialNo", devicesKey.getPrintedSerialNo());
            Optional<DevicesKey> key = query.uniqueResultOptional();
            System.out.println(key.toString());
            return key.isPresent();
        }
    }

    public boolean existByDevEUI(DevicesKey devicesKey){

        try(Session session = HibernateUtils.openSession()){
            Query<DevicesKey> query = session.createQuery("SELECT d.devEUI FROM DevicesKey d WHERE d.devEUI = :devEUI",DevicesKey.class);
            query.setParameter("devEUI", devicesKey.getDevEUI());
            List<DevicesKey> key = query.getResultList();
            //System.out.println(key.toString());
            session.flush();
            return !key.isEmpty();
        }
    }

    public List<DevicesKey> getAllRows(){

        try(Session session = HibernateUtils.openSession()){
            Query<DevicesKey> query = session.createQuery("FROM DevicesKey",DevicesKey.class);
            List<DevicesKey> allRows = query.getResultList();
            //System.out.println(key.toString());
            return allRows;
        }
    }


}
