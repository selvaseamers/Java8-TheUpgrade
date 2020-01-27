package ex.j8.lambda.function.as.param;

@FunctionalInterface
public interface FunctionI<T> {

	public T apply(T t);
	
}
