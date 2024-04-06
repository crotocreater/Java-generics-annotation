package Source;

import java.util.ArrayList;
import java.util.List;

public class PersionModule <T>{
    public List<T> list = new ArrayList<>();
    public void addObject (T object){
        this.list.add(object);
    }
    public void display(){
        for (T e:list){
            System.out.println(e);
        }
    }
}
