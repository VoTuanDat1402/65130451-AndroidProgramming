package com.example.baith8;

public class MonAn {
    private String Tenmonan;
    private double donGia;
    private String Mota;
    private int anhmminhhoa;

    public MonAn(String tenmonan, double donGia, String mota, int anhmminhhoa) {
        Tenmonan = tenmonan;
        this.donGia = donGia;
        Mota = mota;
        this.anhmminhhoa = anhmminhhoa;
    }

    public String getTenmonan() {
        return Tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        Tenmonan = tenmonan;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public int getAnhmminhhoa() {
        return anhmminhhoa;
    }

    public void setAnhmminhhoa(int anhmminhhoa) {
        this.anhmminhhoa = anhmminhhoa;
    }
}
