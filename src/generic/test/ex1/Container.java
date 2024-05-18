package generic.test.ex1;

import java.util.Objects;

public class Container<T> {
    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }

    public Boolean isEmpty(){
        return Objects.isNull(item);
    }


}
