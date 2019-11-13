import java.util.*;
import java.util.function.*;

public class Test{


	<T,U,V> Function<T,V> compF(Function<T,U> f,Function<U,V> g){
		Function<T,V> res= t -> g.apply(f.apply(t));
		return res;
	}


	public static void main(String...args){
		System.out.println("Simple-Main!");

		BiFunction<Function<Integer,Integer>,Function<Integer,Integer>,Function<Integer,Integer>> comp = (f,g)	-> (t -> g.apply(f.apply(t)) );
	


		Function<Integer,Integer> f1 = t->2*t;
		Function<Integer,Integer> f2 = t->t+1;
		Function<Integer,Integer> f3 = comp.apply(f1,f2);

		System.out.println(f3.apply(17));
	}
}