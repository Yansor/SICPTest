/**
 * 如果 n< 3  f(n) = n
 * 如果 n >=3 f(n) = f(n-1) + 2f(n-2) + 3f(n-3)
 *
 * 采用递归计算过程计算(树形递归过程)
 *
 * 采用迭代计算过程计算
 *
 * Created by fushiyong on 2017/9/6.
 */
public class RescureTests {
    public static void main(String[] args) {
        //采用递归计算过程计算(树形递归过程)


        //性能校验


        logResucre(25);

        logIteratorRescure11(2,1,0,25);


        logResucre(28);

        logIteratorRescure11(2,1,0,28);

        logResucre(30);

        logIteratorRescure11(2,1,0,30);

        //以后 按照 树形递归 的性能 呈 指数级的 慢 ...... 所以 线性迭代 , 性能最佳

        logResucre(50);

        logIteratorRescure11(2,1,0,50);

        logResucre(100);

        logIteratorRescure11(2,1,0,100);

        logResucre(200);

        logIteratorRescure11(2,1,0,200);

        logResucre(300);

        logIteratorRescure11(2,1,0,300);
        //采用迭代计算过程计算





    }
    public static int resucre(int i ){
        if(i < 3 ){
            return i ;
        }else{
            return resucre(i-1) + 2*resucre(i-2) + 3 * resucre(i-3);
        }
    }

    // 2 1 0 10
    // 2+2+0 2 0 9
    // resucre11(0)  = 0
    //resucre11(1)  = 1
    // resucre11(2)  = 2

    public static int iteratorRescure11(int a ,int b ,int c ,  int i ){
        if(i <3 ){
            return a;
        }else{
            return iteratorRescure11(a+2*b+3*c, a,b, (i-1)) ;
        }
    }

    public static void logResucre(int i){

        System.out.println();

        long start0 = System.currentTimeMillis();

        // 0 1 1 2 3 5 8 13 21 34
        int sum =  resucre(i);

        long end0 = System.currentTimeMillis();

        System.out.println(sum+ " :  " + (end0 - start0));
    }

    public static void logIteratorRescure11(int a , int b ,int c , int count){

        System.out.println();

        long start0 = System.currentTimeMillis();

        // 0 1 1 2 3 5 8 13 21 34
        int sum = iteratorRescure11(a , b , c  ,count);

        long end0 = System.currentTimeMillis();

        System.out.println(sum+ " :  " + (end0 - start0));
    }
}
