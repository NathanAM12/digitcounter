import java.util.Random;

class digitcounter {
    public static void main(String args[])
    {
        int i=0;
        Random rand = new Random();

        int n = rand.nextInt(1000000000) + 1;
        System.out.println(n);
        while(n>0)
        {
            System.out.println(n%10);
            n=n/10;
            i++;
        }
        System.out.println("Number of Digits present : "+i);
    }
}


//50 is the maximum and the 1 is our minimum
