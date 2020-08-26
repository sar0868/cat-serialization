package ru.toofast.cat.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Sandbox {


/*    public static void main(String[] args) {
        BufferedOutputStream faos = null;
        try {
            faos = new BufferedOutputStream(new FileOutputStream("text.txt", true));
            try {
                for (int i = 0; i < 5 * 1024 * 1024; i++) {
                    faos.write(67);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                faos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

    public static class User{

        Long id;
        String name;
        String email;

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }


/*    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = bufferedReader.readLine();
        String[] s1 = s.split(" ");

        User user = new User();
        user.id = Long.valueOf(s1[0]);
        user.name = s1[1];
        user.email = s1[2];

        System.out.println(user);
    }*/

    public static void main(String[] args) {

        Path path = Paths.get("hello.txt");
        try {
            List<String> strings = Files.readAllLines(path);
            Stream<String> lines = Files.lines(path);

            lines.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
