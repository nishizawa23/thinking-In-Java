package holding;

import java.util.*;
import typeinfo.pets.*;

public class Exercise30 implements Collection<Pet> {
	private Pet[] pets = Pets.createArray(8);
	public void clear(){}
	public boolean contains(Object c){
		return true;
	}
	public boolean isEmpty(){
		return true;
	}

	public Object[] toArray(){
		return null;
	}

	public boolean add(){
		return true;
	}
	public int size(){
		return pets.length;
	}

	public boolean retainAll(Collection<?> c){
		return true;
	}

	public boolean removeAll(Collection<?> c){
		return true;
	}

	public boolean addAll(Collection<? extends Pet> c){
		return true;
	}

	public boolean containsAll(Collection<?> c){
		return true;
	}

	public boolean remove(Object o){
		return true;
	}

	public boolean add(Pet p){
		return true;
	}

	public <T>T[] toArray(T[] a){
		return null;	
	}

	public  Iterator<Pet> iterator (){

    		return new Iterator<Pet>() {
      			private int index = 0;
      			public boolean hasNext() {
        		return index < pets.length;
      		}
      		public Pet next() { return pets[index++]; }
      		public void remove() { // Not implemented
        		throw new UnsupportedOperationException();
      		}
    		};
	}

	public static void main(String[] args) {
		//Collection<Pet> mC = new Exercise30();
		Exercise30 mC = new Exercise30();
		Iterator<Pet> mI = mC.iterator();
		while(mI.hasNext()){
			Pet p = mI.next();
			System.out.println(p.id() + " : " + p + " ");
		}
		for(Pet p : mC)
			System.out.println(p.id() + " : " + p + " ");
		
	}
}
