import java.util.List;

public class StudentAnalyzer {

    /**
     * Đếm số học sinh đạt loại Giỏi (>= 8.0)
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (double score : scores) {
            if (score >= 0 && score <= 10 && score >= 8.0) {
                count++;
            }
        }
        return count;
    }
}
