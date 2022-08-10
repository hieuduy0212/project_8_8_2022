package service;

import DTO.MayTinh;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Hieuu
 */
public interface IMayTinh {

    LinkedList<MayTinh> getAll();

    void showAll(LinkedList<MayTinh> list);

    void insert(Scanner sc);

    MayTinh find(String tenMay, String mau, String kieu);

    void outPut();
}
