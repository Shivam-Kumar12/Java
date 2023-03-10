// Q – 1: Design a class Complex having a real part (x) and an imaginary part (y). Provide methods to perform the following on complex numbers:
// a) Add two complex numbers.
// b) Multiply two complex numbers.
// c) toString() method to display complex numbers in the form: x + iy.


// Source Code:-
public class Complex {
   int real;
   int imaginary;

   public Complex(int real, int imaginary) {
      this.real = real;
      this.imaginary = imaginary;
   }

   // @Override
   public String toString() {
      return real + "+" + imaginary + "i";
   }

   public static void main(String[] args) {
      Complex n1 = new Complex(7, 2),
            n2 = new Complex(6, 1),
            temp1,
            temp;

      temp = add(n1, n2);
      temp1 = mul(n1, n2);
      System.out.printf("The sum of two complex numbers is %d + %di", temp.real,
            temp.imaginary);
      System.out.printf("\nThe multiply of two complex numbers is %d + %di", temp1.real,
            temp1.imaginary);
      System.out.printf("\nComplex Number is:" + n1);
      System.out.printf("\nComplex Number is:" + n2);
   }

   public static Complex add(Complex n1, Complex n2) {
      Complex temp = new Complex(0, 0);
      temp.real = n1.real + n2.real;

      temp.imaginary = n1.imaginary + n2.imaginary;
      return (temp);
   }

   public static Complex mul(Complex t1, Complex t2) {

      Complex temp3 = new Complex((t1.real * t2.real) - (t1.imaginary * t2.imaginary),
            (t1.real * t2.imaginary) + (t2.real * t1.imaginary));
      return (temp3);
   }
}
