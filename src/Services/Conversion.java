package Services;

import java.time.LocalDateTime;

public class Conversion {
    private String monedaQueTiene;
    private String monedaQueBusca;
    private Double cantidadACambiar;
    private Double  cantidadCambiada;
    private LocalDateTime tiempo;

    public Conversion(String monedaQueTiene, String monedaQueBusca, double cantidadACambiar, double cantidadCambiada) {
        this.monedaQueTiene = monedaQueTiene;
        this.monedaQueBusca = monedaQueBusca;
        this.cantidadACambiar = cantidadACambiar;
        this.cantidadCambiada = cantidadCambiada;
        this.tiempo = LocalDateTime.now();
    }

    public String getMonedaQueTiene() {
        return monedaQueTiene;
    }

    public void setMonedaQueTiene(String monedaQueTiene) {this.monedaQueTiene = monedaQueTiene;
    }

    public String getMonedaQueBusca() {
        return monedaQueBusca;
    }

    public void setMonedaQueBusca(String monedaQueBusca) {
        this.monedaQueBusca = monedaQueBusca;
    }

    public Double getCantidadACambiar() {
        return cantidadACambiar;
    }

    public void setCantidadACambiar(Double cantidadACambiar) {
        this.cantidadACambiar = cantidadACambiar;
    }

    public Double getCantidadCambiada() {
        return  cantidadCambiada;
    }

    public void setCantidadCambiada(Double cantidadEnMonedaObjetivo) {this. cantidadCambiada = cantidadEnMonedaObjetivo;
    }

    public LocalDateTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalDateTime tiempo) {
        this.tiempo = tiempo;
    }
}