import java.util.*;

public class rickshaw
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        final int minFare= 100;
        System.out.println("Enter distance in km: ");
        double distance= sc.nextInt();
        System.out.println("Enter time in minutes: ");
        int time= sc.nextInt();
        System.out.println("Are you a local? (true/false): ");
        boolean local= sc.nextBoolean();
        System.out.println("Is it day time? (true/false): ");
        boolean day= sc.nextBoolean();
        
        int localMult= local?1:2;
        int dayMult= day?1:2;
        String localMsg= local? "You are a local, normal fare":"You are not local, double fare";
        String dayMsg= day?"Day time, normal fare":"Night time, double fare";
    
        double fare= minFare*(distance/50)*(time/100)*dayMult* localMult;
        if (distance>50){
            fare= (fare*0.9);
            System.out.println("Distance over 50km 10% discount applied\n" + localMsg + "\n" + dayMsg + "\n" + "Total = Rs."+ fare);
            
        }
        else{
            System.out.println(localMsg + "\n" + dayMsg + "\n" + "Total = Rs."+ fare);
        }
    }
}
