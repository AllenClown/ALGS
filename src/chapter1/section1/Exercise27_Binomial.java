package chapter1.section1;
import edu.princeton.cs.algs4.StdOut;

public class Exercise27_Binomial {
    public static double binomial(int N, int K, double p){
        if(N == 0 && K == 0)  return 1;
        if(N < 0 || K < 0) return 0;

        double[][] array = new double[N+1][K+1];
        /* Initialize the array */
        array[0][0] = 1;
        for(int i = 1; i < N + 1; i++)
            array[i][0] =(1 - p) * array[i-1][0];
        for(int i = 1; i < K + 1; i++)
            array[0][i] = 0;

        for(int i = 1; i < N + 1; i++)
            for(int j = 1; j < K + 1; j++)
                array[i][j] = (1 - p) * array[i-1][j] + p *  array[i-1][j-1];

            return array[N][K];

    }
    public static void main(String[] args){
        StdOut.println(binomial(2,2,0.5));
    }
}
