package ex.j8.lambda.generic;

@FunctionalInterface
public interface GenericFunctionalI<T> {

	public T apply(T t);
	
}
