/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectsandbinaryfiles.files;

import static com.objectsandbinaryfiles.files.DataAndList.persons;

/**
 *
 * @author MIDP9
 */
public class SearchPerson {
    public static int searchByDpi(String dpi){
        for ( int i = 0 ; i < persons.size() ; i++ ){
            if(persons.get(i).getDpi().equals(dpi)){
                return i;
            }
        }
        return -1;
    }
}
