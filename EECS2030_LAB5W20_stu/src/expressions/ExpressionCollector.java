package expressions;

import java.util.ArrayList;
import java.util.List;

public class ExpressionCollector {
	 
	protected List<Expression> expressions;
	protected Object value;
	protected String defaultValue;
	 
	
	ExpressionCollector() {
		// COMPLETE THIS create an empty collection of expression
		 
	}
	
	/**
	 * Add a new expression.
	 * @param e an expression
	 */
	void addExpression(Expression e) {
		// COMPLETE THIS
	}
	
	/**
	 * Add a new expression.
	 * @param left integer value of the left operand 
	 * @param op operator (i.e., "+", "-", "*", ">", "<", "==")
	 * @param right integer value of the right operand
	 */
	void addExpression(int left, String op, int right) {
		// COMPLETE THIS
		// Hint: Depending on the operator given (e.g., +), create the corresponding expression object
		// (e.g., Addition) and add it to the collector.
		 
	}
	
	/**
	 * sub-routine that can be used to check if this is type correct
	 * true if e is one of the three classes, or their subclasses (if any)
	 * so use instanceof, instead of getClassName()
	 */
	private boolean isArithmetic(Expression e) {
		return 
				e instanceof Addition 
			||	e instanceof Subtraction
			|| 	e instanceof Multiplication;
	}
	
	/**
	 * sub-routine that can be used to check if this is type correct
	 * true if e is one of the three classes, or their subclasses (if any)
	 */
	private boolean isRelation(Expression e) {
		return 
				e instanceof Equal 
			||	e instanceof GreaterThan
			|| 	e instanceof LessThan;
	}
	
	/**
	 * If this collector is AddAll or TimesAll, then all stored expressions must be integer expressions
	 * (i.e., Addition, Subtraction, Multiplication).
	 * If this collection is ConjoinAll or DisjoinAll, then all stored expressions must be boolean expressions
	 * (i.e., GreaterThan, LessThan, Equal)
	 * @return whether it is possible to evaluate the stored collection of expressions.   
	 */
	boolean isTypeCorrect() {
		// COMPLETE THIS
	}
	
	/**
	 * Get the result of the latest evaluation (i.e., after the latest call to `evaluate()`).
	 * @return the last evaluation result.
	 */
	Object getValue() {
		// COMPLETE THIS
	}
	
	/**
	 * Obtain the list of stored expressions, as an array.
	 * @return all stored expressions as an array
	 */
	Expression[] getExpressions() {
		// COMPLETE THIS
	}
	
	/**
	 * Given that this expression collector is type correct (see `isTypeCorrect()`),
	 * evaluate it. Store the evaluation result so that it can be returned by `getValue()`. 
	 */
	void evaluate() {
		// Hint: Leave this empty and override it in all subclasses such as Addition, GreaterThan.
	}
	
	/**
	 * Override the equals method. Two expression collectors are equals if:
	 * 1) They are both type correct 2) Their evaluation results are identical
	 * @return whether or not the two expression collectors are equal.
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		ExpressionCollector other = (ExpressionCollector) obj;
		if(this.isTypeCorrect() && other.isTypeCorrect()) {
			// COMPLETE THIS
		}
		else {
			// COMPLETE THIS
		}
			 
	}
	
	
}
