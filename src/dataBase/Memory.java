package dataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Memory {

    List<String> dataBase = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addInDB(String str) throws OutOfMemoryError {
         if (dataBase.size()>4){
             throw new OutOfMemoryError("Out of MEMORY");
         }else if (str.equals("fuck")){
             throw new OutOfMemoryError("Don't squeal!");
         }
         dataBase.add(str);
    }

    public void getAndRemoveFromDB(){
        try {
            dataBase.get(0);
            System.out.println(dataBase.get(0));
            dataBase.remove(0);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Data Base is empty!");
        }
    }

    public List<String> getDataBase() {
        return dataBase;
    }

    public Scanner getSc() {
        return sc;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "dataBase=" + dataBase +
                '}';
    }
}
