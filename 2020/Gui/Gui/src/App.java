import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.*;

public class App {

    JTextField nombre;
    JTextField fechaNac;
    JButton boton;
    
    App() {
        init();
    }

    private void init() {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = (JPanel) frame.getContentPane();  

        frame.setLayout(new FlowLayout());
        nombre = new JTextField();
        nombre.setPreferredSize(new Dimension(100,100));
        contentPane.add(nombre);

        fechaNac = new JTextField();
        fechaNac.setPreferredSize(new Dimension(100,100));
        contentPane.add(fechaNac);
    
        boton = new JButton("Click!");
        boton.setPreferredSize(new Dimension(100,100));
        contentPane.add(boton);

        boton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                fechaNac.setText("Pase");
            }
        });
        
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nombre.setText("Hola Mundo");
            }
        });
        
        frame.pack();
        frame.setVisible(true);
    }

    private static void createAndShowGUI() {
        App a = new App();
    }

    public static void main(String[] args) throws Exception {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
