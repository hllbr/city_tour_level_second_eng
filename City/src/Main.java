import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Main {
    public static void print_transactions(){
        String operations ="0-print transactions\n"
                + "1-Next City\n"
                + "2-Previous City\n"
                + "3-Quit from Program\n"
                + "4-advice";
        System.out.println(operations);
}
    public static void trip(LinkedList<String> citys){
        Scanner scn = new Scanner(System.in);
        ListIterator<String> iterator = citys.listIterator();
        int operation ;
        if(!iterator.hasNext()){
            System.out.println("you are not on any trip");
        }
        boolean quit = false;
        boolean Further = true;
        while(!quit){
            System.out.println("choose an action");
            operation = scn.nextInt();
            scn.nextLine();
            switch(operation){
                case 0:
                    print_transactions();
                case 1:
                    if(!Further){
                       if( iterator.hasNext()){
                           iterator.next();
                       }
                       Further = true;
                    }
                    if(iterator.hasNext()){
                        
                        System.out.println("going to the city "+iterator.next());
                    }else{
                        System.out.println("There are no cities to visit");
                    }
                    break;
                case 2:
                    if(Further){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        Further = false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("going to the city "+iterator.previous());
                    }else{
                        System.out.println("city tour started");
                    }
                    break;
                case 3:
                    System.out.println("trip ended");
                    quit =true;
                    break;
                case 4:
                    advice(citys);
            }
        }
        
    }
    public static void advice(LinkedList<String> citys){
        ListIterator<String> iterator = citys.listIterator();
        Scanner scn = new Scanner(System.in);
        String operation2 ;
        if(!iterator.hasNext()){
        System.out.println("There is no advice we can give");
        }
         boolean quit2 = false;
         while(!quit2){
            System.out.println("Write the name of one of the attractions");
            operation2 = scn.nextLine();
            switch(operation2){
                case "paris":
                    System.out.println("you need to go to the eiffel tower baby");
                    break;
                case "barcelona":
                    System.out.println("don't we have a the classic");
                    break;
                case "washington":
                    System.out.println("I say leave before seeing the White House and the obelisk, or even the Martin Luther's tomb.");
                    break;
                case "Sivas":
                    System.out.println("They say have you eaten Sivas meatballs, have you seen the great mosque? It would be a shame if you did not visit the madrasa.");
                    break;
                case "roma":
                    System.out.println("If someone said collesium, you wouldn't have trouble with souvenirs.");
                    break;
                case "qq":
                    System.out.println("referral method terminating");
                    quit2 = true;
                    break;
                case "sivas":
                    System.out.println("sivas is unlike every other city, its climate is harsh.\nSo please start with a capital letter.\nThank you for your understanding");
            }
             
         }
    }
    public static void main(String[] args){
        LinkedList<String> citys = new LinkedList<>();
        citys.add("Paris");
        citys.add("Barcelona");
        citys.add("Washington DC");
        citys.add("Sivas");
        citys.add("Roma");
        print_transactions();
        trip(citys);
    }
    
}
