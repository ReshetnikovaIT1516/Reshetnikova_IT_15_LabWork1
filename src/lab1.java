import java.util.Scanner;
public class lab1 {
    public double fraction (double x) {
        int INT = (int)x;
        return x - INT;
    }
    public int charToNum (char x2) {
        if (x2 < '0' || x2 > '9') {
            return -1;
        }
        return x2-'0';
    }
    public boolean is2Digits (int x3) {
        if (x3 >= 10 && x3 <= 99) {
            return true;
        }
        if (x3 <= -10 && x3 >= -99) {
            return true;
        }
        return false;
    }
    public boolean isInRange (int a, int b, int num) {
        if (a <= b) {
            return num >= a && num <= b;
        } else {
            return num >= b && num <= a;
        }
    }
    public boolean isEqual(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        } else {
            return false;
        }
    }
    public int abs (int x) {
        if(x<0) {
            return -x;
        } else {
            return x;
        }

    }

    public boolean is35 (int x) {
        if (x%3==0 && x%5==0){
            return false;
        }
        if (x%3==0 || x%5==0) {
            return true;
        } else {
            return false;
        }
    }
    public int max3 (int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
    public int sum2 (int x, int y) {
        if(x+y<=19 && x+y>=10) {
            return 20;
        } else {
            return x + y;
        }
    }


    public String day (int x) {
        switch (x) {
            case 1: return "Понедельник";
            case 2: return "Вторник";
            case 3: return "Среда";
            case 4: return "Четверг";
            case 5: return "Пятница";
            case 6: return "Суббота";
            case 7: return "Воскресенье";
            default: return "Это не день недели";
        }

    }

    public String listNums (int x) {
        if (x < 0) {
            return "Число должно быть больше 0!";
        }
        String result = "";
        for (int i=0; i<=x; i++) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += i;
        }
        return result;
    }


    public String chet (int x) {
        if (x < 0) {
            return "Число должно быть больше 0!";
        }
        String result = "";
        for (int i=0; i<=x; i=i+2) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += i;
        }
        return result;
    }

    public int numLen (long x) {
        if (x == 0) {
            return 1;
        }

        int count = 0;
        long num = Math.abs(x);

        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }


    public void square (int x) {
        if (x <= 0) {
            System.out.println("Сторона квадрата не может быть меньше 0!");
            return;
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void rightTriangle (int x) {
        if (x <= 0) {
            System.out.println("Сторона треугольника не может быть меньше 0!");
            return;
        }
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public int findFirst (int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs (int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int max = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int absValue = Math.abs(arr[i]);
            if (absValue > max) {
                max = absValue;
            }
        }
        return max;
    }

    public int[] add (int[] arr, int[] ins, int pos)
    {

        if (pos < 0 || pos > arr.length) {
            System.out.println("Неверное место вставки!");
            return null;
        }

        int[] result = new int[arr.length + ins.length];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[ins.length + i] = arr[i];
        }

        return result;
    }

    public int[] reverseBack (int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public int[] findAll (int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        int[] result = new int[count];

        // Заполняем массив индексами
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

}
