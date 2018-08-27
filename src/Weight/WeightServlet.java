package Weight;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;

@WebServlet("/calcweight")
public class WeightServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String kg = request.getParameter("kilograms");
        String g = request.getParameter("grams");
        String mg = request.getParameter("miligrams");
        PrintWriter writer = response.getWriter();
        Weight weight = new Weight();
        writer.println("Podana wartosc w przeliczeniu na: ");
        if (kg != null) {
            writer.println("kilgoramy: " + weight.WeightKG(Double.valueOf(kg)));
            writer.println("gramy: " + weight.WeightKGtoG(Double.valueOf(kg)));
            writer.println("miligramy: " + weight.WeightKGtoMg(Double.valueOf(kg)));
        } else if (g != null) {
            writer.println("kilgoramy: " + weight.WeightGtoKG(Double.valueOf(g)));
            writer.println("gramy: " + weight.WeightG(Double.valueOf(g)));
            writer.println("miligramy: " + weight.WeightGtoMG(Double.valueOf(g)));
        } else if (mg != null) {
            writer.println("kilgoramy: " + weight.WeightMGtoKG(Double.valueOf(mg)));
            writer.println("gramy: " + weight.WeightMGtoG(Double.valueOf(mg)));
            writer.println("miligramy: " + weight.WeightMG(Double.valueOf(mg)));
        } else if (kg != null && mg != null || kg != null && g != null || g != null && mg != null) {
            writer.println("Podaj tylko jedną wartość");

        }

    }
}
