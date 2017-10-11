package College;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Padraig
 */
public class Student {
    private int age;
    private String name;
    private String username;
    private int ID;
    private String DOB;
    
    public Student(int age, String name, String username, int ID, String DOB){
        this.age = age;
        this.name = name;
        this.username = username;
        this.ID = ID;
        this.DOB = DOB;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setUserName(String username) {
        this.username = username;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        username = name + age;
        return username;
    }
    
    public int getID() {
        return ID;
    }

    public String getDOB() {
        return DOB;
    }
    
    
}
