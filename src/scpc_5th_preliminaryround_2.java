import java.util.*;

public class scpc_5th_preliminaryround_2 {
    static double Answer;

    public static void main(String args[]) throws Exception	{
        final double PI =Math.PI;
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int test_case = 0; test_case < T; test_case++) {
            int radius = sc.nextInt();
            int start = sc.nextInt();
            int end = sc.nextInt();
            int obs_num = sc.nextInt();
            double distance = end - start;
            ArrayList<obstacle> list = new ArrayList<>();
            for(int i = 0 ; i < obs_num; i++ ){
                //obstacle obs = new obstacle(sc.nextInt(),sc.nextInt(),sc.nextInt());
                int left = sc.nextInt();
                int right = sc.nextInt();
                int height = sc.nextInt();
                if(height >= radius){
                    distance = distance - (radius *2) + (height - radius)*2 + radius*PI;
                }else{
                    distance = distance - Math.sqrt(Math.pow(radius,2) - Math.pow(radius - height ,2)) *2 +radius*PI;

                }
            }
            Answer = distance;
            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }
    public static class obstacle{
        int left;
        int right;
        int height;

        obstacle(int left, int right, int height){
            this.left = left;
            this.right = right;
            this.height = height;
        }
    }
}
/*아래 그림에서 보인 것처럼 장애물이 놓인 길을 따라 공을 오른쪽으로 굴릴 때, 공의 중심이 어떤 궤적을 따라 이동하는지 알고자 한다.
길에 놓인 장애물들은 직사각형으로 표시되고, 모든 장애물은 x 축 상에 놓여있다.
공이 장애물을 만나 더 이상 움직일 수 없다면 그림에서 보듯이 장애물의 벽 또는 모서리를 따라 넘어가되, 공은 어떤 경우에도 장애물에서 떨어지지 않은 채 장애물의 벽 또는 모서리를 따라 구르며, 아무리 높은 장애물도 넘어 갈 수 있다.

공의 반지름, 출발점 위치(즉, 공의 중심의 x 좌표), 도착점 위치, 그리고 모든 장애물의 위치와 크기에 대한 정보가 주어질 때, 공의 중심이 이동한 총 거리를 출력하는 프로그램을 작성하고자 한다.

단, 공의 반지름을 R이라 하면, 모든 장애물의 너비는 2R 초과이며, 또한 장애물 사이의 간격도 2R 초과이다. 그리고 출발점과 도착점에서는 공이 항상 바닥에 닿아 있다고 가정하라*/
