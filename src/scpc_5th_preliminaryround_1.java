import java.util.Scanner;

public class scpc_5th_preliminaryround_1  {
    static int Answer;
    static int[] list = new int[1000000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 0; test_case < T; test_case++) {
            int result = 0;
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            for(int i = n1; i <= n2 ; i++){
                list[i-1] = recursive(i);
                result += list[i-1];
            }
            Answer = result;
            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }
    public static int recursive(int n){
        int result = 0 ;
        if(n == 1)
            return 0;
        if(list[n-1] != 0){
            return list[n-1];
        }
        if(n%2 == 0){
            result++;
            return result + recursive(n/2);
        }else{
            result++;
            return result + recursive(n+1);
        }
    }
    public static boolean isEven(int n){
        return n%2 == 0 ? true : false;
    }
}
/*1 이상의 정수를 받아서 다음의 규칙에 따른 “작업”을 반복하여 결국 1 을 만드는 게임을 하려고 한다.
아래 규칙은 한번의 작업에 대한 것이고, 작업의 결과로 만들어지는 수에 작업을 수행하는 것을 반복한다. 규칙에도 나와 있듯이 현재 수가 1 인 경우는 작업을 하지 않고 멈춘다.

  1. 만약 수가 1 이면 작업을 하지 않고 멈춘다.
  2. 만약 수가 1 이 아닌 홀수이면 1 을 더한다.
  3. 만약 수가 짝수이면 2 로 나눈다.

예를 들어, 받은 수가 2 인 경우는 2→1 로 1 회의 작업 후에 멈춘다.
받은 수가 4 인 경우는 4→2→1 로 2 회의 작업 후에 멈춘다.
받은 수가 3 인 경우는 3→4→2→1 로 3 회의 작업 후에 멈춘다.
받은 수가 6 인 경우는 6→3→4→2→1 로 4 회의 작업 후에 멈춘다.

앞의 예 들에서 볼 수 있듯이, 받은 수가 3 인 경우의 작업 횟수를 알면 받은 수가 6인 경우의 작업 횟수를 바로 계산할 수 있다는 것을 알 수 있다.

두 정수 N1과 N2를 입력으로 받아서 (1≤N1≤N2≤106), N1,N1+1,N1+2,…,N2의 작업 회수를 모두 더한 값을 계산하는 프로그램을 작성하라.*/

