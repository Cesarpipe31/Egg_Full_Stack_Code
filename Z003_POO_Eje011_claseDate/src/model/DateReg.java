package model;

import java.util.Date;

public class DateReg {

    private Date fechaRegistrada;

    public DateReg() {

    }

    public DateReg(Date fechaRegistrada) {
        this.fechaRegistrada = fechaRegistrada;
    }

    public Date getFechaRegistrada() {
        return fechaRegistrada;
    }

    public void setFechaRegistrada(Date fechaRegistrada) {
        this.fechaRegistrada = fechaRegistrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Date{");
        sb.append("fechaRegistrada=").append(fechaRegistrada);
        sb.append('}');
        return sb.toString();
    }      
}
