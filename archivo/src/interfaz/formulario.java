
package interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
import java.time.Duration;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;


public class formulario extends JFrame{
    
     JTable tabla = new JTable();
    JScrollPane sp = new JScrollPane();
    JPanel p1 = new JPanel();
    Object filas [][] = new Object[50][3];
    int x = 0;
    
    
            
    public void crear(){
        setTitle("Tarea 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800,400);
        setVisible(true);
       
        p1.setLayout(null);
        p1.setBackground(Color.YELLOW);
        add(p1);
        
        JLabel l1 = new JLabel("ingrese numero de codigo");
        //coordenada x;y;largo y ancho
        l1.setBounds(555, 20, 180, 40);
        p1.add(l1);
        
        JTextField t1 = new JTextField();
        t1.setBounds(550, 50, 152, 25);
        p1.add(t1);
        
        JButton b1 = new JButton("ingresar");
        b1.setBounds(568, 185, 120, 30);
        b1.setBackground(Color.green);
        p1.add(b1);
        
          JLabel l2 = new JLabel("ingrese nombre");
        //coordenada x;y;largo y ancho
        l2.setBounds(580, 70, 100, 40);
        p1.add(l2);
        
        JTextField t2 = new JTextField();
        t2.setBounds(550, 100, 152, 25);
        p1.add(t2);
        
        
         JLabel l3 = new JLabel("ingrese apellido");
        //coordenada x;y;largo y ancho
        l3.setBounds(580, 120, 100, 40);
        p1.add(l3);
        
        JTextField t3 = new JTextField();
        t3.setBounds(550, 150, 152, 25);
        p1.add(t3);
        
        
        
        
        
        ActionListener imprimir;
         imprimir = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 if(!(t1.getText().equals("")) && !(t2.getText().equals("")) && !(t3.getText().equals(""))){
                  agregar(Integer.parseInt(t1.getText()),t2.getText(),t3.getText()) ;
                 t1.setText(null);
                 t2.setText(null);
                 t3.setText(null);
             }else{
                     JOptionPane.showMessageDialog(null, "complete los datos");
                 }
                
             }
         };
        b1.addActionListener(imprimir);
       
        
      
}   
     private void tabla(){
        
         
        String columnas [] = {"codigo","nombre", "apellido"};
        
        
        tabla = new JTable(filas,columnas);
        sp = new JScrollPane(tabla);
        sp.setBounds(10, 50, 500, 300);
        tabla.setBackground(Color.cyan);
        p1.add(sp);
        sp.setVisible(true);

    } 
     private void agregar ( int codigo,String nombre, String apellido){
         if (x == 50){
             System.out.println("ya no se permite mas datos");
         }
         filas[x][0] = codigo;
         filas[x][1] = nombre ;
         filas[x][2] = apellido;
         
         x++;
         sp.setVisible(false);
         tabla();
     }
     public void ejecutar(){
        crear();
        tabla();
     
    }
    public static void main(String[] args) {
      formulario f = new formulario();
     f.crear();
     f.tabla();
      
    }

   
}
