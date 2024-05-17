package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        //private 인스턴스 생성을 막는다.
    }
    static int sum(int[] values){
        int sumValue = 0;
        for(int v : values){
            sumValue += v;
        }
        return sumValue;
    }
    
    static double average(int[] values){
        return (double) (sum(values) / values.length);
    }
    
    static int min(int[] values){
        int minValue = Integer.MAX_VALUE;
        for(int v : values){
            minValue = Math.min(minValue, v);
        }
        return minValue;
    }

    static int max(int[] values){
        int maxValue = Integer.MIN_VALUE;
        for(int v : values){
            maxValue = Math.max(maxValue, v);
        }
        return maxValue;
    }
}
