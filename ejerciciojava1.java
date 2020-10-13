public class TresNumeros{
	public static void main(String args[]){
		int num1, num2, num3, max, min;
		num1 = opcion.nextInt();
		num2 = opcion.nextInt();
		num3 = opcion.nextInt();
		max = num1;
		min = num1;

		if (num1>=max) {
			max=num1;
		}
		if (num2>=max) {
			max=num2;
		}
		if (num3>=max) {
			max=num3
		}
		if (num1<=min) {
			min=num1;
		}
		if (num2<=min) {
			min=num2;
		}
		if (num3<=min) {
			min=num3
		}
		if (min!=max) {
			System.out.println("El mayor es "+max)
			System.out.println("El menor es "+min)
		}
		else{
			System.out.println("Son iguales")
		}
	}
}