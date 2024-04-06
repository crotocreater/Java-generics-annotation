package Generisc;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 <T>{
    private List<Integer> list;
    public Exercise2(){
        this.list = new ArrayList<Integer>();
    }
    public void setList (){
        for (int i = 1;i<10;i++){
            this.list.add(i);
        }
    }
    public void getList(){
        for (Integer a:list){
            System.out.println(":"+ a.getClass()+ " " + a);
        }
    }

}
