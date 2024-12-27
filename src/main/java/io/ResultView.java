package io;

public class ResultView {

    private double result;

    public ResultView(double result){
        this.result = result;
    }

    public void print(){
        System.out.println("두 점 사이 거리는 " + result);
    }


}
