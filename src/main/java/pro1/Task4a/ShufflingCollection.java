package pro1.Task4a;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShufflingCollection<T>
{
    private List<T> content;
    private Random random = new Random();
    public ShufflingCollection(List<T> content) {
        this.content = new ArrayList<>(content);
    }

    public T get(int index)
    {
        return content.get(index);
    }

    public void shuffle(int swapCount){
        for(int i=0;i<swapCount;i++){
            var i0 = random.nextInt(content.size());
            var i1 = random.nextInt(content.size());
            var temp = content.get(i0);
            content.set(i0,content.get(i1));
            content.set(i1,temp);
        }
    }
}