/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Collections;
import java.util.Scanner;

import service.IHoaDon;
import service.IMayTinh;
import service.SortTheoKieu;
import service.SortTheoMau;
import service.SortTheoTen;
import service.impl.HoaDonService;
import service.impl.MayTinhService;

/**
 * @author Hieuu
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IMayTinh iMayTinh = new MayTinhService();
        IHoaDon iHoaDon = new HoaDonService();

        while (true) {
            System.out.println("----------------------------------");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Thêm khách hàng");
            System.out.println("4. Xem danh sách hóa đơn");
            System.out.println("5. Sắp xếp sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo màu");
            System.out.println("7. Sắp xếp sản phẩm theo kiểu");
            System.out.println("8. In hóa đơn dạng txt");
            System.out.println("9. In danh sách sản phẩm dạng txt");
            System.out.println("10. Thoát");
            System.out.println("Bạn chọn mục nào?");
            int select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1:
                    //xem danh sach
                    iMayTinh.showAll(iMayTinh.getAll());
                    break;
                case 2:
                    // them sp
                    iMayTinh.insert(sc);
                    break;
                case 3:
                    // them khach hang
                    iHoaDon.themHoaDon(sc, iMayTinh);
                    break;
                case 4:
                    iHoaDon.showAll(iHoaDon.getAll());
                    break;
                case 5:
                    // sc theo ten
                    Collections.sort(iMayTinh.getAll(), new SortTheoTen());
                    break;
                case 6:
                    // sx theo mau
                    Collections.sort(iMayTinh.getAll(), new SortTheoMau());
                    break;
                case 7:
                    // sx theo kieu
                    Collections.sort(iMayTinh.getAll(), new SortTheoKieu());
                    break;
                case 8:
                    // in hoa don
                    iHoaDon.outPut();
                    break;
                case 9:
                    // in danh sach mat hang
                    iMayTinh.outPut();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại!");
                    break;
            }
        }

    }
}
