package ex.j8.lambda.simple;

public class MainWithLambda {

	public static void main(String[] args) {

		FuntionalInterface mFI_ADD_Func = (a) -> a + a; // function as data

		System.out.println("Add the value : " + mFI_ADD_Func.arithmeticOp(4));

		FuntionalInterface mFI_MUL_Func = (a) -> a * a;

		System.out.println("Multiply the value : " + mFI_MUL_Func.arithmeticOp(4));

		FuntionalInterface divideWithPrint_Func = (a) -> {
			System.out.println("Divide the value From lambda :");
			return a / a;
		};
		System.out.println(" --> " + divideWithPrint_Func.arithmeticOp(4));

	}

}
