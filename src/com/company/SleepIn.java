package com.company;

public class SleepIn {
    public static void main(String[] args) {
        sleepIn3(true, true); // true
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday && vacation) {
            return true;
        } else if (weekday && !vacation) {
            return false;
        } else if (!weekday && vacation) {
            return true;
        } else {
            return true;
        }
    }

    public static boolean sleepIn2(boolean weekday, boolean vacation) {
        if (weekday && !vacation) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean sleepIn3(boolean weekday, boolean vacation) {
        return !(weekday && !vacation);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble2(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble3(boolean aSmile, boolean bSmile) {
        return ((aSmile && bSmile) || (!aSmile && !bSmile));
    }

    /*
         T T -> F
         T F -> F
         F T -> F
         F F -> T

        !(T&&T) ->
     */

    public int sumDouble(int a, int b) {
        int sum = sum(a, b);
        if (a == b) {
            return 2 * sum;
        } else {
            return sum;
        }
    }


    public int[] fix231(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
            return nums;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
            return nums;
        } else
            return nums;
    }


    public int[] fix23(int[] nums) {
        int lastValue = 0;
        for (int i = 0; i < nums.length; i++) {
            if (lastValue == 2 && nums[i] == 3) {
                nums[i] = 0;
                break;
            }
            lastValue = nums[i];
        }
        return nums;
    }

}