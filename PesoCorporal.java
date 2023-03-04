import java.util.Scanner;

public class PesoCorporal {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int var;
        
        System.out.println("Digite un peso: ");
        var = entrada.nextInt();

        if(var < 40)
        {
            System.out.println("Usted es delgad@.");
        }
        else if(var > 40 && var < 80)
        {
            System.out.println("Usted pesa lo normal.");
        }else
        {
            System.out.println("Usted es obes@.");
        }
    }
}
