package service.impl;

import DTO.Kieu;
import DTO.Mau;
import DTO.MayTinh;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

import service.IMayTinh;

public class MayTinhService implements IMayTinh {

    LinkedList<MayTinh> listMayTinh = new LinkedList<>();

    @Override
    public LinkedList<MayTinh> getAll() {
        return listMayTinh;
    }

    @Override
    public void showAll(LinkedList<MayTinh> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("Danh sách sản phẩm hiện có: ");
        System.out.println("-----------------------------");
        System.out.println(String.format("%3s %10s %10s %10s %10s", "ID", "Tên máy", "Màu", "Kiểu", "Giá"));
        for (MayTinh i : list) {
            System.out.println(String.format("%3d %10s %10s %10s %10s", i.getId(), i.getName(), i.getMau().getColor(), i.getKieu().getKieu(), i.getGia()));
        }

    }

    @Override
    public void insert(Scanner sc) {
        System.out.println("Nhập ID: ");
        Long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Nhập tên máy: ");
        String name = sc.nextLine();
        System.out.println("Nhập màu: ");
        String mau = sc.nextLine();
        System.out.println("Nhập kiểu: ");
        String kieu = sc.nextLine();
        System.out.println("Nhập giá: ");
        double gia = sc.nextDouble();
        sc.nextLine();
        boolean check = true;
        while (check) {
            check = false;
            for (MayTinh i : listMayTinh) {
                if (Objects.equals(i.getId(), id)) {
                    System.out.println("ID đã tồn tại. Vui lòng nhập lại!");
                    id = sc.nextLong();
                    check = true;
                }
            }
        }
        MayTinh x = new MayTinh(id, name, new Mau(mau), new Kieu(kieu), gia);
        listMayTinh.add(x);
        System.out.println("Thêm thành công!");
        System.out.println("-----------------");
    }

    @Override
    public MayTinh find(String tenMay, String mau, String kieu) {
        for (MayTinh i : listMayTinh) {
            if (i.getName().equalsIgnoreCase(tenMay) && i.getMau().getColor().equalsIgnoreCase(mau) && i.getKieu().getKieu().equalsIgnoreCase(kieu)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public void outPut() {
        String filename = "src/Data/MayTinh.txt";
        try {
            Formatter f = new Formatter(filename);
            f.format("%3s %10s %10s %10s %10s", "ID", "Tên máy", "Màu", "Kiểu", "Giá");
            for (MayTinh x : listMayTinh) {
                f.format("\n%3d %10s %10s %10s %10s", x.getId(), x.getName(), x.getMau().getColor(), x.getKieu().getKieu(), x.getGia());
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

}
