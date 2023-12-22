package OOP.Transcript;

import OOP.Enums.Marks;

public class Mark {
    private double att1;
    private double att2;
    private double Final;

    private Marks Mark;


    public Mark(double att1, double att2, double aFinal) {
        this.att1 = att1;
        this.att2 = att2;
        Final = aFinal;
        Mark = letterMark();
    }

    /**
     * @generated
     */
    public double getAtt1() {
        return this.att1;
    }

    /**
     * @generated
     */
    public void setAtt1(Double att1) {
        this.att1 = att1;
    }


    /**
     * @generated
     */
    public double getAtt2() {
        return this.att2;
    }

    /**
     * @generated
     */
    public void setAtt2(Double att2) {
        this.att2 = att2;
    }


    /**
     * @generated
     */
    public double getFinal() {
        return this.Final;
    }

    /**
     * @generated
     */
    public void setFinal(Double Final) {
        this.Final = Final;
    }

    public Marks getMark() {
        return this.Mark;
    }

    public void setMark(Marks Mark) {
        this.Mark = Mark;
    }


    public double CalculateGP() {
        return att1 + att2 + Final;
    }
    public Marks letterMark(){
        double totalGP = CalculateGP();

        if (totalGP >= 90) {
            return Marks.A;
        } else if (totalGP >= 85) {
            return Marks.MINES_A;
        } else if (totalGP >= 80) {
            return Marks.PLUS_B;
        } else if (totalGP >= 75) {
            return Marks.B;
        } else if (totalGP >= 70) {
            return Marks.MINES_B;
        } else if (totalGP >= 65) {
            return Marks.PLUS_C;
        } else if (totalGP >= 60) {
            return Marks.C;
        } else if (totalGP >= 55) {
            return Marks.MINES_C;
        } else if (totalGP >= 50) {
            return Marks.PLUS_D;
        } else if (totalGP >= 45) {
            return Marks.D;
        } else {
            return Marks.F;
        }
    }
}
