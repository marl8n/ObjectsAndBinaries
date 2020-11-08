/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectsandbinaryfiles.files;

import static com.objectsandbinaryfiles.files.DataAndList.filePath;
import static com.objectsandbinaryfiles.files.DataAndList.filePathCSV;
import static com.objectsandbinaryfiles.files.DataAndList.persons;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MIDP9
 */
public class SaveFile {
    
    public static void saveObjects() {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for ( int i = 0; i < persons.size(); i++ ){
                oos.writeObject(persons.get(i));
            }
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void saveAsCSV() {
        String information = "";
        
        try {
            FileWriter w = new FileWriter(filePathCSV);
            for ( int i = 0 ; i < persons.size(); i++ ) {
                information = information.concat(persons.get(i).toString()) + "\n";
            }
            w.write(information);
            w.close();
        } catch (IOException ex) {
            Logger.getLogger(SaveFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
