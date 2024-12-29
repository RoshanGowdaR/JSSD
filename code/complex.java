class Complex {
private double real;
private double imaginary;
// Constructor to initialize complex number
public Complex(double real, double imaginary) {
this.real = real;
this.imaginary = imaginary;
}
// Method to add two complex numbers
public Complex add(Complex other) {
double newReal = this.real + other.real;
double newImaginary = this.imaginary + other.imaginary;
return new Complex(newReal, newImaginary);
}
// Method to subtract two complex numbers
public Complex subtract(Complex other) {
double newReal = this.real - other.real;
double newImaginary = this.imaginary - other.imaginary;
return new Complex(newReal, newImaginary);
}
// Method to display the complex number
public void display() {
if (imaginary >= 0) {
System.out.println(real + " + " + imaginary + "i");
} else {
System.out.println(real + " - " + Math.abs(imaginary) + "i");
}
}
// Main method to test the Complex class
public static void main(String[] args) {
Complex num1 = new Complex(3, 2); // 3 + 2i
Complex num2 = new Complex(1, 7); // 1 + 7i
System.out.print("Number 1: ");
num1.display();
System.out.print("Number 2: ");
num2.display();
Complex sum = num1.add(num2);
System.out.print("Sum: ");
sum.display();
Complex difference = num1.subtract(num2);
System.out.print("Difference: ");
difference.display();
}
}
