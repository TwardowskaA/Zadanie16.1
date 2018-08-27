package Distance;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;

@WebServlet("/calcmeter")
public class DistanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String m = request.getParameter("meters");
        String cm = request.getParameter("centimeters");
        String mm = request.getParameter("milimeters");
        PrintWriter writer = response.getWriter();
        Distance dist = new Distance();
        writer.println("Podana wartosc w przeliczeniu na: ");

        if (m != null ) {
            writer.println("metry: " + dist.DistanceM(Double.valueOf(m)));
            writer.println("centymetry: " + dist.DistanceMtoCM(Double.valueOf(m)));
            writer.println("milimetry: " + dist.DistanceMtoMM(Double.valueOf(m)));
        } else if (cm != null ) {
            writer.println("metry:" + dist.DistanceCMtoM(Double.valueOf(cm)));
            writer.println("centymetry: " + dist.DistanceCM(Double.valueOf(cm)));
            writer.println("milimetry: " + dist.DistanceCMtoMM(Double.valueOf(cm)));
        } else if (mm != null) {
            writer.println("metry: " + dist.DistanceMMtoM(Double.valueOf(mm)));
            writer.println("centymetry: " + dist.DistanceMMtoCM(Double.valueOf(mm)));
            writer.println("milimetry: " + dist.DistanceMM(Double.valueOf(mm)));
        } else if (m != null && cm != null || m != null && mm != null || cm != null && mm != null) {
            writer.println("Podaj tylko jedną wartość pola");
        }

    }

}
