package Test;

import Cloneable.Deep;
import Cloneable.Shallow;
import other.User;

public class TestShallowClone {
	public static void main(String[] args) {  
	 
		User user = new User(); 
		user.name = "user"; 
		user.age = 20;
		
		Shallow shallow = new Shallow();
		shallow.user = user;
		shallow.balance = 1000;
		Shallow copy = null;
		try {
			copy = (Shallow)shallow.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		copy.balance = 500;
		copy.user.name = "cccc";
		
		System.out.println(shallow.user.name);
		
		System.out.println("copy.balance == shallow.balance should be false-------> "+(copy.balance == shallow.balance));
		System.out.println("copy.user == shallow.user  should be true-------> "+(copy.user == shallow.user));
		System.out.println("copy.user.name == shallow.user.name should be true-------> "+(copy.user.name == shallow.user.name));
		
		
		User usercopy = null;
		try {
			usercopy = (User)user.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		usercopy.name = "lalalalal";
		System.out.println(user.name);
		System.out.println("usercopy.name == user.name should be false-------> "+(usercopy.name == user.name));
		System.out.println("usercopy.name.equals(user.name) should be false-------> "+(usercopy.name.equals(user.name)));
		
	}  
}
