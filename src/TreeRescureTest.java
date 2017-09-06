/**
 * 树形递归测试
 * Created by fushiyong on 2017/9/6.
 */
public class TreeRescureTest
{
    public static void main(String[] args) {
        log(30);
        log(31);
        log(32);
        log(33);
        log(34);
        log(35);
        log(36);
        log(37);
        log(38);
        log(39);
        log(40);
        log(41);
        log(42);
        log(43);
        log(44);
        log(45);
        log(46);
        log(47);
        log(48);
        log(49);
        log(50);
        log(51);
        log(52);
        log(53);
        log(54);
        log(55);


//        30 :  15
//
//        31 :  15
//
//        32 :  20
//
//        33 :  31
//
//        34 :  53
//
//        35 :  94
//
//        36 :  120
//
//        37 :  213
//
//        38 :  396
//
//        39 :  495
//
//        40 :  609
//
//        41 :  1001
//
//        42 :  1599
//
//        43 :  2693
//
//        44 :  4068
//
//        45 :  6622
//
//        46 :  11265
//
//        47 :  17349
//
//        48 :  27738
//
//        49 :  45688
//
//        50 :  75531
//
//        51 :  121957
        //未按指数级增长 理论应该是 2 倍 时间消耗 可见 编译器已做优化处理 ,且 如果 使用了延时求值的话 ,保存了 变量缓存
        //50 :  75531  哪么 51 应该是 75532 所以 编译器 未保存 log(50)缓存 做了二次运算 否则,不可能这么高的时间消耗




    }


    public static void log(int i){

        System.out.println();

        long start0 = System.currentTimeMillis();

        // 0 1 1 2 3 5 8 13 21 34
        treeRescure(i);

        long end0 = System.currentTimeMillis();

        System.out.println(i+ " :  " + (end0 - start0));
    }
    public static int treeRescure(int i){
        if ( i == 0 ){
            return 0 ;
        }else if(i  == 1){
            return 1 ;
        }else{
            return treeRescure(i -1 ) + treeRescure(i  - 2);
        }
    }
}
