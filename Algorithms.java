import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twodigit = twodigit();
        int smallest = smallest();
        int fivehundo = fivehundo();
        int biggest= biggest();
        int sum= sum();
        System.out.println(odds);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }    

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

        public static int twodigit() throws FileNotFoundException{
        s = new Scanner(f);
        int twodigit = 0;
        while (s.hasNext()) {
            if (s.nextInt()>9 && s.nextInt()<100)
                twodigit++;
        }
        return twodigit;
    }

        public static int fivehundo() throws FileNotFoundException{
        s = new Scanner(f);
        int twodigit = 0;
        while (s.hasNext()) {
            if (s.nextInt()>500)
                fivehundo++;
        }
        return fivehundo;
    }

    public static int smallest() throws FileNotFoundException{
        s = new Scanner(f);
        int twodigit = 0;
        while (s.hasNext()) {
            if (s.nextInt()<s.previousInt())
                smallest=s.nextInt();
        }
        return smallest;
    }

    public static int biggest() throws FileNotFoundException{
        s = new Scanner(f);
        int twodigit = 0;
        while (s.hasNext()) {
            if (s.nextInt()>s.previousInt())
                biggest=s.nextInt();
        }
        return biggest;
    }

    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int twodigit = 0;
        while (s.hasNext()) {
            next=s.nextInt();
            previous=s.previousInt();
            
            sum= next+previous;
        }
        return sum;
    }
}