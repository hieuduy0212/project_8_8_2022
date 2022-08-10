/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import DTO.MayTinh;
import java.util.Comparator;

/**
 *
 * @author Hieuu
 */
public class SortTheoTen implements Comparator<MayTinh>{

    @Override
    public int compare(MayTinh o1, MayTinh o2) {
        String t1 = o1.getName(), t2 = o2.getName();
        return t1.compareTo(t2);
    }
    
}
