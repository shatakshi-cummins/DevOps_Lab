package DevOps_Lab.GradeCalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

public class GradeCalculatorTest {
    
    @BeforeEach
    public void setUp() {
        System.out.println("Setting up test environment...");
    }
    
    @BeforeAll
    public static void setUpBeforeAll() {
        System.out.println("Setting up before all tests...");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up after test...");
    }
    
    @AfterAll
    public static void tearDownAfterAll() {
        System.out.println("Cleaning up after all tests...");
    }
    
    @Test
    public void testCalculateGrade() {
        System.out.println("Running testCalculateGrade");
        
        assertEquals('A', GradeCalculator.calculateGrade(95));
        assertEquals('B', GradeCalculator.calculateGrade(85));
        assertEquals('C', GradeCalculator.calculateGrade(75));
        assertEquals('D', GradeCalculator.calculateGrade(65));
        assertEquals('F', GradeCalculator.calculateGrade(55));

        assertNotEquals('A', GradeCalculator.calculateGrade(85));
        assertNotEquals('B', GradeCalculator.calculateGrade(95));
    }
    
    @Test
    public void testCalculateGradeWithBoundaryValues() {
        System.out.println("Running testCalculateGradeWithBoundaryValues");
        
        assertEquals('A', GradeCalculator.calculateGrade(100));
        assertEquals('A', GradeCalculator.calculateGrade(90));
        assertEquals('B', GradeCalculator.calculateGrade(89));
        assertEquals('F', GradeCalculator.calculateGrade(0));
    }
    
    @Test
    public void testCalculateGradeWithInvalidInput() {
        System.out.println("Running testCalculateGradeWithInvalidInput");
        
        assertTrue(GradeCalculator.calculateGrade(105) == 'A' || 
                   GradeCalculator.calculateGrade(105) == 'F');
        
        assertFalse(GradeCalculator.calculateGrade(-10) == 'B');
    }
    
    @Test
    public void testCalculateGradeWithException() {
        System.out.println("Running testCalculateGradeWithException");
        
        try {
            char result = GradeCalculator.calculateGrade(75);
            assertEquals('C', result);
            
            if (result != 'C') {
                throw new AssertionError("Test failed: Expected C but got " + result);
            }
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
    
    @Test
    public void testAllGradeBoundaries() {
        System.out.println("Running testAllGradeBoundaries");

        assertTrue(GradeCalculator.calculateGrade(90) == 'A');
        assertTrue(GradeCalculator.calculateGrade(89) == 'B');
        assertTrue(GradeCalculator.calculateGrade(80) == 'B');
        assertTrue(GradeCalculator.calculateGrade(79) == 'C');
        assertTrue(GradeCalculator.calculateGrade(70) == 'C');
        assertTrue(GradeCalculator.calculateGrade(69) == 'D');
        assertTrue(GradeCalculator.calculateGrade(60) == 'D');
        assertTrue(GradeCalculator.calculateGrade(59) == 'F');
        
        assertFalse(GradeCalculator.calculateGrade(85) == 'A');
        assertFalse(GradeCalculator.calculateGrade(95) == 'B');
    }
}