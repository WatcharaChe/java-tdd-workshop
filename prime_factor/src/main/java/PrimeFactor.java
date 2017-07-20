import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 2; i <= number / 2; i++) {
            while (number % i == 0) {
                list.add(i);
                number /= i;
            }
        }
        if(number > 1){
            list.add(number);
        }
        return list;
//
//        if (number == 1) {
//        } else if (number  == 4) {
//            list.add(2);
//            list.add(2);
//
//        } else if(number == 6){
//            list.add(2);
//            list.add(3);
//        }else if (number == 8){
//            list.add(2);
//            list.add(2);
//            list.add(2);
//        }
//        else if (number == 9){
//            list.add(3);
//            list.add(3);
//        }
//        else if (number == 27){
//            list.add(3);
//            list.add(3);
//            list.add(3);
//        }
//
//        else
//            list.add(number);
//        return list;
    }
}
