package be.vdab.mail.exceptions;

public class KanMailNietZendenException extends RuntimeException{
    private static final Long serialVersionUID = 1L;
    public KanMailNietZendenException(Exception oorspronkelijkeFout){
        super(oorspronkelijkeFout);
    }
}
