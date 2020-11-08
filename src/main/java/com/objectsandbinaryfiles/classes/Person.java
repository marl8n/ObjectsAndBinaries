/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectsandbinaryfiles.classes;

import static com.objectsandbinaryfiles.classes.ageUtils.AgeUtils.calculateAge;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author MIDP9
 */
public class Person implements Serializable {
    
    protected String dpi;
    protected String name;
    protected LocalDate birthDate;
    protected Integer age;

    public Person(String dpi, String name, LocalDate birthDate) {
        this.dpi = dpi;
        this.name = name;
        this.birthDate = birthDate;
        this.age = calculateAge(birthDate);
    }
    
    public void editPerson(String dpi, String name, LocalDate birthDate) {
        this.dpi = dpi;
        this.name = name;
        this.birthDate = birthDate;
        this.age = calculateAge(birthDate);
    }
    

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "dpi=" + dpi + ", name=" + name + ", birthDate=" + birthDate + ", age=" + age + '}';
    }
    
    public Object[] getInfoAsObjectArray() {
        
        Object[] o = new Object[3];
        
        o[0] = this.dpi;
        o[1] = this.name;
        o[2] = this.age;
        
        return o;
    }
}
