package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	Object [] objects = new Object [0];
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return (T) objects[loc];
	}
	
	public void add(T val) {
		Object [] objects2 = new Object [objects.length+1];
		objects2[objects2.length-1] = val;
		for (int i = 0; i < objects.length; i++) {
			objects2[i] = objects[i];
		}
		objects = objects2;
		 
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		Object [] objects2 = new Object [objects.length+1];
		 for (int i = loc; i < objects2.length-1; i++) {
			objects2[i+1] = objects[i];
		}
		 objects2[loc] = val;
		 for (int i = 0; i < loc; i++) {
			 objects2[i] = objects[i];
		}
		 objects = objects2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		objects[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		Object [] objects2 = new Object [objects.length-1];
		for (int i = 0; i < objects2.length; i++) {
			if(i < loc) {
				objects2[i] = objects[i];
			}
			else if(i>=loc ) {
				objects2[i] = objects[i+1];
			}
		}
		objects = objects2;
	}
	
	
	public boolean contains(T val) {
		for (int i = 0; i < objects.length; i++) {
			if(objects[i] == val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return objects.length;
	}
}




