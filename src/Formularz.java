import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/formularz")
public class Formularz extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String kilogramyS = request.getParameter("kilogramy");
            String metryS = request.getParameter("metry");

            double kilogramy = Double.parseDouble(kilogramyS);
            double metry = Double.parseDouble(metryS);

            Konwerter konwerter1 = new Konwerter();
            String wynik=konwerter1.konwertuj(metry,kilogramy);
            response.getWriter().println(wynik);

        }catch (NumberFormatException e){
            response.getWriter().println("Blad, nie podales liczby");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
