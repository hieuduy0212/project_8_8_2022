/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Hieuu
 */
public class HoaDon {

    private KhachHang khachHang;
    private MayTinh mayTinh;
    private Date ngayMua;
    private int soLuongMua, id;
    private static int soLuong = 0;

    public HoaDon() {
    }

    public HoaDon(KhachHang khachHang, MayTinh mayTinh, Date ngayMua, int soLuongMua) {
        HoaDon.soLuong++;
        this.khachHang = khachHang;
        this.mayTinh = mayTinh;
        this.ngayMua = ngayMua;
        this.soLuongMua = soLuongMua;
        this.id = HoaDon.soLuong;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public MayTinh getMayTinh() {
        return mayTinh;
    }

    public void setMayTinh(MayTinh mayTinh) {
        this.mayTinh = mayTinh;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public static int getSoLuong() {
        return soLuong;
    }

    public static void setSoLuong(int soLuong) {
        HoaDon.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
