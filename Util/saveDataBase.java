package OOP.Util;

import java.io.Serializable;
import OOP.UserSystem.User;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class saveDataBase implements Serializable {
    static {
        if (new File("data.ser").exists()) {
            try {
                database.instance = readData();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            database.instance = new database();
        }
    }

    static database readData() throws Exception {
        FileInputStream fis = new FileInputStream("data.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        @SuppressWarnings("unchecked")
        database d = (database) ois.readObject();
        HashMap<String, User> users = d.getListOfUsers();
        for (Map.Entry<String, User> hm : users.entrySet()) {
            System.out.println(hm.getValue().getUsername());
        }
        fis.close();
        ois.close();

        return d;
    }

    static void saveData(database d) throws Exception {
        FileOutputStream fos = new FileOutputStream("data.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(d);

        fos.close();
        oos.close();
    }
}
