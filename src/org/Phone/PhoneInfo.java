package org.Phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("phonename: "+ "oppo");
	}
	private void phoneMieiNum() {
		System.out.println("mieinumber: "+"123456");
	}
	private void camera() {
		System.out.println("camera: "+ "12mpixel");
	}
	private void storage() {
		System.out.println("storage: "+ "512gb");
	}
	private void osName() {
		System.out.println("OSname: "+"andriod");
	}
//<<<<<<< HEAD
	private void osname1() {
	System.out.println("osname1 : "+"mac");
	}
//=======
	private void osName1() {
		System.out.println("OSname1: "+"mac");
	}
	
//>>>>>>> e7812e95792104c12eee384992f70a0e1d9129ef
public static void main(String[] args) {
	PhoneInfo gg= new PhoneInfo();
	gg.phoneName();
	gg.phoneMieiNum();
	gg.camera();
	gg.storage();
	gg.osName();
	gg.osName1();
	
}

}
