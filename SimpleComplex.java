package MyComplexNumber;

public class SimpleComplex {
	private float real;
	private float imaginary;
	SimpleComplex(){
		this.real = 0;
		this.imaginary = 0;
	}
	SimpleComplex(float re, float im){
		this.real = re;	
		this.imaginary = im;
	}
	void setReal(float re) {
		real = re;
	}
	float getReal() {
		return real;
	}
	void setImaginary(float im) {
		imaginary = im;
	}
	float getImaginary() {
		return imaginary;
	}
	float computeNorm() {
		return (float)Math.sqrt((real * real) + (imaginary * imaginary));
	}
	
}


