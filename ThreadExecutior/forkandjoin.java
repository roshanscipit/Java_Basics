package ThreadExecutior;



public class forkandjoin {

    static class sumtask implements RecursiveTask<Long> {

        private final long[] array;
        private final int start;
        private final int end;
        private static final int THRESHOLD = 10; // threshold for splitting tasks

        public sumtask(long[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            int length = end - start;
            if (length <= THRESHOLD) {
                long sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            } else {
                int mid = start + length / 2;
                sumtask leftTask = new sumtask(array, start, mid);
                sumtask rightTask = new sumtask(array, mid, end);
                leftTask.fork(); // asynchronously execute the left task
                long rightResult = rightTask.compute(); // compute the right task
                long leftResult = leftTask.join(); // wait for the left task to complete
                return leftResult + rightResult;
            }
        }
    }

    public static void main(String[] args) {

        long[] array = new long[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Fill the array with values 1 to 100
        }

        ForkJoinPool pool = new ForkJoinPool();
        sumtask task = new sumtask(array, 0, array.length);
        long result = pool.invoke(task);
        System.out.println("Sum: " + result);


        
    }
    
}