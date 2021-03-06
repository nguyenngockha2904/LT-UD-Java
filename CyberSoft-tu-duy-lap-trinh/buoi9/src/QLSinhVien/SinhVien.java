/**
 * lớp SInh viên: mã,họ tên, điểm toán ,lý ,hoá 
 * @author kha_ng
 * ngày tạo : 05-05-2929
 * phiên bản :1.0
 * cập nhật:....
 * 
 */
package QLSinhVien;

import java.util.Scanner;

public class SinhVien {
	//attribute
	private String ten ;
	private String maSV;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	//constructors
	public SinhVien() {
		this.ten="";
		this.maSV="";
		this.diemToan=0;
		this.diemLy=0;
		this.diemHoa=0;
	}
	
	public SinhVien(String ten, String maSV, double diemToan, double diemLy, double diemHoa) {
		super();
		this.ten = ten;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	//get set methods
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}
	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}
	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	public String getTen() {
		return ten;
	}
	public String getMaSV() {
		return maSV;
	}
	public double getDiemToan() {
		return diemToan;
	}
	public double getDiemLy() {
		return diemLy;
	}
	public double getDiemHoa() {
		return diemHoa;
	}

	
	//methods
	public void nhap() {
		Scanner sn=new Scanner(System.in);
		System.out.println("nhập họ tên : ");
		this.ten=sn.nextLine();
		System.out.println("nhập mã Sinh Viên :");
		this.maSV=sn.nextLine();
		System.out.println("nhập điểm Toán :");
		this.diemToan=Double.parseDouble(sn.nextLine());
		System.out.println("nhập điểm Lý :");
		this.diemLy=Double.parseDouble(sn.nextLine());
		System.out.println("nhập điểm Hoá :");
		this.diemHoa=Double.parseDouble(sn.nextLine());
	}
	public void xuat() {
		System.out.println("họ tên :"+this.ten);
		System.out.println("Mã Sv : "+this.maSV);
		System.out.println("điểm toán : "+this.diemToan);
		System.out.println("điểm lý : "+this.diemLy);
		System.out.println("điểm Hoa : "+this.diemHoa);
		System.out.println("điểm TB : "+diemtb());
	}
	public double diemtb() {
		double dtb=(this.diemToan+this.diemLy+this.diemHoa)/3;
	
		return (double) Math.round(dtb * 100) / 100;
	}
	public String xepLoai() {
		String loai=null;
		double dtb=diemtb();
		if(dtb<5) {
			loai="yếu";
		}else if (dtb>=5&& dtb<7) {
			loai="tb";
		
		}else if (dtb>=7 && dtb<8) {
			loai= "khá";
		}else if (dtb>=8) {
			loai="giỏi";
		}
		return loai;
	}
	
}
