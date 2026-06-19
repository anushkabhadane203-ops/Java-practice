package Com_pages;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/transaction")
public class TransactionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        response.getWriter().println(
                "<h2>Transaction Details</h2>" +
                "<table border='1'>" +
                "<tr><th>Txn ID</th><th>Type</th><th>Amount</th></tr>" +
                "<tr><td>1</td><td>Deposit</td><td>10000</td></tr>" +
                "<tr><td>2</td><td>Withdraw</td><td>5000</td></tr>" +
                "</table>");

        System.out.println("Transaction Table");
        System.out.println("-----------------------");
        System.out.println("1 Deposit 10000");
        System.out.println("2 Withdraw 5000");
    }
}
