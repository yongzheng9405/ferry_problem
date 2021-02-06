import java.util.ArrayList;
import java.util.List;

public class CrossRiver {
    List<String> listThis = new ArrayList<String>();
    List<String> listThat = new ArrayList<String>();
    /*boolean thisFlag = true;
    boolean thatFlag = false;
*/
    public CrossRiver() {
        listThis.add("dog");
        listThis.add("fish");
        listThis.add("cat");
        // listThis.add("people");
    }
    public boolean isSafe(@SuppressWarnings("rawtypes") List list){
        if(list.contains("fish")&&list.contains("cat")||list.contains("cat")&&list.contains("dog")){
            return false;
        }else{
            return true;
        }
    }
    public void thisTothat(){
        String str = listThis.get(0);
        listThis.remove(str);
        if(this.isSafe(listThis)){
            System.out.println("农夫带着 " + str + " 从此岸到彼岸");
            System.out.println("此岸" + listThis + "\b" + "彼岸" + listThat);
            System.out.println();
            listThat.add(str);
            thatToThis();
        }else{
            listThis.add(str);
            thisTothat();
        }
    }
    public void thatToThis(){
        if(listThis.isEmpty()){
            System.out.println("此岸" + listThis + "\b" + "彼岸" + listThat);
            return;
        }
        if(isSafe(listThat)){
            System.out.println("农夫从彼岸到此岸");
            System.out.println("此岸" + listThis + "\b" + "彼岸" + listThat);
            System.out.println();
            thisTothat();
        }else{
            String str = listThat.get(0);
            listThat.remove(0);
            if(isSafe(listThat)){
                System.out.println("农夫带着 " + str + " 从彼岸到此岸");
                System.out.println("此岸" + listThis + "\b" + "彼岸" + listThat);
                System.out.println();
                listThis.add(str);
                thisTothat();
            }else{
                listThat.add(str);
                thatToThis();
            }
        }
    }
}
