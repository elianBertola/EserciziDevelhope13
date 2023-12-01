public class Eccezione {
    public void checkCharNumb(char carattere) {
        if (carattere >= '0' && carattere <= '9') {
            System.out.println("Il carattere e un numero");
        } else {
            throw new ArithmeticException("Il carattere '" + carattere + "' non e un numero");
        }
    }
}
