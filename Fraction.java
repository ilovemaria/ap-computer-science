public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction() {
		numerator = 2;
		denominator = 3;
	}

	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}

	public void otString() {
		System.out.println("The fraction is "+numerator+"/"+denominator);
	}

 
	public Fraction add(Fraction other) {
		if (this.denominator == other.denominator) {
			return new Fraction(this.numerator + other.numerator, this.denominator );
		}
		else {
			return new Fraction(this.numerator * other.denominator + other.numerator*this.denominator, this.denominator*other.denominator);
		}
		
		 
	}

  /*
    Create a multiply method for fractions
  */
 
	public Fraction mult(Fraction other) {
		return new Fraction(this.numerator*other.numerator, this.denominator*other.denominator);
	}

  /*
    Challenge : create a simplify method
  */
/*	public Fraction simp(Fraction other) {
		while(numerator %2 ==0 && denominator %2 ==0) {
			numerator /= 2 ; 
			denominator /= 2 ;
		}
		while (this.numerator %3 ==0 && this.denominator %3 ==0) {
			this.numerator /= 3 ; 
			this.denominator /= 3 ;
		}
		while (this.numerator %5 ==0 && this.denominator %5 ==0)  {
			this.numerator /= 5 ; 
			this.denominator /= 5 ;
		}
		while (this.numerator %7 ==0 && this.denominator %7 ==0) {
			this.numerator /= 7 ;  
			this.denominator /= 7 ;
		}
		return new Fraction(numerator, denominator);
	}
 */
}
