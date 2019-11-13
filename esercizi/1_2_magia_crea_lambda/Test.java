interface Magia{
	int calcola(int a,int b,int c);
}


interface Manipolatore<T>{
	T trasforma(int x);
}


class Test{
	void caller(Magia m){
		System.out.println("invocato caller Magia");
	}

	void caller(Manipolatore<String> m){
		System.out.println("invocato caller Manipolatore");
	}

	public static void main(String...aa){
		Test t=new Test();
		t.caller((x,y,z)->x+y+z);
		t.caller(val-> val + "ciao");
	}
}