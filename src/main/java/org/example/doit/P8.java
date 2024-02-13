package org.example.doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

//'좋은 수' 구하기
public class P8 {

    public static void main(String[] args) throws IOException {

        //수를 입력받아 배열에 저장한 후 정렬

        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(bf.readLine());
        int result=0;

        long A[]= new long[N];

        StringTokenizer st= new StringTokenizer(bf.readLine());

        for(int i=0; i<N; i++){

            A[i]= Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);

        //for ->k를 0부터 N까지 반복
        for(int k=0; k<N; k++){

            //찾고자 하는 값 find, 포인터 i, 포인터 j
            long find= A[k];
            int i=0;
            int j=N-1;

            //투포인터 알고리즘
            while (i<j){
                if(A[i]+A[j]==find){
                   //find는 서로 다른 두수의 합이어야 함을 체크
                    if( i!=k && j!=k){
                        result++;
                        break;
                    }else if(i==k){
                        i++;
                    } else if (j==k) {
                        j--;
                    } else if (A[i]+A[j]<find) {
                        i++;
                    }
                } else if (A[i]+A[j]<find) {
                    i++;
                }else {
                    j--;
                }
            }
        }

        System.out.println(result);
        bf.close();


    }
}
