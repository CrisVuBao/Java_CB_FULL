
package qlsinhvien;

import java.util.ArrayList;

public class SinhVienList {
    private ArrayList<SinhVien> sinhVienList;

    public SinhVienList() {
        sinhVienList = new ArrayList<>();
    }

    public SinhVienList(ArrayList<SinhVien> sinhVienList) {
        this.sinhVienList = sinhVienList;
    }

    public ArrayList<SinhVien> getSinhVienList() {
        return sinhVienList;
    }

    public void setSinhVienList(ArrayList<SinhVien> sinhVienList) {
        this.sinhVienList = sinhVienList;
    }
    
    
    // Method
    // Đọc danh sách sv từ tập tin
    public void DocDanhSachSinhVien() {
        sinhVienList.clear(); // Xóa tất cả các phần từ trong ArrayList
        ArrayList<String> chuoi_DS_SV = DocGhiFile.docFile("data/sinhvien.txt");
        for(String chuoiSV : chuoi_DS_SV) { // chuoiSV trong chuoi_DS_SV
            String[] mangChuoi = chuoiSV.split(";");
            sinhVienList.add(new SinhVien(mangChuoi[0], mangChuoi[1], Integer.valueOf(mangChuoi[2])));
        }
    }
    
    public int TongSoSinhVien() {
        return sinhVienList.size();
    }
    
    public SinhVien getSinhVien(int chiSo) {
        SinhVien sv = null;
        if(chiSo >= 0 && chiSo < TongSoSinhVien()) {
            sv = sinhVienList.get(chiSo);
        }
        return sv;
    }
    
    public boolean addSinhVien(SinhVien sv) {
        if(sinhVienList.contains(sv)) {
            return false;
        }
        
        sinhVienList.add(sv);
        ghiDanhSach();
        // Ghi sinh vien vừa thêm vào tập tin
        return true;
    }
    
    public boolean delSinhVien(SinhVien sv) {
        sinhVienList.remove(sv);
        // Cập nhật lại tập tin
        ghiDanhSach();
        return true;
    }
    
    public boolean updateSinhVien(SinhVien sv) {
        // Lấy sinh vien cần sửa trong SinhVienList
        int viTri = sinhVienList.indexOf(sv);
        sinhVienList.set(viTri, sv); // 
        return true;
    }
    
    private void ghiDanhSach() {
        DocGhiFile.ghiFile(sinhVienList, "data/sinhvien.txt");
    }

    
    
}
