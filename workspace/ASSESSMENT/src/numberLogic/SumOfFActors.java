package numberLogic;

public class SumOfFActors {
public static void main(String[] args) {
	int num = 90;
	int sum=0;
	for (int i = 1; i <= num/2; i++) {
		if(num%i==0){
			sum=sum+i;
		}
	}
	System.out.println(sum+" is sum of factors of given number");
}
}
