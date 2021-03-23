package lambda;

public class Main {
	public static void main(String[] args) {

		Function f = (x,y)-> {int sum = 0;
						  		 	for(int i:x){ sum += (int)(i*y); };
						  		 	return sum;};

		int[] array = {100,200,360,430};
		double tax = 1.08;

		System.out.println(f.total(array, tax));
	}
}
