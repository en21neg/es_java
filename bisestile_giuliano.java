import java.util.Scanner;

class bisestile_giuliano{

     

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n=input.nextInt();


        if (n % 4 == 0)
            System.out.println("366");
        else
            System.out.println("365");
    
}
}

