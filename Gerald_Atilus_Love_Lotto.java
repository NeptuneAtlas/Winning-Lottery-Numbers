import java.util.Random;
import javax.swing.JOptionPane;

public class Gerald_Atilus_Love_Lotto {
	

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Hello There User! ^_^" + " Here are the winning lotto numbers!" );
		
		Random fantasty_5 = new Random();  //not sure if objects were necessary but used them anyways
		Random fantasty_4 = new Random();
		Random fantasty_3 = new Random();
		Random fantasty_2 = new Random();
		Random fantasty_1 = new Random();
		Random Lotto_6 = new Random();
		Random Lotto_5 = new Random();
		Random Lotto_4 = new Random();
		Random Lotto_3 = new Random();
		Random Lotto_2 = new Random();
		Random Lotto_1 = new Random();


		int num, num2, num3, num4, num5, num6, num_1, num_2, num_3, num_4, num_5;
		num_1 = 1+fantasty_1.nextInt(36); //adding one to fantasty_1 prevents numbers from being 0
		num_2 = 1+fantasty_2.nextInt(36);
		num_3 = 1+fantasty_3.nextInt(36);
		num_4 = 1+fantasty_4.nextInt(36);
		num_5 = 1+fantasty_5.nextInt(36);
		System.out.println("Hello There User! ^_^");
		System.out.println("These are the winning lotto numbers:");
		System.out.println();
		System.out.println("Fantasy 5: "+"[" + num_1 +"," + " " + num_2 +"," + " " + num_3 +"," + " " + num_4+"," + " " + num_5 + "]");
		
		num = 1+Lotto_1.nextInt(53);
		num2 = 1+Lotto_2.nextInt(53);
		num3 = 1+Lotto_3.nextInt(53);
		num4 = 1+Lotto_4.nextInt(53);
		num5 = 1+Lotto_5.nextInt(53);
		num6 = 1+Lotto_6.nextInt(53);

		System.out.println("Lottery$: "+"[" + num +"," + " " + num2 +"," + " " + num3 +"," + " " + num4+"," + " " + num5 +"," + " " + num6 + "]" );	
		
		JOptionPane.showMessageDialog(null, "Fantasy 5: "+"[" + num_1 +"," + " " + num_2 +"," + " " + num_3 +"," + " " + num_4+"," + " " + num_5 + "]");
		JOptionPane.showMessageDialog(null, "Lottery$: "+"[" + num +"," + " " + num2 +"," + " " + num3 +"," + " " + num4+"," + " " + num5 +"," + " " + num6 + "]");
		//orignally tried using Jframe but gave me alot of trouble...
	}
}
