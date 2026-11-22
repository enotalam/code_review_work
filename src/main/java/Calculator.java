public class Calculator {

    /** Возвращает сумму a и b. */
    public int add(int a, int b) {
        return a + b;
    }

    /** Возвращает разность a и b (a - b). */
    public int dif(int a, int b) {
        return a - b;
    }

    /** Возвращает целую часть от деления a на b. Деление на ноль запрещено. */
    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль");
        }
        return a / b;
    }

    /** Возвращает произведение a и b. */
    public int times(int a, int b) {
        return a * b;
    }

    /** Вычисляет значение выражения (a + b) * c - d / e, используя методы выше. */
    public int solver() {
        int a = 6, b = 4, c = 3, d = 20, e = 5;
        return dif(times(add(a, b), c), div(d, e));
    }
}