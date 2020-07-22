package com.github.smallAttr.cloudfollowup;

import com.github.smallAttr.cloudfollowup.Visit.VisitStatus;

import java.io.*;

/**
 * @author smallAttr
 * @since 2020-04-29 11:32
 */
public class VisitTest {

    public static void main(String[] args) {

        Visit visit = new Visit();
        VisitStatus status = visit.new VisitStatus();
        status.setId(2);
        status.setText("test");
        visit.setId(1);
        visit.setName("visit");
        visit.setDescription("description");
        visit.setStatus(status);

        serializeClass(visit);

    }

    private static void serializeClass(Visit visit) {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(visit);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }


    private static void deserializeClass() {
        Visit visit = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            visit = (Visit) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {

            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
    }
}
