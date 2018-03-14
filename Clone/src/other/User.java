package other;

import java.io.Serializable;

public class User implements Cloneable,Serializable{
	public String name;
    public int age;
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
