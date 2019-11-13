import java.util.*;
import java.util.function.*;
public class Test{
	public static void main(String...args){

		Test t=new Test();

		Predicate<Integer> maggioriCento = i -> i>100;
		Predicate<Integer> negativi = i -> i<0;

		List<Integer> l = Arrays.asList(2,-1,120,130,-99,60);
		List<Integer> res;

		res=t.filtraConPredicato(l,maggioriCento);
		t.stampa(res);

		res=t.filtraConPredicato(l,negativi);
		t.stampa(res);


	}


	void stampa(List<?> l){
		l.forEach(System.out::println);
		System.out.println();
	}

	List<Integer> filtraConPredicato(List<Integer> s,Predicate<Integer> p){
		List<Integer> res=new ArrayList<>();
		for(Integer i:s)
			if(p.test(i))
				res.add(i);
		
		return res;
	}
}