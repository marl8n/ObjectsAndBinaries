/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectsandbinaryfiles.files;

import com.objectsandbinaryfiles.classes.Person;
import static com.objectsandbinaryfiles.files.DataAndList.filePath;
import static com.objectsandbinaryfiles.files.DataAndList.persons;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MIDP9
 */
public class LoadFileData {
    public static void load () throws IOException {
        
        Object buffer = null;
        
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            while( ( buffer = ois.readObject() ) != null){
                persons.add((Person) buffer);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoadFileData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoadFileData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
