package edu.Haim.java;

public class Main {

    public static void main(String[] args) {
//        Person p = new Person("Moshe", "Doe");
//        String csv = p.toCSV();
//        FileIO.write("1.txt", csv, true);

        String pFromFile = FileIO.read("1.txt");
        Person pFromDisk = Person.fromCSV(pFromFile);
        System.out.println(pFromDisk);



    }
}
