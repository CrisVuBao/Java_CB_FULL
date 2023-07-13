/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class nhaSanXuat {
    private String tenHangPhim;
    private String tenQuocGia;
    public String getTenHangPhim() {
        return tenHangPhim;
    }

    public void setTenHangPhim(String tenHangPhim) {
        this.tenHangPhim = tenHangPhim;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
    public nhaSanXuat(String tenHangPhim, String tenQuocGia) {
        this.tenHangPhim = tenHangPhim;
        this.tenQuocGia = tenHangPhim;
    }
}
