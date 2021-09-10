import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		double avgScores[] = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt() - 1;
		int num2 = sc.nextInt() - 1;
		sc.close();
		System.out.printf("%.1f", avgScores[num1] + avgScores[num2]);
	}

}
