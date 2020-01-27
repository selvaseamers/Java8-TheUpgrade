package ex.j8.lambda.generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainWithGeneric {

	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("cosmos", "nebula", "pulsar", "black hole", "quantum entanglement", "dark matter");
		int a = 4;
		
		//using functional interface to to do arithmetic op
		GenericFunctionalI<Integer> arithMeticFunc = (b) -> b * b;
		//using functional interface to to do sort the list
		GenericFunctionalI<List<String>> sortFunc = (sortList) -> {
			Collections.sort(sortList);
			return sortList;
		};
		
		System.out.println("Do arithmetic Op : "+arithMeticFunc.apply(a));
		System.out.println("Before sort : "+ name);
		System.out.println("After sort functional applied : "+sortFunc.apply(name));
		
	}

}
