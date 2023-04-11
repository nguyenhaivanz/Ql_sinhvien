package controller;

import Model.People;
import Model.Sinhvien;
import io.ReadAndWrite;

import java.io.File;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Scanner;

public class manager {
File file = new File("C:\\Users\\Admin\\Desktop\\casemodule_6\\QL_sinhvien\\src\\FileText\\Product");
    ReadAndWrite<People> readAndWrite = new ReadAndWrite<>();
    ArrayList<People> people = readAndWrite.read(file);
    Scanner scanner = new Scanner(System.in);
    managerProduct managerProduct = new managerProduct();
    public void MenuProduct(){
        while (true){
            System.out.println("1.create Product");
            System.out.println("2.seach Product");
            System.out.println("3.Update Product");
            System.out.println("4.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                managerProduct.Create();
            }
        }
    }
}
