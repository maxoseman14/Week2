package Monday;

public class LotteryNumAry {

    public static void main(String[] args) {

        int[] lotteryNum = new int[50];
        for (int i = 0; i < lotteryNum.length; i++) {
            lotteryNum[i] = i + 1;
        }

        for (int i = 0; i < lotteryNum.length; i++) {
            System.out.println(lotteryNum[i]);
        }
    }
}
