package comp1110.lab3;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 2/3/2024 5:26 pm
 */
@SuppressWarnings({"all"})
public class StackableBucket {
    public static void main(String[] args) {
        SB big = new SB(10.0, "big");
        SB medium = new SB(5.0, "medium");
        SB small = new SB(1.0, "small");

        //Use setInnerBucket() to stack the big bucket into the medium bucket.
        // If you run this, your code should print Too large to stack!.
        medium.setInnerBucket(big);

        //Use setInnerBucket() to stack the medium bucket into the big bucket.
        // Print the getInnerBucket() of the big bucket. This should return medium
        big.setInnerBucket(medium);
        System.out.println(big.getInnerBucket());

        //Use setInnerBucket() to stack the small bucket into the big bucket.
        // Print getInnerBucket() of the big and medium buckets.
        // The small bucket should be stacked in the medium bucket, which is stacked in the big bucket.
        big.setInnerBucket(small);
        System.out.println(big.getInnerBucket());
        System.out.println(medium.getInnerBucket());

        big.unstackBuckets();
//        System.out.println(big.getInnerBucket());//Exception
//        System.out.println(medium.getInnerBucket());//Exception
    }
}

class SB extends Bucket {
    SB innerBucket;
    private String name;

    public SB(double capacity, String name) {
        super(capacity);
        this.name = name;
    }

    public String getInnerBucket() {
        //return name of the innerBucket
        return innerBucket.name;
    }

    public void setInnerBucket(SB smallerBucket) {
        if (smallerBucket.getCapacity() > this.getCapacity()) {
            System.out.println("Too large to stack!");
        } else if ((smallerBucket.getCapacity() <= this.getCapacity()) && (this.innerBucket == null)) {
            this.innerBucket = smallerBucket;
        } else {
            //If the bucket already has an innerBucket
            //the smallerBucket should try to stack into the innerBucket.
            innerBucket.setInnerBucket(smallerBucket);
        }
    }

    //Here comes the RECURSION!!!
    //Add a new public instance method unstackBuckets().
    // This method should remove all buckets from inside the bucket,
    // unstack them from each other.
    //If you run this method on the big bucket,
    // the big and medium buckets should now have no innerBucket.
    public void unstackBuckets() {
        if (innerBucket != null) {
            innerBucket.unstackBuckets(); // Unstack inner buckets recursively
            innerBucket = null; // Remove inner bucket
        }
    }
}