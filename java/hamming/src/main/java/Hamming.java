import java.lang.IllegalArgumentException;

class Hamming {

    private String leftStrand;
    private String rightStrand;
    private int hamming;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if (!leftStrand.isEmpty() && rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        this.hamming = getHammingDistance();
    }

    int getHammingDistance() {
        int hamming = 0;
        if (leftStrand.equals(rightStrand)) {
            return 0;
        } else {
            for (int i = 0; i < leftStrand.length(); i++) {
                if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                    hamming++;
                }
            }
        }
        return hamming;
    }

}
