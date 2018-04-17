package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ramon Larivoir
 */
@WebServlet(name = "FigurinhaServlet", urlPatterns = {"/figurinha.html"})
public class FigurinhaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if("/figurinha.html".equals(request.getServletPath())) {
            listarFigurinhas(request, response);
        }
    }
    
    private void listarFigurinhas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Figurinha> figurinhas = ListaDeFigurinhas.getInstance();
        
        request.setAttribute("figurinhas", figurinhas);
        
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/figurinha.jsp");
        despachante.forward(request, response);
    }

    
}
