/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Hieuu
 */
public class MayTinh{

    private Long id;
    private String name;
    private Mau mau;
    private Kieu kieu;
    private double gia;

    public MayTinh() {
    }

    public MayTinh(Long id, String name, Mau mau, Kieu kieu, double gia) {
        this.id = id;
        this.name = name;
        this.mau = mau;
        this.kieu = kieu;
        this.gia = gia;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mau getMau() {
        return mau;
    }

    public void setMau(Mau mau) {
        this.mau = mau;
    }

    public Kieu getKieu() {
        return kieu;
    }

    public void setKieu(Kieu kieu) {
        this.kieu = kieu;
    }

    public double getGia() {
        return gia;
    }

    public double getMoney(int sl){
        return this.gia * sl;
    }
}
