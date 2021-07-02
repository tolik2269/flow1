package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static <text> void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        File dir1 = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games");
        File dir = new File("Games");
        if (dir1.mkdir()) {
            sb.append("Папка создана \n");
        }
        File dir2 = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games//src");
          if (dir2.mkdir()) {
            sb.append("Папка создана \n");
        }
        File dir3 = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games//res");
               if (dir3.mkdir()) {
            sb.append("Папка создана \n");
        }
        File dir4 = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games//savegames");
        if (dir4.mkdir()) {
            sb.append("Папка создана \n");
        }
        File dir5 = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games//temp");
        if (dir5.mkdir()) {
            sb.append("Папка создана \n");
        }
        File dir6 = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games//src//main");
        if (dir6.mkdir()) {
            sb.append("Папка создана \n");
        }
        File dir7 = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games//src//test");
        if (dir7.mkdir()) {
            sb.append("Папка создана \n");
        }
        File dir8 = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games//res//drawables");
        if (dir8.mkdir()) {
            sb.append("Папка создана \n");
        }
        File dir9 = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games//res//vectors");
        if (dir9.mkdir()) {
            sb.append("Папка создана \n");
        }
        File dir10 = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games//res//icons");
        if (dir10.mkdir()) {
            sb.append("Папка создана \n");
        }


        File myFile = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games//src//main//Main.java");
        try {
            if (myFile.createNewFile()) ;
            sb.append("Файл был создан \n");
        }catch (IOException ex) {
            sb.append(ex.getMessage());
        }
        File myFile2 = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games//src//main//Utils.java");
        try {
            if (myFile2.createNewFile()) ;
            sb.append("Файл был создан \n");
        }catch (IOException ex) {
            sb.append(ex.getMessage());
        }
        File myFile3 = new File("C://Users//Anato//Рабочий стол//задчи по джаве//Games//temp//temp.txt");
        try {
            if (myFile3.createNewFile()) ;
            sb.append("Файл был создан \n");
        }catch (IOException ex) {
            sb.append(ex.getMessage());
        }
        System.out.println(sb.toString());

        String text= "Папка создана, файл созден";
        try (FileWriter writer = new FileWriter ("C://Users//Anato//Рабочий стол//задчи по джаве//Games//temp//temp.txt", false)) {
    writer.write(text);
    writer.append('\n');
    writer.append('!');
    writer.flush();
        } catch (IOException ex) {
         System.out.println(ex.getMessage());
        }
    }
        }

