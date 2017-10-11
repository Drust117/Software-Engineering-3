/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

import java.util.ArrayList;
import org.joda.time.DateTime;
/**
 *
 * @author Padraig
 */
public class Course {
    //Variables regarding information about the course
    private String CourseName;
    private ArrayList<Module> Modules;
    private DateTime StartDate;
    private DateTime EndDate;
    
    //Course Constructor
    public Course(String CourseName,  DateTime StartDate, DateTime EndDate){
        this.Modules = new ArrayList<Module>();
        this.CourseName = CourseName;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

    //My various setters and getters
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public void setModules(ArrayList<Module> Modules) {
        this.Modules = Modules;
    }

    public void setStartDate(DateTime StartDate) {
        this.StartDate = StartDate;
    }

    public void setEndDate(DateTime EndDate) {
        this.EndDate = EndDate;
    }

    public String getCourseName() {
        return CourseName;
    }

    public ArrayList<Module> getModules() {
        return Modules;
    }

    public DateTime getStartDate() {
        return StartDate;
    }

    public DateTime getEndDate() {
        return EndDate;
    }
    
    //This adds each Module to the Course. This is called in the main class App
    public boolean addModule(Module module){
        if (module==null || Modules.contains(module)) {
            return false;
        }
        Modules.add(module);
        return true;
    }
    
    //This is what I use to print off the module information
    public void printModules(){
        Modules.stream().forEach((m) -> {
            System.out.println("Module Name: " + m.getModuleName() + " " + "Module ID: " + m.getModuleID() + "" );
        });
    }
}
