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
public class SortTheoKieu implements Comparator<MayTinh> {

    @Override
    public int compare(MayTinh o1, MayTinh o2) {
        String k1 = o1.getKieu().getKieu();
        String k2 = o2.getKieu().getKieu();
        return k1.compareTo(k2);
    }
    
}
