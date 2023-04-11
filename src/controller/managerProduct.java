package controller;

import Model.People;
import io.ReadAndWrite;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class managerProduct {
    File file = new File("C:\\Users\\Admin\\Desktop\\casemodule_6\\QL_sinhvien\\src\\FileText\\Product");
    ReadAndWrite<People> readAndWrite = new ReadAndWrite<>();
    ArrayList<People> people = readAndWrite.read(file);
    Scanner scanner = new Scanner(System.in);

    public int findIndexById(int id) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

public People Create() {
    int id;
    int index;
    while (true) {
        System.out.println("nhập id: ");
        id = Integer.parseInt(scanner.nextLine());
        index = findIndexById(id);
        if (index == 1) {
            break;
        }
        System.out.println("Id trùng");
    }
    System.out.println("Nhập name");
    String name = scanner.nextLine();
    System.out.println("Nhập birth");
    int birth = Integer.parseInt(scanner.nextLine());
    System.out.println("Nhập address");
    String address = scanner.nextLine();
    System.out.println("Nhập chiều cao");
    int height = Integer.parseInt(scanner.nextLine());
    System.out.println("nhập cân nặng:");
    int weight = Integer.parseInt(scanner.nextLine());
    return new People(id, name, birth, address, height, weight);
}
    }
