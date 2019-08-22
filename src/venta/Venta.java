package venta;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Venta {

    public static void main(String[] args) {
        boolean estado = true;
        int opcion;
        String productos = "", detalle = "";
        detalle += "Productos\tCantidad\total\n";
        int cantidadRe = 10, CantidadMie = 5, cantidadCacho = 11, CantidadBorracho = 7, cantidad = 0;
        int pedido;
        productos += "**Panadería el chero**\n";
        productos += "Productos\t precio \tcantidad\n";
        productos += "Relampago \t $0.75\t" + cantidadRe;
        productos += " \nMieluda \t $0.60\t " + CantidadMie;
        productos += " \nCacho \t $0.50\t" + cantidadCacho;
        productos += " \nBorrachos \t $1.00\t" + CantidadBorracho;
        JTextArea panes = new JTextArea();
        JTextArea detallesC = new JTextArea();
        panes.setText(productos);

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("\tOpciones\n1-Catálogo de productos\n2-Comprar productos\n3-Detalle de cuenta\n4-Salir"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, panes);

                    break;
                case 2:
                    pedido = Integer.parseInt(JOptionPane.showInputDialog(panes, "ingrese producto que desea comprar"));
                    if (pedido == 1) {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Relempago"));
                        if (cantidadRe < 0 || cantidadRe < cantidad) {
                            JOptionPane.showMessageDialog(null, "No se cuenta disponible con la cantidad deseada\n cantidad disponible: " + cantidadRe);
                        } else {
                            detalle += "Relampago\t" + cantidad + "\t$" + (cantidad * 0.75) + "\n";
                            detallesC.setText(detalle);
                            cantidadRe = cantidadRe - cantidad;
                        }
                    } else if (pedido == 2) {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Mieludas"));
                        if (CantidadMie < 0 || CantidadMie < cantidad) {
                            JOptionPane.showMessageDialog(null, "No se cuenta disponible con la cantidad deseada\n cantidad disponible: " + CantidadMie);
                        } else {
                            detalle += "Mieluda\t" + cantidad + "\t$" + (cantidad * 0.60) + "\n";
                            detallesC.setText(detalle);
                            CantidadMie=CantidadMie-cantidad;
                        }

                    }
                    
                    else if (pedido == 3) {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de Cachos"));
                        if (cantidadCacho < 0 || cantidadCacho < cantidad) {
                            JOptionPane.showMessageDialog(null, "No se cuenta disponible con la cantidad deseada\n cantidad disponible: " + CantidadMie);
                        } else {
                            detalle += "Cacho\t" + cantidad + "\t$" + (cantidad * 0.50) + "\n";
                            detallesC.setText(detalle);
                            cantidadCacho=cantidadCacho-cantidad;
                        }
                    }
                    
                    productos = "";
                    panes.setText(productos);
                    productos += "**Panadería el chero**\n";
                    productos += "Productos\t precio \tcantidad\n";
                    productos += "Relampago \t $0.75\t" + cantidadRe;
                    productos += " \nMieluda \t $0.60\t " + CantidadMie;
                    productos += " \nCacho \t $0.50\t" + cantidadCacho;
                    productos += " \nBorrachos \t $1.00\t" + CantidadBorracho;
                    panes.setText(productos);

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, detallesC);
                    break;
                case 4:
                    estado = false;
                    break;

                default: {
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                }

            }

        } while (estado);

    }

}
