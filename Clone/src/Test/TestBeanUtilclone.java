package Test;

import Util.BeanUtil;
import other.User;
import Cloneable.Shallow;

public class TestBeanUtilclone {
	
	public static void main(String[] args) { 
		
		
		User user = new User();
		user.name = "user"; 
		user.age = 20;
		
		Shallow shallow = new Shallow();
		shallow.user = user;
		shallow.balance = 1000;
		
		Shallow copy = (Shallow)BeanUtil.cloneTo(shallow);
		
		copy.balance = 500;
		
		
		System.out.println("copy.balance == shallow.balance should be false-------> "+(copy.balance == shallow.balance));
		System.out.println("copy.user == shallow.user  should be false-------> "+(copy.user == shallow.user));
		System.out.println("copy.user.name == shallow.user.name should be false-------> "+(copy.user.name == shallow.user.name));
	}
}
