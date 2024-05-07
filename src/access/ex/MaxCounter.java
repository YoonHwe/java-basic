package access.ex;

public class MaxCounter {
    private int count;
    int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    //메서드 increment : 숫자를 하나 증가
    public void increment(){
        if(count >= max){
            System.out.println("최댓값을 초과할 수 없습니다.(최댓값 : " + max+")");
            return;
        }
        this.count++;
    }
    //메서드 getCount : 지금까지 증가한 값을 반환
    public int getCount(){
        return count;
    }
}
