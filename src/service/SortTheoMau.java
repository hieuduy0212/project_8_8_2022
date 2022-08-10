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
public class SortTheoMau implements Comparator<MayTinh>{

    @Override
    public int compare(MayTinh o1, MayTinh o2) {
        String m1 = o1.getMau().getColor();
        String m2 = o2.getMau().getColor();
        return m1.compareTo(m2);
    }

    

    
    
}
