package ex.j8.lambda.simple;

public class MainWithJava7 {

	public static void main(String[] args) {

		FuntionalInterface mFI_ADD_Func = new FuntionalInterface() {
			@Override
			public int arithmeticOp(int a) {
				return a + a;
			}
		};

		System.out.println("Java7 impl - Add the value : " + mFI_ADD_Func.arithmeticOp(4));

		FuntionalInterface mFI_MUL_Func = new FuntionalInterface() {
			@Override
			public int arithmeticOp(int a) {
				return a * a;
			}
		};

		System.out.println("Java7 impl - Multiply the value : " + mFI_MUL_Func.arithmeticOp(4));

		FuntionalInterface divideWithPrint_Func = new FuntionalInterface() {
			@Override
			public int arithmeticOp(int a) {
				System.out.println("Java7 impl - Divide the value From lambda :");
				return a / a;
			}
		};
		System.out.println(" --> " + divideWithPrint_Func.arithmeticOp(4));

	}

}
