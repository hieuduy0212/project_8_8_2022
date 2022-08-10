/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import DTO.HoaDon;
import DTO.KhachHang;
import DTO.MayTinh;

import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Formatter;
import java.util.LinkedList;
import java.util.Scanner;

import service.IHoaDon;
import service.IMayTinh;

/**
 * @author Hieuu
 */
public class HoaDonService implements IHoaDon {

    public LinkedList<HoaDon> listHoaDon = new LinkedList<>();

    @Override
    public void themHoaDon(Scanner sc, IMayTinh iMayTinh) {
        System.out.println("Nhập tên khách hàng: ");
        String tenKH = sc.nextLine();
        boolean check = false;
        while (!check) {
            check = true;
            System.out.println("Nhập tên máy: ");
            String name = sc.nextLine();
            System.out.println("Nhập màu: ");
            String mau = sc.nextLine();
            System.out.println("Nhập kiểu: ");
            String kieu = sc.nextLine();
            MayTinh x = iMayTinh.find(name, mau, kieu);
            if (x != null) {
                System.out.println("Sản phẩm tồn tại! Vui lòng nhập số lượng: ");
                int slMua = sc.nextInt();
                HoaDon newHoaDon = new HoaDon(new KhachHang(tenKH), x, new Date(), slMua);
                listHoaDon.add(newHoaDon);
                System.out.println("Thêm hóa đơn thành công!");
            } else {
                System.out.println("Sản phẩm không tồn tại! Vui lòng chọn lại!");
                check = false;
            }
        }
    }

    @Override
    public LinkedList<HoaDon> getAll() {
        return listHoaDon;
    }

    @Override
    public void showAll(LinkedList<HoaDon> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("--------------------------");
        System.out.println(String.format("%3s %25s %10s %10s %10s %10s %15s %11s", "ID", "Tên KH", "Tên Máy", "Màu", "Kiểu", "Đơn giá", "Số lượng mua", "Thành tiền"));

        for (HoaDon i : list) {
            System.out.println(String.format("%3d %25s %10s %10s %10s %10s %15s %11s", i.getId(), i.getKhachHang().getName(), i.getMayTinh().getName(), i.getMayTinh().getMau().getColor(), i.getMayTinh().getKieu().getKieu(), i.getMayTinh().getGia(), i.getSoLuongMua(), i.getMayTinh().getMoney(i.getSoLuongMua())));
        }
    }

    @Override
    public void outPut() {
        String filename = "src/Data/HoaDon.txt";
        try {
            Formatter f = new Formatter(filename);
            for (HoaDon x : listHoaDon) {
                f.format("\n%5s %25s", "ID", "Tên khách hàng");
                f.format("\n%5d %25s", x.getId(), x.getKhachHang().getName());
                f.format("\n%10s %10s %10s %10s %15s %11s", "Tên Máy", "Màu", "Kiểu", "Đơn giá", "Số lượng mua", "Thành tiền");
                f.format("\n%10s %10s %10s %10s %15s %11s", x.getMayTinh().getName(), x.getMayTinh().getMau().getColor(), x.getMayTinh().getKieu().getKieu(), x.getMayTinh().getGia(), x.getSoLuongMua(), x.getMayTinh().getMoney(x.getSoLuongMua()));
                f.format("\n----------------------");
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

}
