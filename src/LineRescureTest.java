/**
 * 线性递归
 * Created by fushiyong on 2017/9/6.
 */
public class LineRescureTest {
    public static void main(String[] args) {
        ReferenceInteger referenceInteger = new ReferenceInteger();
        referenceInteger.setValue(0);
        System.out.println(System.currentTimeMillis());
        int s  = recure(1000);
        System.out.println(s);
        System.out.println(System.currentTimeMillis());
        iteratorRescure(referenceInteger,0,1000);
        System.out.println(referenceInteger.getValue());
        System.out.println(System.currentTimeMillis());


    }

    /**
     * 线性递归过程测试
     * @param i
     * @return
     */
    public static int recure(int i ){

        if(i == 0 ){
            return 0 ;
        }else{
            return i + recure(i -1 );
        }
    }

    /**
     * 线性递归过程测试
     * @param sum
     * @param current
     * @param count
     */
    public static void iteratorRescure(ReferenceInteger sum ,  Integer current , Integer count  ){

        // 1 + 2 + 3 + .. + 100

        if(current > count ){
            return;
        }else{
            sum.setValue(sum.getValue() + current);
            current = current + 1;
            iteratorRescure(sum,current,count);
            return;
        }
    }
}
