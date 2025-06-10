package BitManipulation;

public class Updated_IthBit {
    public static int ClearIthBit(int n, int i) {
       int bitMask = ~(1<<i);
       return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return ClearIthBit(n, i);

        // } else {
        //     return setIthBit(n, i);
        // }

        n = ClearIthBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
        
    }
}
