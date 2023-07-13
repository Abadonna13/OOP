package ru.gb.lesson3;

import java.beans.Transient;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class SerializableMain {

    public static void main(String[] args) throws IOException {
        // [app1] <---network---> [app2]

        Path employeePath = Path.of("employee-data");
        if (Files.notExists(employeePath)) {
            Files.createFile(employeePath);
        }

//        Employee employee = new Employee();
        try (ObjectInputStream os = new ObjectInputStream(Files.newInputStream(employeePath))) {
            Employee employee = (Employee) os.readObject();
//            Employee o = (Employee) os.readObject();
            System.out.println(employee);
//            os.writeObject(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }

    static class Employee implements Serializable {

        private static final long serialVersionUID = -6849794470754667710L;

        private UUID id = UUID.fromString("18abc425-5b4d-41ec-8d4b-372e96f48a08"); //UUID.randomUUID();
        private int age = 55; //ThreadLocalRandom.current().nextInt(20, 60);
        private transient String name = "default";


        @Override
        public String toString() {
            return "[" + id + "] (" + age + ")";
        }
    }

}
