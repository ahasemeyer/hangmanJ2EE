/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Austin
 */
@WebServlet(urlPatterns = {"/hangmanServlet"})
public class hangmanServlet extends HttpServlet {

    private Game game = new Game();
    private Cookie c = null; 

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        //HttpSession session = request.getSession();
        
        String userId = "";
        
        try (PrintWriter out = response.getWriter()) {
            
            /* TODO output your page here. You may use following sample code. */
            if (true) {
            //c = new Cookie("userIdCookie", userId);
            game.startNewGame();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hangmanServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<body><h2>Hangman</h2>");
            out.println("<h2 style=\"font-family:'Lucida Console', monospace\"> " + game.getDisplayWord() + "</h2>");
            out.println("</body>");
            out.println("</html>");
            }
            else
            {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hangmanServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<body><h2>Hangman Not New</h2>");
            out.println("<h2 style=\"font-family:'Lucida Console', monospace\"> " + game.getDisplayWord() + "</h2>");
            out.println("</body>");
            out.println("</html>"); 
            }
        }
    }
    /*
                                    response = "<!DOCTYPE html><html><head><title>MyHttpServer</title></head><body><h2>Hangman</h2>"
                                            + "<img src=\"" + "h" + game.getState() + ".gif" + "\">"
                                            + "<h2 style=\"font-family:'Lucida Console', monospace\"> " + game.getDisplayWord() + "</h2>"
                                            + "<form action=\"/\" method=\"get\"> "
                                            + "Guess a character <input type=\"text\" name=\"guess\"><br>"
                                            + "<input type=\"submit\" value=\"Submit\">" + "</form></body></html>";

     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        String userGuess = (String) request.getParameter("guess");
        char[] guessedLetter = userGuess.toCharArray();
        char submittedGuess;
        
        HttpSession session = request.getSession();
        
        //String url = "/index.jsp";
        
        try (PrintWriter out = response.getWriter()) {
            if(Character.isLetter(guessedLetter[0]))
            {
                submittedGuess = guessedLetter[0];
                session.setAttribute("acceptedGuess", submittedGuess);
                //out.println("<h3>" + submittedGuess + "</h3>");
                //out.println("<h3>" + session.getId() + "</h3>");
            }
            
            processRequest(request, response);
        } 
    }

    
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
