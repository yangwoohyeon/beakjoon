import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answer = new ArrayList<>();
        // 뽑아낼 데이터
        for (int[] d : data) {
            if (ext.equals("code")) {
                if (d[0] < val_ext) answer.add(d);
            } else if (ext.equals("date")) {
                if (d[1] < val_ext) answer.add(d);
            } else if (ext.equals("maximum")) {
                if (d[2] < val_ext) answer.add(d);
            } else {
                if (d[3] < val_ext) answer.add(d);
            }
        }
        // 오름차순 정렬
        answer.sort((d1, d2) -> { // Comparator
            if (sort_by.equals("code")) {
                return d1[0] - d2[0]; // 양수 - d1이 d2보다 크면 d2 먼저 배치
            } else if (sort_by.equals("date")) {
                return d1[1] - d2[1];
            } else if (sort_by.equals("maximum")) {
                return d1[2] - d2[2];
            } else {
                return d1[3] - d2[3];
            }
        });
        return answer;
    }
}