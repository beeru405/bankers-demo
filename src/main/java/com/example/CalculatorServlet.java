import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalculatorServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String operator = request.getParameter("operator");

        double result = 0;

        try {
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);

            switch (operator) {
                case "add":
                    result = n1 + n2;
                    break;
                case "subtract":
                    result = n1 - n2;
                    break;
                case "multiply":
                    result = n1 * n2;
                    break;
                case "divide":
                    if (n2 != 0) {
                        result = n1 / n2;
                    } else {
                        out.println("Error: Cannot divide by zero");
                        return;
                    }
                    break;
            }

            out.println("Result: " + result);
        } catch (NumberFormatException e) {
            out.println("Error: Invalid input");
        }
    }
}
