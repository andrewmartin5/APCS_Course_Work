import java.util.ArrayList;

public class PrimeTester {
    private static int primeFinder(int min, int max) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < max; i++) {
            nums.add(i + 1);
        }
        for (int currentLoc = 0; currentLoc < nums.size(); currentLoc++) {
            for (int testLoc = 1; testLoc < currentLoc - 1; testLoc++) {
                if (nums.get(currentLoc) % nums.get(testLoc) == 0) {
                    nums.remove(currentLoc);
                    currentLoc--;
                }
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                nums.remove(i);
                i--;
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
        return nums.size();
    }

    public static void main(String[] args) {
        System.out.println(primeFinder(12, 50));
    }
}
