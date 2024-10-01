package practicaclase2;

import javax.swing.JOptionPane;

public class PracticaClase2 {

    public static void main(String[] args) {
        int numDiaSemana = 0;

        numDiaSemana = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 7"));
        /*
        switch (numDiaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "Es lunes y es dia laboral");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Es martes y es dia laboral");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Es miercoles y es dia laboral");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Es jueves y es dia laboral");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Es viernes y es dia laboral");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Es sabado y no es dia laboral");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Es domingo y no es dia laboral");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese un dia valido");
                break;

        }
        */
        if (numDiaSemana == 1) {
            JOptionPane.showMessageDialog(null, "Es lunes y es dia laboral");
        }
        if (numDiaSemana == 2) {
            JOptionPane.showMessageDialog(null, "Es martes y es dia laboral");
        }
        if (numDiaSemana == 3) {
            JOptionPane.showMessageDialog(null, "Es miercoles y es dia laboral");
        }
        if (numDiaSemana == 4) {
            JOptionPane.showMessageDialog(null, "Es jueves y es dia laboral");
        }
        if (numDiaSemana == 5) {
            JOptionPane.showMessageDialog(null, "Es viernes y es dia laboral");
        }
        if (numDiaSemana == 6) {
            JOptionPane.showMessageDialog(null, "Es sabado y no es dia laboral");
        }
        if (numDiaSemana == 7) {
            JOptionPane.showMessageDialog(null, "Es domingo y no es dia laboral");
        }
        if (numDiaSemana < 1 || numDiaSemana > 7) {
            JOptionPane.showMessageDialog(null, "Ingrese un dia valido");
        }

    }

}
