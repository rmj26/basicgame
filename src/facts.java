import java.sql.SQLOutput;
import java.util.Scanner;

public class facts {

    public static void main (String [] args)
    {
        String jj;
        String answer="y";

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the world of information");
        System.out.println("Press any key to continue");
        jj= input.next();
        method(jj);

        System.out.println("Would you like to play again");
        jj = input.next();

       if (jj.equalsIgnoreCase(answer))
       {
           method(jj);
       }
    }

  public static  void  method (String x){
        Scanner input= new Scanner(System.in);
        String userentry, bird, fish, mammal;
        bird="Bird";
        fish="Fish";
        mammal="Mammal";


        System.out.println("fun facts about animals");
        System.out.println("Select your faourite specie of an animal, bird, fish, mamal");
        userentry=input.next();
        if (userentry.equalsIgnoreCase(bird))
        {
            System.out.println("Birds can fly in the air. An eagle is the largest bird in the world");

        }
        if (userentry.equalsIgnoreCase(fish))
        {
            System.out.println("Fish swim in the water. Whale shark is the largest fish in the world");
        }
        if (userentry.equalsIgnoreCase(mammal))
        {
            System.out.println("Mammals can live on both land and water, a seal is an example.");
        }


    }
}
