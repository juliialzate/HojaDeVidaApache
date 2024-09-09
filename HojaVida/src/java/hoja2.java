/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author julia
 */
public class hoja2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        datosPersonales p = new datosPersonales ();
        formacionAcademica f = new formacionAcademica (); 
        experienciaLaboral e = new experienciaLaboral ();
        Objetivos o = new Objetivos ();
        
        
        response.setContentType("text/html;charset=UTF-8");
        
        p.setEdad(Integer.parseInt(request.getParameter("edad")));
        p.setNombre(request.getParameter("nombre"));
        p.setCelular(Long.parseLong(request.getParameter("celular")));
        p.setCedula(Long.parseLong(request.getParameter("cedula")));
        p.setLibreta(Long.parseLong(request.getParameter("libreta")));
        p.setDireccion(request.getParameter("direccion"));
        p.setNacimiento(request.getParameter("nacimiento"));
        p.setCiudad(request.getParameter("ciudad"));
        p.setGenero(request.getParameter("genero"));
        
        f.setPrimaria(request.getParameter("primaria"));
        f.setSecundaria(request.getParameter("secundaria"));
        f.setGradocolegio(request.getParameter("gradocolegio"));
        f.setTecnicos(request.getParameter("tecnicos"));
        f.setTecnologo(request.getParameter("tecnologo"));
        f.setPregrado(request.getParameter("pregrado"));
        f.setUniversidad(request.getParameter("universidad"));
        f.setGradoU(request.getParameter("gradou"));
        f.setIdiomas(request.getParameter("idiomas"));
        
        e.setPuesto1(request.getParameter("puesto1"));
        e.setPuesto2(request.getParameter("puesto2"));
        e.setPuesto3(request.getParameter("puesto3"));
        e.setEmpresa1(request.getParameter("empresa1"));
        e.setEmpresa2(request.getParameter("empresa2"));
        e.setEmpresa3(request.getParameter("empresa3"));
        e.setDescripcion1(request.getParameter("descripcion1"));
        e.setDescripcion2(request.getParameter("descripcion2"));
        e.setDescripcion3(request.getParameter("descripcion3"));
        e.setDuracion1(request.getParameter("duracion1"));
        e.setDuracion2(request.getParameter("duracion2"));
        e.setDuracion3(request.getParameter("duracion3"));
        
        o.setHabilidad1(request.getParameter("habilidad1"));
        o.setHabilidad2(request.getParameter("habilidad2"));
        o.setLosObjetivos(request.getParameter("objetivos"));
        
        String rutaImagen;
    
        // Establece la ruta de la imagen según el género
        String genero = p.getGenero();
        if ("femenino".equalsIgnoreCase(genero)) {
            rutaImagen = "imagenes/mujer.jpg";
        } else if ("masculino".equalsIgnoreCase(genero)) {
            rutaImagen = "imagenes/hombre.jpg";
        } else if ("no-binario".equalsIgnoreCase(genero)) {
            rutaImagen = "imagenes/binario.jpg";
        } else if ("otro".equalsIgnoreCase(genero)) {
            rutaImagen = "imagenes/otros.jpg";
        } else {
            rutaImagen = "imagenes/default.jpg"; // Ruta a una imagen predeterminada
        }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("        <title>Hoja de vida organizada</title>");
            out.println("        <script src=\"funciones.js\" language=\"JavaScript1.2\"></script>");
            out.println("        <link rel=\"stylesheet\" href=\"estilos2.css\" />");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <center>");
            out.println("            <form method=\"get\" action=\"pagina2.html\">");
            out.println("                <div class=\"cuadro-blanco\">");
            out.println("                    <div class=\"cuadro-morado\">");
            out.println("                        <div class=\"columnas\">");
            out.println("                            <div class=\"columna-izquierda\">");
            out.println("                                <img src=\"" + rutaImagen + "\" id=\"imagenGenero\" alt=\"Imagen de género\">");
            out.println("                            </div>");
            out.println("                            <div class=\"columna-derecha\">");
            out.println("                                <h1><span id=\"nombre\">" + p.getNombre() + "</span></h1>");
            out.println("                            </div>");
            out.println("                        </div>");
            out.println("                      </div>");
            out.println("                    <h3 class=\"titulo-seccion\">1. Datos personales</h3>");
            out.println("                    <div class=\"columnas\">");
            out.println("                        <div class=\"cuadro-amarillo\">");
            out.println("                            <p>Fecha de nacimiento: " + p.getNacimiento() + "</p>");
            out.println("                            <p>Edad: " + p.getEdad() + "</p>");
            out.println("                            <p>Cédula de ciudadanía: " + p.getCedula() + "</p>");
            out.println("                            <p>Celular: " + p.getCelular() + "</p>");
            out.println("                        </div>");
            out.println("                        <div class=\"cuadro-amarillo\">");
            out.println("                            <p>Libreta militar: " + p.getLibreta() + "</p>");
            out.println("                            <p>Correo electrónico: " + p.getDireccion() + "</p>");
            out.println("                            <p>Ciudad de residencia: " + p.getCiudad() + "</p>");
            out.println("                            <p>Género: "+ p.getGenero() + "</p>");
            out.println("                        </div>");
            out.println("                    </div>");
            out.println("                    <h3 class=\"titulo-seccion\">2. Formación académica</h3>");
            out.println("                    <div class=\"columnas\">");
            out.println("                        <div class=\"cuadro-amarillo\">");
            out.println("                            <p>Primaria: " + f.getPrimaria() + "</p>");
            out.println("                            <p>Secundaria: "+ f.getSecundaria() + "</p>");
            out.println("                            <p>Grado colegio: "+ f.getGradocolegio() + "</p>");
            out.println("                            <p>Técnicos: "+ f.getTecnicos() + "</p>");
            out.println("                        </div>");
            out.println("                        <div class=\"cuadro-amarillo\">");
            out.println("                            <p>Tecnólogo: "+ f.getTecnologo() + "</p>");
            out.println("                            <p>Pregrado: "+ f.getPregrado() +"</p>");
            out.println("                            <p>Universidad: "+ f.getUniversidad() + "</p>");
            out.println("                            <p>Grado Universidad: "+ f.getGradoU() +"</p>");
            out.println("                            <p>Idiomas que maneja: "+ f.getIdiomas() +"</p>");
            out.println("                        </div>");
            out.println("                    </div>");
            out.println("                    <h3 class=\"titulo-seccion\">3. Experiencia laboral</h3>");
            out.println("                    <div class=\"columnas\">");
            out.println("                        <div class=\"cuadro-amarillo\">");
            out.println("                            <p>Puesto 1: "+ e.getPuesto1() +"</p>");
            out.println("                            <p>Puesto 2: "+ e.getPuesto2() +"</p>");
            out.println("                            <p>Puesto 3: "+ e.getPuesto3() +"</p>");
            out.println("                            <p>Empresa 1 : "+ e.getEmpresa1() +"</p>");
            out.println("                            <p>Empresa 2 : "+ e.getEmpresa2() +"</p>");
            out.println("                            <p>Empresa 3 : "+ e.getEmpresa3() +"</p>");
            out.println("                        </div>");
            out.println("                        <div class=\"cuadro-amarillo\">");
            out.println("                            <p>Descripción de primer puesto: "+ e.getDescripcion1() +"</p>");
            out.println("                            <p>Descripción de segundo puesto: "+ e.getDescripcion2() +"</p>");
            out.println("                            <p>Descripción de tercer puesto: "+ e.getDescripcion3() +"</p>");
            out.println("                            <p>Primera referencia laboral: "+ e.getDuracion1() +"</p>");
            out.println("                            <p>Segunda referencia laboral: "+ e.getDuracion2() +"</p>");
            out.println("                            <p>Referencia personal: "+ e.getDuracion3() + "</p>");
            out.println("                        </div>");
            out.println("                    </div>");
            out.println("                    <h3 class=\"titulo-seccion\">3. Habilidades y objetivos</h3>");
            out.println("                    <div class=\"cuadro-amarillo\">");
            out.println("                        <p>Habilidades personales: "+ o.getHabilidad1() + "</p>");
            out.println("                        <p>Habilidades profesionales: "+ o.getHabilidad2() + "</p>");
            out.println("                        <p>Descripción de objetivos laborales:</p>");
            out.println("                        <div> "+ o.getLosObjetivos() +"</div>");
            out.println("                    </div>");
            out.println("                </div>");
            out.println("            </form>");
            out.println("        </center>");
            out.println("    </body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
