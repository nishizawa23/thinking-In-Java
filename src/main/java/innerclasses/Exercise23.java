package innerclasses;

import java.util.*;

interface U {
	void one();
	void two();
	void three();
}

class A {
	U getU(){
		return new U(){

			public void one(){
				System.out.println("i am one");
			}

			public void two(){
				System.out.println("i am two");
			}

			public void three(){
				System.out.println("i am three");
			}
		};
	}
}

class B {

	int i = 0;

	U [] mListU;

	B(){
		mListU = new U[10];
	}

	void addU( U u ){
		if( i<10 ){
			mListU[i] = u;
			i ++;
		}else{
			System.out.println("List full!");
		}
	}

	void delU(){
		if( i >= 0){
			System.out.println("del u!");
			i --;
			mListU[i] = null;
		}else{
			System.out.println("List zero!");
		}
	}

	void go(){
		for(int j = 0; j < i; j++){
			mListU[j].one();
			mListU[j].two();
			mListU[j].three();
		}
	}
}

class Exercise23 {
	public static void main (String [] args)
	{
		/* code */
		B b = new B();
		for(int i = 0; i < 10; i++){
			b.addU(new A().getU());
		}

		b.go();

		for(int i = 0; i < 10; i++){
			b.delU();
		}
	}
}
