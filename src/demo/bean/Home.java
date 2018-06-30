package demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Home {
	private String address;
	
	public Home() {
		System.out.println("call home constructor now!");
	}

	public String getAddress() {
		if (address == null) {
			return "";
		}
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "home:" + getAddress();
	}
}
