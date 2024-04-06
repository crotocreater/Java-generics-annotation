package Generisc;

import java.util.ArrayList;
import java.util.List;

public class exercise <T> {
    private T a;
    private List<T> list;
    public exercise(T a){
        this.a = a;
        this.list = new ArrayList<>();
    }
    public exercise(){
        this.list = new ArrayList<>();
    }
    public void setList (T s){
        this.list.add(s);
    }
    public void getList(){
        for (T a:list){
            System.out.println(":"+ a.getClass()+ " " + a);
        }
    }

}
