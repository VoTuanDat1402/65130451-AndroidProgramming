package com.example.vieccanlam;

import java.io.Serializable;
import java.util.HashMap;

public class TASKS implements Serializable {
    String name;
    String date;
    String massage;
    String priority;

    public TASKS(String name, String date, String massage, String priority) {
        this.name = name;
        this.date = date;
        this.massage = massage;
        this.priority = priority;
    }

    public TASKS() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    //
    public HashMap<String, String> toFirebaseObject(){
        HashMap<String, String> taskObject = new HashMap<String, String>();
        taskObject.put("name",name);
        taskObject.put("date",name);
        taskObject.put("massage",name);
        taskObject.put("priority",name);
        return taskObject;
    }
}
