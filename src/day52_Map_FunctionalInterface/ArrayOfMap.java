package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayOfMap {
    public static void main(String[] args) {

    Map<String, String> scrumTeam1 = new LinkedHashMap<>();
    scrumTeam1.put("Samet","SM");
    scrumTeam1.put("Kayra","Developer");
    scrumTeam1.put("Uras","Developer");
    scrumTeam1.put("Mert","PO");
    scrumTeam1.put("Sevo","SDET");

    Map<String, String> scrumTeam2 = new LinkedHashMap<>();
    scrumTeam2.put("Tayyar","SDET");
    scrumTeam2.put("Eva","Developer");
    scrumTeam2.put("Keskin","Developer");
    scrumTeam2.put("Cem","PO");
    scrumTeam2.put("Ebru","SM");
    scrumTeam2.put("Valery","SDET");

    Map<String, String> scrumTeam3 = new LinkedHashMap<>();
    scrumTeam3.put("YanChun", "BA");
    scrumTeam3.put("Tahir", "Developer");
    scrumTeam3.put("Urantuya", "SM");
    scrumTeam3.put("Veronica", "Developer");
    scrumTeam3.put("Alex", "Developer");
    scrumTeam3.put("Tomris", "Developer");

    Map<String, String> scrumTeam4 = new LinkedHashMap<>();
    scrumTeam4.put("Alim", "PO");
    scrumTeam4.put("Kaiser", "SDET");
    scrumTeam4.put("Alinur","SDET");
    scrumTeam4.put("Farya","Develepor");
    scrumTeam4.put("Sherzod", "Developer");
    scrumTeam4.put("Gulsen", "SM");
    scrumTeam4.put("David","Sdet");

    Map<String, String> scrumTeam5 = new LinkedHashMap<>();
    scrumTeam5.put("Elza","SDET");
    scrumTeam5.put("Mehmet","Developer");
    scrumTeam5.put("Stefan","Developer");
    scrumTeam5.put("Rishat","PO");
    scrumTeam5.put("Ismail","SM");
    scrumTeam5.put("Tamara","SDET");
    scrumTeam5.put("Adnan","QA");


    Map<String, String>[]  array = new Map[5];
    array[0] = scrumTeam1;
    array[1] = scrumTeam2;
    array[2] = scrumTeam3;
    array[3] = scrumTeam4;
    array[4] = scrumTeam5;

    System.out.println(Arrays.toString(array) );

    System.out.println(array.length);



}


}
