package ua.opnu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // ======== Logical operations ========

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    // ======== Boolean expressions ========

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

    // ======== Loops and Arrays ========

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) count++;
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        int end = Math.min(nums.length, 4);
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;
    }

    // ======== Strings ========

    public String helloName(String name) {
        if (name != null) {
            return "Hello " + name + "!";
        } else {
            return "Hello!";
        }
    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            String prefix = str.substring(0, str.length() - 2);
            char secondLast = str.charAt(str.length() - 2);
            char last = str.charAt(str.length() - 1);
            return prefix + last + secondLast;
        }
    }

    public String middleTwo(String str) {
        if (str != null && str.length() >= 2) {
            int mid = str.length() / 2;
            return str.substring(mid - 1, mid + 1);
        } else {
            return str;
        }
    }
}
