package org.example.programmers;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> map= new HashMap<>();

        //name 사이즈만큼 루프돌면서
        for(int i=0; i< name.length; i++){

            //map[name[i]] 에 yearning[i]저장
            String nameItem= name[i];
            int point= yearning[i];

            map.put(nameItem,point);


        }

        for(int i=0; i< photo.length; i++){

            for(String item: photo[i]){
                //map의 key로 사용해 나오는 value값
                answer[1]+=map.getOrDefault(item,0);
            }
        }



        return answer;
    }
}