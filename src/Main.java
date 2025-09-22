import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.1 - Дробная часть. ");
            System.out.println("1.3 - Букву в число. ");
            System.out.println("1.5 - Двузначное.  ");
            System.out.println("1.7 - Диапазон.");
            System.out.println("1.9 - Равенство. ");
            System.out.println("2.1 - Модуль числа. ");
            System.out.println("2.3 - Тридцать пять. ");
            System.out.println("2.5 - Тройной максимум. ");
            System.out.println("2.7 - Двойная сумма.  ");
            System.out.println("2.9 - День недели. ");
            System.out.println("3.1 - Числа подряд. ");
            System.out.println("3.3 - Четные числа. ");
            System.out.println("3.5 - Длина числа. ");
            System.out.println("3.7 - Квадрат. ");
            System.out.println("3.9 - Правый треугольник. ");
            System.out.println("4.1 - Поиск первого значения.  ");
            System.out.println("4.3 - Поиск максимального. ");
            System.out.println("4.5 - Добавление массива в массив. ");
            System.out.println("4.7 - Возвратный реверс. ");
            System.out.println("4.9 - Все вхождения. ");
            System.out.println("0 - Выход");
            System.out.print("Выберите задачу: ");

            String choice = scanner.next();

            switch (choice) {
                case "1.1":
                    System.out.println("Задача 1.1");
                    System.out.print("Введите вещественное число: ");
                    double x = scanner.nextDouble();
                    lab1 l = new lab1();
                    double result = l.fraction(x);
                    System.out.print("Дробная часть: " + result);
                    break;

                case "1.3":
                    System.out.println("Задача 1.3");
                    System.out.print("Введите цифру от 0 до 9: ");
                    char x2 = scanner.next().charAt(0);
                    lab1 l2 = new lab1();
                    int result2 = l2.charToNum(x2);
                    if (result2 !=-1)
                        System.out.print("Переведенное в строку число: " + result2);
                    else
                        System.out.println("Ошибка: вы ввели не верный символ: " + x2);
                break;

                case "1.5":
                    System.out.println("Задача 1.5");
                    System.out.print("Введите число: ");
                    int number = scanner.nextInt();
                    lab1 l3 = new lab1();
                    boolean result3 = l3.is2Digits(number);
                    System.out.print("Является ли число двузначным?(да-true, нет-false): " + result3);
                    break;

                case "1.7":
                    System.out.println("Задача 1.7");
                    System.out.print("Введите число a: ");
                    int a = scanner.nextInt();
                    System.out.print("Введите число b: ");
                    int b = scanner.nextInt();
                    System.out.print("Введите число num: ");
                    int num = scanner.nextInt();
                    lab1 l4 = new lab1();
                    boolean result4 = l4.isInRange(a, b, num);
                    System.out.print("Входит ли число num в промежуток между числами а и b?: " + result4);
                    break;

                case "1.9":
                    System.out.println("Задача 1.9");
                    System.out.print("Введите число a: ");
                    int a1 = scanner.nextInt();
                    System.out.print("Введите число b: ");
                    int b1 = scanner.nextInt();
                    System.out.print("Введите число c: ");
                    int c1 = scanner.nextInt();
                    lab1 l5 = new lab1();
                    boolean result5 = l5.isEqual(a1, b1, c1);
                    System.out.print("Равны ли все три числа между собой?(да-true, нет-false): " + result5);
                    break;

                case "2.1":
                    System.out.println("Задача 2.1");
                    System.out.print("Введите число: ");
                    int x6 = scanner.nextInt();
                    lab1 l6 = new lab1();
                    int result6 = l6.abs(x6);
                    System.out.print("Модуль числа: " + result6);
                    break;

                case "2.3":
                    System.out.println("Задача 2.3");
                    System.out.print("Введите число: ");
                    int x7 = scanner.nextInt();
                    lab1 l7 = new lab1();
                    boolean result7 = l7.is35(x7);
                    System.out.print("Делится ли число на 3 или 5 (но не одновременно)?(да-true, нет-false): " + result7);
                    break;

                case "2.5":
                    System.out.println("Задача 2.5");
                    System.out.print("Введите x: ");
                    int x8 = scanner.nextInt();
                    System.out.print("Введите y: ");
                    int y8 = scanner.nextInt();
                    System.out.print("Введите z: ");
                    int z8 = scanner.nextInt();
                    lab1 l8 = new lab1();
                    int result8 = l8.max3(x8, y8, z8);
                    System.out.print("Наибольшее число: " + result8);
                    break;

                case "2.7":
                    System.out.println("Задача 2.7");
                    System.out.print("Введите x: ");
                    int x9 = scanner.nextInt();
                    System.out.print("Введите y: ");
                    int y9 = scanner.nextInt();
                    lab1 l9 = new lab1();
                    int result9 = l9.sum2(x9, y9);
                    System.out.print("Сумма чисел: " + result9);
                    break;

                case "2.9":
                    System.out.println("Задача 2.9");
                    System.out.print("Введите число от 1 до 7: ");
                    int x10 = scanner.nextInt();
                    lab1 l10 = new lab1();
                    String result10 = l10.day(x10);
                    System.out.print("День недели с этим номером: " + result10);
                    break;

                case "3.1":
                    System.out.println("Задача 3.1");
                    System.out.print("Введите x: ");
                    int x11 = scanner.nextInt();
                    lab1 l11 = new lab1();
                    String result11 = l11.listNums(x11);
                    System.out.print("Ряд чисел от 0 до х (включительно): " + result11);
                    break;

                case "3.3":
                    System.out.println("Задача 3.3");
                    System.out.print("Введите x: ");
                    int x12 = scanner.nextInt();
                    lab1 l12 = new lab1();
                    String result12 = l12.chet(x12);
                    System.out.print("Ряд четных чисел от 0 до х (включительно): " + result12);
                    break;

                case "3.5":
                    System.out.println("Задача 3.5");
                    System.out.print("Введите x: ");
                    long x13 = scanner.nextLong();
                    lab1 l13 = new lab1();
                    int result13 = l13.numLen(x13);
                    System.out.print("Количество цифр в числе: " + result13);
                    break;

                case "3.7":
                    System.out.println("Задача 3.7");
                    System.out.print("Введите x: ");
                    int x14 = scanner.nextInt();
                    lab1 l14 = new lab1();
                    System.out.println("Квадрат со сторонами х:");
                    l14.square(x14);
                    break;

                case "3.9":
                    System.out.println("Задача 3.9");
                    System.out.print("Введите x: ");
                    int x15 = scanner.nextInt();
                    lab1 l15 = new lab1();
                    System.out.println("Треугольник со стороной х:");
                    l15.rightTriangle(x15);
                    break;

                case "4.1":
                    System.out.println("Задача 4.1");
                    int size;
                    do {
                        System.out.print("Введите размер массива (должен быть > 0): ");
                        size = scanner.nextInt();
                        if (size <= 0) {
                            System.out.println("Ошибка! Размер массива должен быть больше 0.");
                        }
                    } while (size <= 0);
                    int[] arr = new int[size];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size; i++) {
                        System.out.print("Элемент " + (i + 1) + ": ");
                        arr[i] = scanner.nextInt();
                    }
                    System.out.print("Введите число для поиска: ");
                    int x16 = scanner.nextInt();
                    lab1 l16 = new lab1();
                    int result16 = l16.findFirst(arr, x16);
                    System.out.print("Индекс первого вхождения этого числа в массив: " + result16);
                    break;

                case "4.3":
                    System.out.println("Задача 4.3");
                    int size17;
                    do {
                        System.out.print("Введите размер массива (должен быть > 0): ");
                        size17 = scanner.nextInt();
                        if (size17 <= 0) {
                            System.out.println("Ошибка! Размер массива должен быть больше 0.");
                        }
                    } while (size17 <= 0);
                    int[] arr17 = new int[size17];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size17; i++) {
                        System.out.print("Элемент " + (i + 1) + ": ");
                        arr17[i] = scanner.nextInt();
                    }
                    lab1 l17 = new lab1();
                    int result17 = l17.maxAbs(arr17);
                    System.out.print("Наибольшее по модулю значение массива: " + result17);
                    break;

                case "4.5":
                    System.out.println("Задача 4.5");
                    int sizeArr;
                    do {
                        System.out.print("Введите размер массива arr (должен быть > 0): ");
                        sizeArr = scanner.nextInt();
                        if (sizeArr <= 0) {
                            System.out.println("Ошибка! Размер массива должен быть больше 0.");
                        }
                    } while (sizeArr <= 0);
                    int[] arr18 = new int[sizeArr];

                    System.out.println("Введите элементы массива arr:");
                    for (int i = 0; i < sizeArr; i++) {
                        System.out.print("Элемент " + (i + 1) + ": ");
                        arr18[i] = scanner.nextInt();
                    }

                    int sizeIns;
                    do {
                        System.out.print("Введите размер массива ins (должен быть > 0): ");
                        sizeIns = scanner.nextInt();
                        if (sizeIns <= 0) {
                            System.out.println("Ошибка! Размер массива должен быть больше 0.");
                        }
                    } while (sizeIns <= 0);
                    int[] ins = new int[sizeIns];
                    System.out.println("Введите элементы массива ins:");
                    for (int i = 0; i < sizeIns; i++) {
                        System.out.print("Элемент " + (i + 1) + ": ");
                        ins[i] = scanner.nextInt();
                    }
                    int pos;
                    do {
                        System.out.print("Введите позицию для вставки (0-" + sizeArr + "): ");
                        pos = scanner.nextInt();
                    }
                    while (pos < 0 || pos > sizeArr);
                    lab1 l18 = new lab1();
                    int[] result18 = l18.add(arr18, ins, pos);
                    System.out.print("Результат вставки: ");
                    for (int i = 0; i < result18.length; i++) {
                        System.out.print(result18[i]);
                        if (i < result18.length - 1) {
                            System.out.print(" ");
                        }
                    }
                    break;

                case "4.7":
                    System.out.println("Задача 4.7");
                    int size19;
                    do {
                        System.out.print("Введите размер массива (должен быть > 0): ");
                        size19 = scanner.nextInt();
                        if (size19 <= 0) {
                            System.out.println("Ошибка! Размер массива должен быть больше 0.");
                        }
                    } while (size19 <= 0);
                    int[] arr19 = new int[size19];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size19; i++) {
                        System.out.print("Элемент " + (i + 1) + ": ");
                        arr19[i] = scanner.nextInt();
                    }
                    lab1 l19 = new lab1();
                    int[] result19 = l19.reverseBack(arr19);
                    System.out.print("Массив задом наперед: ");
                    for (int i = 0; i < result19.length; i++) {
                        System.out.print(result19[i]);
                        if (i < result19.length - 1) {
                            System.out.print(" ");
                        }
                    }
                    break;

                case "4.9":
                    System.out.println("Задача 4.9");
                    System.out.print("Введите размер массива: ");
                    int size20;
                    do {
                        System.out.print("Введите размер массива (должен быть > 0): ");
                        size20 = scanner.nextInt();
                        if (size20 <= 0) {
                            System.out.println("Ошибка! Размер массива должен быть больше 0.");
                        }
                    } while (size20 <= 0);
                    int[] arr20 = new int[size20];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size20; i++) {
                        System.out.print("Элемент " + (i + 1) + ": ");
                        arr20[i] = scanner.nextInt();
                    }
                    System.out.print("Введите число для поиска: ");
                    int x20 = scanner.nextInt();
                    lab1 l20 = new lab1();
                    int[] result20 = l20.findAll(arr20, x20);
                    System.out.print("Все индексы вхождения числа х в массив: ");
                    for (int i = 0; i < result20.length; i++) {
                        System.out.print(result20[i]);
                        if (i < result20.length - 1) {
                            System.out.print(" ");
                        }
                    }
                    break;

                case "0":
                    System.out.println("Выход из программы");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
            }

            System.out.println("\nНажмите 'Enter' чтобы снова выбрать номер задачи");
            scanner.nextLine();
            scanner.nextLine();
        }
    }
}

