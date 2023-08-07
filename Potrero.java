package programacion.proyecto;

import javax.swing.JOptionPane;

public class Potrero {
    Finca finca = new Finca(getTerreno(), getNombre(), getNombre(), getEstado(), getCantAnimales(), getFechaSalida(), getFechaEntrada(), getCodPotrero(), getCantAnimales());
    private int codPotrero;
    private String nombre;
    private String estado;
    private int fechaEntrada;
    private int fechaSalida;
    private int cantAnimales;
    private boolean agua;
    private String terreno;

    Potrero[] arrpotrerofin1 = new Potrero[finca.getCantPotreros()];

    public Potrero(int codPotrero, String nombre, String estado, int fechaEntrada, int fechaSalida, int cantAnimales, boolean agua, String terreno) {
        this.codPotrero = codPotrero;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantAnimales = cantAnimales;
        this.agua = agua;
        this.terreno = terreno;
    }
    
    public void pedirinfoPotrero() {
        this.codPotrero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el codigo del potrero: "));
        this.nombre = JOptionPane.showInputDialog(null, "Digite el nombre del potrero: ");
        this.estado = JOptionPane.showInputDialog("Digite el estado del terreno (descanso, libre, ocupado, No utilizable): ");
        this.fechaEntrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la entrada del animal: "));
        this.fechaSalida = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la salida del animal: "));
        this.cantAnimales = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de animales: "));
        String inputAgua = JOptionPane.showInputDialog("Digite el estado del agua (true o false): ");
        this.agua = Boolean.parseBoolean(inputAgua.toLowerCase());
        this.terreno = JOptionPane.showInputDialog("Digite el terreno del potrero: ");
    }

    public int getCodPotrero() {
        return codPotrero;
    }

    public void setCodPotrero(int codPotrero) {
        this.codPotrero = codPotrero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(int fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(int fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantAnimales() {
        return cantAnimales;
    }

    public void setCantAnimales(int cantAnimales) {
        this.cantAnimales = cantAnimales;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }
}
