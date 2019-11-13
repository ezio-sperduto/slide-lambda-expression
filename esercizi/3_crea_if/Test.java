import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class Rettangolo{
	int b,h;

	Rettangolo(int x,int y){
		b=x;h=y;
	}

	@Override
	public String toString(){
		return b+" "+h;
	}
}

public class Test{
	static void applicaFiltro(List<Rettangolo> l,Filtro f){
		for(Rettangolo r:l)
			if(f.verifica(r))
				l.remove(r);
	}


	public static void main(String...args){
		System.out.println("Simple-Main!");

		List<Rettangolo> lista=new CopyOnWriteArrayList<>(Arrays.asList(
			new Rettangolo(1,1),
			new Rettangolo(1,2),
			new Rettangolo(3,4),
			new Rettangolo(3,3),
			new Rettangolo(5,6)
			));	


		//applicaFiltro(lista,r-> r.b * r.h > 6);
		applicaFiltro(lista,r-> r.b >= 5);
		
		lista.forEach(System.out::println);		
	}
}





