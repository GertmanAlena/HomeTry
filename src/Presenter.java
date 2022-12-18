import java.util.Scanner;

public class Presenter {
    private final View view;
    private final Model model;
    private Integer length;



    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setPresenter(this);
    }
    public void generateNumberLengsMass(Integer min, Integer max) {
        length = model.generateNumberLengsMass(min, max);
        model.generateMass(length);

    }
    public void print(){
        model.print();
    }
    public void subtraction(){
        model.subtraction();

    }
    public void division(){
        model.division();
    }
}
