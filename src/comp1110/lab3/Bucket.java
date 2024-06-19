package comp1110.lab3;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 2/3/2024 4:46 pm
 */
@SuppressWarnings({"all"})
public class Bucket {
    private final double capacity;
    //The capacity field will never
    //change (the capacity of a bucket is something that does not (normally) change), so it
    //can be declared as final
    private double contents;

    public Bucket(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getContents() {
        return contents;
    }

    public double empty() {
        //The third is empty(), which will empty the bucket (its contents will now be zero), and will
        //return the contents of the bucket before it was emptied (i.e. how much was emptied from the bucket).
        double temp = contents;
        this.contents = 0;
        return temp;
    }

    public void add(double amount) {
        //The fourth is add(double amount), which will add the given amount to the bucket, and increase
        //the contents accordingly, but it will never increase the contents to be more than the capacity
        //(i.e. any extra water will be spilled, so the total contents can never be higher than the capacity).
        //It doesn't return anything
        this.contents = contents + amount;
        if (this.contents >= capacity) {
            this.contents = capacity;
        }
    }

    public static void main(String[] args) {
        Bucket big = new Bucket(10.0);
        Bucket small = new Bucket(1.0);

        big.add(20.0);
        small.add(20.0);
        System.out.println(big.getContents() + " " + small.getContents());

        big.empty();//return content 10.0
        System.out.println(big.getContents());//0.0

        big.add(small.empty());//Empty the small bucket into the big bucket.
        System.out.println(big.getContents() + " " + small.getContents());

    }
}
