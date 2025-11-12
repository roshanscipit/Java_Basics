package refrence;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class refrence {

    public static void main(String[] args) {
        Object obj = new Object(); ///strong reference
        obj = null; // now the object is eligible for garbage collection
        System.gc(); // request garbage collection

        SoftReference sfe = new SoftReference<>(new Object()); //refrence which is cleared at the time of memory demand

        WeakReference wfe = new WeakReference<>(new Object()); //refrence which is cleared during next garbage collection

        ReferenceQueue<Object> phantomQueue = new ReferenceQueue<>();
        PhantomReference pfe = new PhantomReference<>(new Object(), phantomQueue); //refrence which is used to track object finalization

        System.gc(); // request garbage collection







    }
    
}
