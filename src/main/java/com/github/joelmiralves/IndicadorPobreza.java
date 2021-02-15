package com.github.joelmiralves;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class IndicadorPobreza {

    private Pagina pagina;
    private List<IndicadorPais> indicadoresPais;

    @Data
    public static class  IndicadorPais {
        private Indicador indicador;
        private Country country;
        private String countryiso3code;
        private String date;
        private String value;
        private String unit;
        private String obs_status;
        private Integer decimal;
    }
    @Data
    public static class Pagina {
        private Integer page;
        private Integer pages;
        private Integer per_page;
        private Integer total;
        private String sourceid;
        private String lastupdated;
    }
    @Data
    public static class Indicador {
        private String id;
        private String value;
    }
    @Data
    public static class Country {
        private String id;
        private String value;
    }

}