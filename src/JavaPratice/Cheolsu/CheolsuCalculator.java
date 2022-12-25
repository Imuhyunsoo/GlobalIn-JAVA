package JavaPratice.Cheolsu;

import java.util.Scanner;

/* 3.아래를 프로그래밍 하시오.
   철수 학생은 다음 3개의 필드와 메소드를 가진 4개의 클래스 Add, Sub, Mul, Div 를 작성하려고 한다

   int 타입의 a, b 필드: 2개의 피연산자
   void setValue(int a, int b): 피연산자 값을 객체 내에 저장한다.
   int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.
   곰곰 생각해보니, Add, Sub, Mul, Div 클래스에 공통된 필드와 메소드가 존재하므로 새로운 추상 클래스 Calc를 작성하고 Calc를 상속받아 만들면 되겠다고 생각했다.
   그리고 main() 메소드에서 다음 실행 사례와 같이 2개의 정수와 연산자를 입력받은 후, Add, Sub, Mul, Div 중에서 이 연산을 처리할 수 있는 객체를 생성하고
   setValue() 와 calculate()를 호출하여 그 결과 값을 화면에 출력하면 된다고 생각하였다. 철수처럼 프로그램을 작성하라.
   오 5 7 +
   12 */

public class CheolsuCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("입력하시오");

        String[] input = scanner.nextLine().split(" ");

        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        Calc calc = null;
        switch (input[2]) {
            case "+" : calc = new Add(); break;
            case "-" : calc = new Sub(); break;
            case "*" : calc = new Mul(); break;
            case "/" : calc = new Div(); break;
        }
        calc.setValue(num1,num2);
        System.out.println(calc.calculate());
    }
}