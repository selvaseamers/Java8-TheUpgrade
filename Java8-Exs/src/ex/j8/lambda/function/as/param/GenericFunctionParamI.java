package ex.j8.lambda.function.as.param;

public interface GenericFunctionParamI<T> {
	
	public T applyFunc(FunctionI<T> f, T t);

}
