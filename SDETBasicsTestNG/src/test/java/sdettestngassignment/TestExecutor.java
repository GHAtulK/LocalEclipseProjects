package sdettestngassignment;

import java.io.IOException;

public class TestExecutor {

	public static void main(String[] args) {
		// Run TestNG tests
		// Collect test results
		String[][] testResults = {{"Test Name", "Result"}, {"Addition", "Pass"}, {"Subtraction", "Pass"}, {"Multiplication", "Fail"}, {"Division", "Pass"}};

		try {
			ExcelExporter.exportTestResults("test_results.xlsx", testResults);
			System.out.println("Test results exported successfully.");
		} catch (IOException e) {
			System.out.println("Error exporting test results: " + e.getMessage());
		}
	}
}
