package opgave02.models;

import java.util.Iterator;
import java.util.List;

public class RangeIterator implements Iterator<Integer> {
    private int index;
    private int end;

    public RangeIterator(int start, int end) {
        this.index = start;
        this.end = end;
    }

    @Override
    public boolean hasNext() {
        if (index < end){
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        return index++;
    }
}
