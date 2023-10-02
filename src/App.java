import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner tangentbord = new Scanner(System.in)) {
        System.out.println("Skriv 4 heltal: ");
        int[] heltal = new int[4];

        heltal[0] = tangentbord.nextInt();
        heltal[1] = tangentbord.nextInt();
        heltal[2] = tangentbord.nextInt();
        heltal[3] = tangentbord.nextInt();

        tangentbord.nextLine();

        

        System.out.println("dina heltal var i annan ordning: "+heltal[3]+" , "+heltal[2]+" , "+heltal[1]+" och "+heltal[0]);
      

        System.out.println("Gissa ord: ");
        String gissning = tangentbord.nextLine();
        String[] ord = {"Hej","på","dig"};

        boolean svar;

        svar = ord[0].equalsIgnoreCase(gissning);

        System.out.println(ord[0]+"="+gissning+" är "+svar);

        svar = ord[1].equalsIgnoreCase(gissning);

        System.out.println(ord[1]+"="+gissning+" är "+svar);

        svar = ord[2].equalsIgnoreCase(gissning);

        System.out.println(ord[2]+"="+gissning+" är "+svar);
        
        }
    }
}
