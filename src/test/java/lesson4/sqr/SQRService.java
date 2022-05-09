package lesson4.sqr;

public class SQRService {

    public int calculateSqrNumberInBorders(int lowerBorder, int upperBorder){
        int sqrNumber = 0;

        for (int i = 0;i< upperBorder;i++) {
                if (i*i >= lowerBorder && i*i <= upperBorder){
                    sqrNumber = sqrNumber+1;
                }

            }
        if(lowerBorder == 0 && upperBorder <= 1){
            sqrNumber = sqrNumber+1;
        }
        if(lowerBorder == 1 && upperBorder == 1){
            sqrNumber = sqrNumber+1;
        }
        return sqrNumber;
    }
}
