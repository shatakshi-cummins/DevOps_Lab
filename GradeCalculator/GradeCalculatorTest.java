package DevOps_Lab.GradeCalculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class GradeCalculatorTest {
    @Test
    public void TestCalculateGrade(){
        assertEquals('A',GradeCalculator.calculateGrade(95));
        assertEquals('B',GradeCalculator.calculateGrade(85));
        assertEquals('C',GradeCalculator.calculateGrade(75));
        assertEquals('D',GradeCalculator.calculateGrade(65));
        assertEquals('F',GradeCalculator.calculateGrade(55));   
    }
}
