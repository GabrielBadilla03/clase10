package programacion.clase10;
import javax.swing.JOptionPane;

public class datos {
    String iglesia = "";
    String pastor = "";
    int feligreses = 0;
    String nomfeli = "";
    int cedufeli = 0;
    int diezfeli = 0;
    int totalganado = 0;
    Object[][] datos;

    public void setIglesia() {
        iglesia = JOptionPane.showInputDialog(null, "Ingrese el nombre de la iglesia: ");
    }

    public String getIglesia() {
        return iglesia;
    }

    public void setPastor() {
        pastor = JOptionPane.showInputDialog(null, "Ingrese el nombre del pastor: ");
    }

    public String getPastor() {
        return pastor;
    }

    public void setFeligreses() {
        feligreses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de feligreses: "));
        datos = new Object[feligreses][3];
    }

    public int getFeligreses() {
        return feligreses;
    }

    public void datosFeligreses() {
        for (int i = 0; i < feligreses; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    nomfeli = JOptionPane.showInputDialog(null, "Ingrese el nombre del feligrés: ");
                    datos[i][j] = nomfeli;
                } else if (j == 1) {
                    cedufeli = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del feligrés: "));
                    datos[i][j] = cedufeli;
                } else if (j == 2) {
                    diezfeli = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el diezmo del feligrés: "));
                    totalganado += diezfeli;
                    datos[i][j] = diezfeli;
                }
            }
        }
        double gananciaspastor = totalganado * 0.70;
        double municipalidad = totalganado * 0.09;
        double comedor = totalganado * 0.21;
        JOptionPane.showMessageDialog(null, "Ganancias totales de la inglesia: " + totalganado);
        JOptionPane.showMessageDialog(null, "Ganancias del pastor: " + gananciaspastor);
        JOptionPane.showMessageDialog(null, "Municipalidad: " + municipalidad);
        JOptionPane.showMessageDialog(null, "Comedor: " + comedor);
    }
    public void mostrarDiezmoIgualCero() {
        String mensaje = "Personas con diezmo igual a 0:\n";
        for (int i = 0; i < feligreses; i++) {
            int diezmo = (int) datos[i][2];
            if (diezmo == 0) {
                String nombre = (String) datos[i][0];
                int cedula = (int) datos[i][1];
                mensaje += "Nombre: " + nombre + ", Cédula: " + cedula + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void mostrarDiezmoMayorCienMil() {
        String mensaje = "Personas con diezmo mayor a 100000:\n";
        for (int i = 0; i < feligreses; i++) {
            int diezmo = (int) datos[i][2];
            if (diezmo > 100000) {
                String nombre = (String) datos[i][0];
                int cedula = (int) datos[i][1];
                mensaje += "Nombre: " + nombre + ", Cédula: " + cedula + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}