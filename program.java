import java.util.*;
public class program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day");
        int n = sc.nextInt();
        int sunbuds = 0;
        int moonblossoms = 0;
        int staroots = 0;
        int resting = 0;
        int totalFlowers = 0;

        for(int i = 1; i<=n; i++){
            boolean divi2 = (i % 2 == 0 );
            boolean divi3 = (i%3 == 0);
            boolean divi4 = (i%4 == 0);


            if(divi2 && divi3 && divi4){
                resting++;
            }
            
            else if(divi2 && divi3 ){
                 totalFlowers++;
                totalFlowers +=1;

            }
            else if(divi3){
                 moonblossoms++;
                 moonblossoms += 3;
              
            }
            else if(divi4){
                staroots++;
                staroots += 4;
            } else if(divi2){
                sunbuds++;
                sunbuds += 2;
            } 
       

        }
        System.out.println("resting" + resting);
        System.out.println("totalFlowers" + totalFlowers);
        System.out.println("sunbuds" +sunbuds);
        System.out.println("moonblossoms" +moonblossoms);
        System.out.println("staroots" +staroots);
        
    }
}