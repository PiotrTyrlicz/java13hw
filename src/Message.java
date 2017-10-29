import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/message")
public class Message extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String tekst = request.getParameter("text");
        response.getWriter().println("Twój tekst: "+tekst);

        //Informacje info1=new Informacje(tekst);
        //response.getWriter().println(info1.pokazInformacje());

        Informacje info1=new Informacje();
        response.getWriter().println("Ilosc znakow: "+info1.liczbaZnakow(tekst));
        response.getWriter().println("Ilosc znakow bez spacji: "+info1.liczbaZnakowBezSpacji(tekst));
        response.getWriter().println("Ilosc wyrazow1: "+info1.liczbaWyrazow(tekst) + "!");
        response.getWriter().println("Czy palindrom: "+info1.czyPalindrom(tekst));


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
