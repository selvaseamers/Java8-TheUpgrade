package ex.j8.lambda.function.as.param;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainWithFunctionParam {

	public static void main(String[] args) {

		List<String> name = Arrays.asList("cosmos", "nebula", "pulsar", "black hole", "quantum entanglement", "dark matter");
		
		FunctionI< List<String>> sortFunc = (sortList) -> {
			Collections.sort(sortList);
			return sortList;
		};
		
		GenericFunctionParamI<List<String>> reverse = (function, list) -> {
			function.apply(list);
			Collections.reverse(list);
			return list;
		};
		
		System.out.println("Before sort : "+ name);
		System.out.println("After sort functional applied : "+reverse.applyFunc(sortFunc, name));
	}

}
