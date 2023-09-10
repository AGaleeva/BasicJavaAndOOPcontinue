package generic;

import generic.utils.JsonWrapper1;

public class JsonWrapper1Appl {
    public static void main(String[] args) {
        double c = 3.5;
//        Double b = new Double(3.5); // так не пишут
        Double b = 3.5; // это автоупаковка (boxing)
        c = b; // это автораспаковка (unboxing), не надо добывать значение через геттер (a = b.doubleValue();)
        JsonWrapper1 wrapper1 = new JsonWrapper1(10);
        System.out.println(wrapper1);
        Integer a = (Integer) wrapper1.getValue();
        System.out.println(a);

    }
}
