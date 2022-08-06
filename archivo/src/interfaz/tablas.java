
package interfaz;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class tablas extends JFrame {
    JTable tabla = new JTable();
    JScrollPane sp = new JScrollPane();
    JPanel p1 = new JPanel();
    
    private void tabla(){
        String columnas [] = {"nombre", "apellido", "telefono"};
        Object filas [][]={{"erick","baeza",7777},{"blanca","recinos",22222},{"marvin","perez",3333},{"pablo","lopez",4444}};
        
        tabla = new JTable(filas,columnas);
        sp = new JScrollPane(tabla);
        sp.setBounds(10, 20, 500, 300);
        p1.add(sp);
        sp.setVisible(true);
        
        
      
    }
    private void crear (){
        setTitle("mostrar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(700,400);
        setVisible(true);
        p1.setLayout(null);
        p1.setBackground(Color.blue);
        add(p1);
     
    }
    
    public void ejecutar(){
        crear();
        tabla();
    }
    
    public static void main(String[] args) {
        tablas t = new tablas();
        t.ejecutar();
       
    }
}
