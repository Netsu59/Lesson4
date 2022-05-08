package sqr.lesson4;

public class SQRService {

    public int calculateSqrNumberInBorders(int lowerBorder, int upperBorder){
        int SqrNumber = 0;

        for (int i = 0;i< upperBorder;i++) {
                if (i*i >= lowerBorder && i*i <= upperBorder){
                    SqrNumber = SqrNumber+1;
                }

            }
        if(lowerBorder == 0 && upperBorder <= 1){
            SqrNumber = SqrNumber+1;
        }
        if(lowerBorder == 1 && upperBorder == 1){
            SqrNumber = SqrNumber+1;
        }
        return SqrNumber;
    }
}
