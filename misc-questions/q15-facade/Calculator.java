public class Calculator {


	public double add(double a, double b) {

		//START YOUR CODE
        Addition add = new Addition(a, b);
        return add.evaluate();
		//END YOUR CODE
	}

	public double subtract(double a, double b) {

		//START YOUR CODE
        Subtraction subtract= new Subtraction(a, b);
        return subtract.evaluate();
		//END YOUR CODE
	}

	public double multiply(double a, double b) {

		//START YOUR CODE
        Multiplication multiply = new Multiplication(a, b);
        return multiply.evaluate();
		//END YOUR CODE
	}

	public double divide(double a, double b) {

		//START YOUR CODE
        Division divide = new Division(a, b);
        return divide.evaluate();
		//END YOUR CODE

    }
}
