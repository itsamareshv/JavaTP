package assignment_problem;
import java.util.Iterator;
import java.util.Stack;

public class StringExpression {

	public static double cal(char x, double y, double z) {
		double res = 0;
		switch (x) {
		case '+':
			res = y + z;
			break;
		case '*':
			res = y * z;
			break;
		case '-':
			res = y - z;
			break;
		case '/':
			res = y / z;
			break;

		default:
			break;
		}
		return res;
	}

	public static void main(String[] args) {
		String str = "((2+1)*(3+4))";

		Stack<Double> ar = new Stack<Double>();
		Stack<Character> op = new Stack<Character>();
		

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ((c == '+') || ((c == '*')) || ((c == '/')) || ((c == '-'))) {
				op.push(c);
			}

			double m = Character.getNumericValue(c);

			if (m != -1) {
				ar.push(m);
			}

		}

		System.out.println("Operators" + op);

		System.out.println("Numbers" + ar);

		switch (ar.size()) {
		case 2:
			double fin = StringExpression.cal(op.pop(), ar.pop(), ar.pop());
			System.out.println("Sum = " + fin);
			break;
		case 4:
			double fin1 = StringExpression.cal(op.pop(), ar.pop(), ar.pop());
			double fin2 = StringExpression.cal(op.firstElement(), ar.pop(), ar.pop());
			double finalAns = StringExpression.cal(op.pop(), fin1, fin2);
			System.out.println("Result = " + finalAns);
			break;

		default:
			break;
		}

	}
}


