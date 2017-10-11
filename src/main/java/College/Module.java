/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

import java.util.ArrayList;


/**
 *
 * @author Padraig
 */
public class Module {
    //Variables regarding information of the modules
    private String ModuleName;
    private String ModuleID;
    private ArrayList<Student> Students;
    
    //Module Constructor
    public Module(String ModuleName, String ModuleID){
        this.Students = new ArrayList<Student>();
        this.ModuleName = ModuleName;
        this.ModuleID = ModuleID;
    }

    //My various setters and getters
    public void setModuleName(String ModuleName) {
        this.ModuleName = ModuleName;
    }

    public void setModuleID(String ModuleID) {
        this.ModuleID = ModuleID;
    }

    public void setStudents(ArrayList<Student> Students) {
        this.Students = Students;
    }

    public String getModuleName() {
        return ModuleName;
    }

    public String getModuleID() {
        return ModuleID;
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }
    
    //This adds each student to tthe module. This is called in the main class App
    public boolean addStudent(Student student){
        if (student==null || Students.contains(student)) {
            return false;
        }
        Students.add(student);
        return true;
    }

    //This is what I use to print off the student information
    public void printStudents(){
        Students.stream().forEach((s) -> {
            System.out.println("Name: " + s.getName() + " " + "ID: " + s.getID() + " " + "Age: " + s.getAge() );
        });
    }
}
