package Income;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Income{
    

    public static void main(String[] args) {

        Slab s= new Slab(); 
       
        System.out.println( "Enter your Annul Income");
        Scanner a = new Scanner(System.in);

       s.b = a.nextInt();
       s.employer();
       
    }
}
class Slab extends Income{

    int income, a,b;
    float tax;

    void employer(){
        if(b< 250000 ){
            System.out.println("You dont have to pay any tax");

        }
      else  if (b >= 250000 && b <=500000){
            tax = (b -250000)/100 *5;
            System.out.println("Your tax is " + tax);
        }
            
      else  if (b >=500000 && b <= 1000000){
            tax  =  (b-500000 )/100*20 +12500; 
            System.out.println("Your tax is " + tax );    
        }  
      else  if (b >= 1000000){
            tax  =   (b-1000000)/100*30+ 112500;
            System.out.println("Your tax is " + tax );    
        }
            
    }
}

    