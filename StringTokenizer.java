package Homework2;

public class StringTokenizer implements PushbackTokenizer{
    StringTokenizer nextToken= new StringTokenizer();
    public StringTokenizer(){

    }

    @Override
    public String nextToken() {
        return null;
    }

    @Override
    public boolean hasMoreTokens() {
        java.util.StringTokenizer newToken = null;
        if(newToken.nextToken() == null){
        return false;
        }else{
            return true;
        }
        }

    @Override
    public void pushback() {

    }
}
