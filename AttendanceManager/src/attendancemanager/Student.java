package attendancemanager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HYPE AMD
 */
public class Student {
    private String name;
    private String id;
    private boolean attendanceStatus;

    // Constructor
    public Student(String name, String id, boolean attendanceStatus) {
        this.name = name;
        this.id = id;
        this.attendanceStatus = attendanceStatus;
    }

    // Getter and Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAttendanceStatus(boolean status) {
        this.attendanceStatus = status;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public boolean getAttendanceStatus() {
        return attendanceStatus;
    }

    // Display student information
    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Attendance Status: " + (attendanceStatus ? "Present" : "Absent"));
    }

    // Override toString method for easy display
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Attendance: " + (attendanceStatus ? "Present" : "Absent");
    }
}
