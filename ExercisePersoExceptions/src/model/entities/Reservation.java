package model.entities;

import model.exception.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainException{
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
        //PROGRAMACAO DEFENSIVA: TRATAR A EXCEÇÃO NO COMEÇO DO MÉTODO
        if (checkin.after(checkout)) {
            throw new DomainException("ERRO: o Check-out deve ser posterior ao Check-in");
        }
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    //DIFERENÇA ENTRE DUAS DATAS
    public long duration() {
        //PEGA A DIFERENCA DE TEMPO EM MILISEGUNDOS
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkout) throws DomainException{
        Date now = new Date();
        //SE O CHECKIN E O CHECKOUT FOREM ANTES DE AGORA
        if (checkin.before(now) || checkout.before(now)) {
            //LANCE UMA NOVA EXCEÇÃO COM ESSA MESSAGE:
            throw new DomainException("ERRO: a data de reserva não pode ser anterior ao momento atual.");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quarto " + roomNumber);
        sb.append(", check-in " + sdf.format(checkin));
        sb.append(", check-out " + sdf.format(checkout));
        sb.append(" " + duration() + " noite");
        return sb.toString();
    }
}
