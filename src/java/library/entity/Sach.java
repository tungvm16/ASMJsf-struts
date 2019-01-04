/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.entity;

/**
 *
 * @author T-ash
 */
public class Sach {
    private int MaSach;
    private int MaLoai;
    private String TenSach;
    private String TomTat;
    private int MaTg;
    private int MaNxb;
    private String TenLoai;
    private String TenNxb;
    private String DiaChiNxb;
    private int SDTNxb;
    private String EmailNxb;
    private String TenTg;
    private String DiaChiTg;
    private int SDTTg;
    private String EmailTg;

    public Sach(int MaSach, int MaLoai, String TenSach, String TomTat, int MaTg, int MaNxb, String TenLoai, String TenNxb, String DiaChiNxb, int SDTNxb, String EmailNxb, String TenTg, String DiaChiTg, int SDTTg, String EmailTg) {
        this.MaSach = MaSach;
        this.MaLoai = MaLoai;
        this.TenSach = TenSach;
        this.TomTat = TomTat;
        this.MaTg = MaTg;
        this.MaNxb = MaNxb;
        this.TenLoai = TenLoai;
        this.TenNxb = TenNxb;
        this.DiaChiNxb = DiaChiNxb;
        this.SDTNxb = SDTNxb;
        this.EmailNxb = EmailNxb;
        this.TenTg = TenTg;
        this.DiaChiTg = DiaChiTg;
        this.SDTTg = SDTTg;
        this.EmailTg = EmailTg;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public int getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(int MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getTomTat() {
        return TomTat;
    }

    public void setTomTat(String TomTat) {
        this.TomTat = TomTat;
    }

    public int getMaTg() {
        return MaTg;
    }

    public void setMaTg(int MaTg) {
        this.MaTg = MaTg;
    }

    public int getMaNxb() {
        return MaNxb;
    }

    public void setMaNxb(int MaNxb) {
        this.MaNxb = MaNxb;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public String getTenNxb() {
        return TenNxb;
    }

    public void setTenNxb(String TenNxb) {
        this.TenNxb = TenNxb;
    }

    public String getDiaChiNxb() {
        return DiaChiNxb;
    }

    public void setDiaChiNxb(String DiaChiNxb) {
        this.DiaChiNxb = DiaChiNxb;
    }

    public int getSDTNxb() {
        return SDTNxb;
    }

    public void setSDTNxb(int SDTNxb) {
        this.SDTNxb = SDTNxb;
    }

    public String getEmailNxb() {
        return EmailNxb;
    }

    public void setEmailNxb(String EmailNxb) {
        this.EmailNxb = EmailNxb;
    }

    public String getTenTg() {
        return TenTg;
    }

    public void setTenTg(String TenTg) {
        this.TenTg = TenTg;
    }

    public String getDiaChiTg() {
        return DiaChiTg;
    }

    public void setDiaChiTg(String DiaChiTg) {
        this.DiaChiTg = DiaChiTg;
    }

    public int getSDTTg() {
        return SDTTg;
    }

    public void setSDTTg(int SDTTg) {
        this.SDTTg = SDTTg;
    }

    public String getEmailTg() {
        return EmailTg;
    }

    public void setEmailTg(String EmailTg) {
        this.EmailTg = EmailTg;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Sach)){
            return false;
        }
        Sach other =(Sach) obj;
        return this.MaSach == other.MaSach;
    }
    
    
}