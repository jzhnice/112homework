/**
 * @author jzh
 * @version 1.0
 * @date 2022/1/12 11:11
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问一年后的兔子总数为多少？
 */
public class Main {
    public static void main(String[] args) {
        // 兔子的对数初始为1
        //  1 1   2 1   3 2    4 3   5 5  6 8  7 13  8  21  9 34 10 55 11  79 12 144
        // 用一个数组  把前几次的值放在前面 后面的等于前两个相加的和
        int[] ints = new int[12];
        for (int i = 0; i < 12; i++) {
            if (i < 2) {
                ints[i] = 1;
            }
            if (i >= 2) {
                ints[i] = ints[i - 1] + ints[i - 2];
            }
        }
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        System.out.println("一年以后的兔子总数为" + sum * 2);
    }
}