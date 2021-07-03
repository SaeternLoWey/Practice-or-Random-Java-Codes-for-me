
public class breakexample {

	public static void main(String[] args) {

		for (int j = 0; j <= 100; j++) {

			for (int i = 0; i <= 10; i++) {

				if (i == 8) {
					System.out.println("now breaking out of loop i");
					break;
				}
				System.out.println(i);
			}
			
			
			if(j >= 80) {
				System.out.println("breaking out of the loop j");
				break;
			}
			System.out.println("value of j is : " + j);

		}

	}

}
