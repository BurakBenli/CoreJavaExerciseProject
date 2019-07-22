package javacore.exercise.lesson39;

import java.io.*;
import java.util.Scanner;

public class workingWithFiles {
    public static void main(String[] args) {

        createFile();
        getFileInfo();
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile(){
        File file = new File("C:\\Users\\BURAK\\IdeaProjects\\CoreJavaExerciseProject\\files\\students.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Dosya Oluşturuldu");
            }else{
                System.out.println("Dosya Mevcuttur");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\BURAK\\IdeaProjects\\CoreJavaExerciseProject\\files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya Adı  : " + file.getName());
            System.out.println("Dosya Yolu  : " + file.getAbsolutePath());
            System.out.println("Dosya Yazılabilinir mi  : " + file.canWrite());
            System.out.println("Dosya Okunabılınır  mi  : " + file.canRead());
            System.out.println("Dosya Boyutu : " + file.length());

        }else{
            System.out.println("Dosya Bulunamadı");
        }

    }

    public static void readFile(){
        File file = new File("C:\\Users\\BURAK\\IdeaProjects\\CoreJavaExerciseProject\\files\\students.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


    public static void writeFile(){
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\BURAK\\IdeaProjects\\CoreJavaExerciseProject\\files\\students.txt",true));
            writer.newLine();
            writer.write("HÜSEYİN");
            System.out.println("Dosya yazıldı");
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
