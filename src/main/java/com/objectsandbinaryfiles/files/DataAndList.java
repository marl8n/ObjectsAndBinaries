/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectsandbinaryfiles.files;

import com.objectsandbinaryfiles.classes.Person;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author MIDP9
 */
public class DataAndList {

    public static String directory = System.getProperty("user.home");
    public static String fileName = "persons.dat";
    public static String filePath = directory + File.separator + "Pruebas" + File.separator + fileName;
    public static String filePathCSV = directory + File.separator + "Pruebas" + File.separator + "Persons.csv";
    
    public static ArrayList<Person> persons = new ArrayList();
    
}
