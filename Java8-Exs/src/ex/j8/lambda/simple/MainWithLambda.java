package ex.j8.lambda.simple;

public class MainWithLambda {
	
	static int b = 4;

	public static void main(String[] args) {
		
		int c = 2;

		FuntionalInterface mFI_ADD = (a) -> a + b + c;
		
		System.out.println("Add the value : " + mFI_ADD.arithmeticOp(4));
		
		FuntionalInterface mFI_MUL = (a) -> a * a;
		
		System.out.println("Multiply the value : " + mFI_MUL.arithmeticOp(4));

		FuntionalInterface divideWithPrint = (a) -> {
			System.out.println("Divide the value From lambda :");
			return a / b + c;
		};
		System.out.println(" --> " + divideWithPrint.arithmeticOp(4));
		
	}

}
