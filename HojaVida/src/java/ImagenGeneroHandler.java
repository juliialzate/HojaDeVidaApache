/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julia
 */
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImagenGeneroHandler {

    private JLabel imagenGenero; // JLabel para mostrar la imagen
    private String genero; // Suponiendo que tienes una forma de establecer el género

    public ImagenGeneroHandler(JLabel imagenGenero) {
        this.imagenGenero = imagenGenero;
    }

    // Método para mostrar la imagen según el género
    public void mostrarImagenSegunGenero() {
        if ("femenino".equals(genero)) {
            imagenGenero.setIcon(new ImageIcon("imagenes/mujer.jpg"));
        } else if ("masculino".equals(genero)) {
            imagenGenero.setIcon(new ImageIcon("imagenes/hombre.jpg"));
        } else if ("no-binario".equals(genero)) {
            imagenGenero.setIcon(new ImageIcon("imagenes/binario.jpg"));
        } else if ("otro".equals(genero)) {
            imagenGenero.setIcon(new ImageIcon("imagenes/otros.jpg"));
        } else {
            imagenGenero.setIcon(null); // O una imagen predeterminada si lo prefieres
        }
    }

    // Métodos para obtener y establecer el género
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
        mostrarImagenSegunGenero(); // Actualiza la imagen cuando el género cambia
    }
}
