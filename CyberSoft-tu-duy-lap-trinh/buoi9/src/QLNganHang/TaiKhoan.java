/**
 * lớp tài khoản gồm số tài khoản, tên tài khoản ,số tiền trong tài khoản
 * @author kha_ng
 * ngày tạo : 6-5-2020
 * phiên bản :
 */

package QLNganHang;

import java.util.Scanner;

public class TaiKhoan {
	// attributes
	private String soTK;
	private String tenTK;
	private double soTienTK;

	// constructors
	public TaiKhoan() {

	}

	public TaiKhoan(String soTK, String tenTK, double soTienTK) {
		super();
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soTienTK = soTienTK;
	}

	// get set methods
	public String getSoTK() {
		return soTK;
	}

	public void setSoTK(String soTK) {
		this.soTK = soTK;
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}

	public double getSoTienTK() {
		return soTienTK;
	}

	public void setSoTienTK(double soTienTK) {
		this.soTienTK = soTienTK;
	}

	// methods
	public void nhap() {
		Scanner sn = new Scanner(System.in);
		System.out.println("nhập số tài khoản : ");
		this.soTK = sn.nextLine();
		System.out.println("nhập tên tài khoản : ");
		this.tenTK = sn.nextLine();
		System.out.println("nhập số tiền trong tài khoản : ");
		this.soTienTK = sn.nextDouble();

	}

	public void xuat() {
		System.out.println("số tài khoản : " + this.soTK);
		System.out.println("tên tài khoản : " + this.tenTK);
		System.out.println("số tiền trong tài khoản : " + this.soTienTK);
	}

	private boolean kiemtraSoDu(double so) {
		boolean kq = false;
		if (this.soTienTK < 0 || so > this.soTienTK) {
			kq = false;
		} else {
			kq = true;
		}

		return kq;
	}

	public void napTien(double soTienNapVao) {
		this.soTienTK = this.soTienTK + soTienNapVao;
	}

	public boolean rutTien(double soTienRut) {
		boolean kq=false;
		double thue = 1100;
		if (kiemtraSoDu(soTienRut)) {
			this.soTienTK = this.soTienTK - (soTienRut + thue);
			System.out.println("rút thành công ");
			System.out.println("thuế :"+ thue);
			System.out.println("-----------------------------");
			kq=true;
		} else {
			System.out.println("số tiền rút không khả dụng");
		}
		return kq;
	}

	public boolean chuyenKhoan(TaiKhoan tkchuyen, double soTienChuyen) {
		boolean kq=false;
		double thue = 1100;
		if (kiemtraSoDu(soTienChuyen)) {
			this.soTienTK = this.soTienTK - (soTienChuyen + thue);
			tkchuyen.napTien(soTienChuyen);
			System.out.println();
			System.out.println("chuyển khoản thành công ");
			System.out.println("thuế : "+ thue);
			System.out.println("-----------------------------");
			kq=true;
		} else {
			System.out.println();
			System.out.println("số tiền chuyển không khả dụng ");
		}
	 return kq;
	}
}
