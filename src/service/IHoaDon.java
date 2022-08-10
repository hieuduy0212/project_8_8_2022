/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import DTO.HoaDon;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Hieuu
 */
public interface IHoaDon {

    LinkedList<HoaDon> getAll();

    void themHoaDon(Scanner sc, IMayTinh iMayTinh);

    void showAll(LinkedList<HoaDon> list);

    void outPut();
}
