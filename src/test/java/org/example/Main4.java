package org.example;

public class Main4 {
    public static void main(String[] args) {
          byte operand1, operand2;
          int result;

          // КонЪюкция
          //  0 & 0 = 0       1 & 0 = 0
          //  0 & 1 = 0       1 & 1 = 1
          operand1 = 127;
          operand2 = 1;
          result = operand1 & operand2;
        System.out.println(operand1 + " AND " + operand2 + " = " + result);

        // ДизЪюкция ( ИЛИ )
        //   0 | 0 = 0     1 | 0 = 1
        //   0 | 1 = 1     1 | 1 = 1

        operand1 = 2;
        operand2 = 1;
        result = operand1 | operand2;
        System.out.println( operand1 + " OR " + operand2 + " = " + result);

        // Исключающая ИЛИ
        //   0 ^ 0 = 0     1 ^ 0 = 1
        //   1 ^ 1 = 0     0 ^ 1 = 1

        operand1 = 3;
        operand2 = 1;
        result = operand1 ^ operand2;
        System.out.println( operand1 + " XOR " + operand2 + " = " + result );

        //  Отрицание  (НЕТ) значение наоборот 0=1  1=0
        //  ~ 0 = 1
        //  ~ 1 = 0

        operand1 = 1;
        result = ~operand1;
        System.out.println( " NOT " + operand1 + " = " + result);

        //  Изменение знака числа
        //  ~ +N + 1 = -N
        //  ~ -N + 1 = +N

        operand1 = 1;
        result = ~operand1;
        result++;
        //++result;
        System.out.println( " NOT " + operand1 + " + 1 = " + result);

        //  Коньюкция  ( И ) - && - ( AND )
        //  false && false = false
        //  false && true = false

        //boolean operand1 = false, operand2 = false, result = false;
        //operand1 = true;
        //operand2 = false;
        //result = operand1 && operand2;
        //System.out.println( operand1 + " AND " + operand2 + " = " + result);





    }
}
