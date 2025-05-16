package attendancemanager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author HYPE AMD
 */
import java.util.Scanner;

public class AttendanceManager {
    private Student[] students;
    private int size;

    public AttendanceManager(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    public void addStudent(String name, String id, boolean status) {
        if (size < students.length) {
            students[size] = new Student(name, id, status);
            size++;
        } else {
            System.out.println("Daftar Mahasiswa Sudah Penuh!");
        }
    }

    public void editStudent(int index, String name, String id, boolean status) {
        if (index >= 0 && index < size) {
            students[index].setName(name);
            students[index].setId(id);
            students[index].setAttendanceStatus(status);
        } else {
            System.out.println("Index Mahasiswa Invalid.");
        }
    }


    public void removeStudent(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                students[i] = students[i + 1];
            }
            students[size - 1] = null;
            size--;
        } else {
            System.out.println("Index Mahasiswa Invalid.");
        }
    }

 
    public void displayAllStudents() {
        if (size == 0) {
            System.out.println("Tidak Ada Mahasiswa Tersedia.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + students[i].toString());
            }
        }
    }

  
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu Absensi Mahasiswa:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahaiswa");
            System.out.println("3. Edit Mahasiswa");
            System.out.println("4. Hapus Mahasiswa");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Add student
                    System.out.print("Masukan Nama Mahasiswa: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukan NIM Mahasiswa: ");
                    String id = scanner.nextLine();
                    System.out.print("Masukan Status Kehadiran (true untuk hadir, false untuk alpha): ");
                    boolean status = scanner.nextBoolean();
                    addStudent(name, id, status);
                    break;
                case 2:
                    
                    displayAllStudents();
                    break;
                case 3:
                   
                    System.out.print("Masukan Nomor Mahasiswa Untuk Di Edit: ");
                    int editIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    System.out.print("Masukan Nama Baru: ");
                    String newName = scanner.nextLine();
                    System.out.print("Masukan NIM Baru: ");
                    String newId = scanner.nextLine();
                    System.out.print("Masukan Status Kehadiran Baru (true untuk hadir, false untuk alpha): ");
                    boolean newStatus = scanner.nextBoolean();
                    editStudent(editIndex, newName, newId, newStatus);
                    break;
                case 4:
                    
                    System.out.print("Masukan Nomor Mahasiswa Untuk Di Hapus: ");
                    int removeIndex = scanner.nextInt() - 1;
                    removeStudent(removeIndex);
                    break;
                case 5:
                   
                    System.out.println("Keluar Dari Aplikasi.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opsi Invalid, Coba lagi!.");
            }
        }
    }
}

