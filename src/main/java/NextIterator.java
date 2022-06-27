import java.util.Iterator;
import java.util.Random;

public class NextIterator implements Iterator<Integer> {
    int min, max;

    public NextIterator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        Random random = new Random();
        return random.nextInt((max -min) + 1) + min;
    }
}
