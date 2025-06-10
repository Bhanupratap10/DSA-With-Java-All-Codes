package BitManipulation;

public class Clear_LastBit {
    public static int ClearIthBit(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(ClearIthBit(15, 2));
    }
}
