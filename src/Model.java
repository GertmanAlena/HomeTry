public class Model {
    private Integer[] firstMass;
    private Integer[] secondMass;
    private Integer[] resMass;
    private Integer[] resMassDiv;
    boolean first = true;
    public Integer generateNumberLengsMass(Integer min, Integer max){
        int length = min + (int) (Math.random() * max);
        return length;
    }

    public Integer[] generateMass(Integer length){

        if(first == true){
            firstMass = new Integer[length];
            System.out.println("генерируем первый массив");
            for (int i = 0; i < firstMass.length; i++){
                firstMass[i] = ((int)(Math.random() * 31) - 15);
                first = false;

            }
            return firstMass;
        } else {
            secondMass = new Integer[length];
            System.out.println("генерируем второй массив");
            for (int i = 0; i < length; i++){
                secondMass[i] = ((int)(Math.random() * 31) - 15);
//                secondMass[i] = 0;
            }
            return secondMass;
        }
    }
    public void print(){
        System.out.print("1 [");
        for (int i = 0; i < firstMass.length; i++){
            System.out.print(firstMass[i] + ", ");
        }
        System.out.println("]");
        System.out.println();
        System.out.print("2 [");
        for (int i = 0; i < secondMass.length; i++){
            System.out.print(secondMass[i] + ", ");
        }
        System.out.println("]");
        System.out.println();

    }
    public Integer[] subtraction(){
        Integer x = 0;
        try {
            System.out.print("[");
            for (int i = 0; i < firstMass.length; i++) {
                resMass = new Integer[firstMass.length + secondMass.length];
                resMass[x] = firstMass[i] - secondMass[i];
                System.out.print(resMass[x] + " ");
                x++;
            }
            System.out.println("]");
            return resMass;
        } catch (NullPointerException e){
            System.out.println("\033[1;31mNullPointerException - resMass не инициализирован\033[0m");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\033[1;31mArrayIndexOutOfBoundsException - разная длинна массивов пропробуй сгенерировать заново\033[0m");
        }

        return null;
    }
    public Integer[] division()  {
        Integer x = 0;
        try {
            for (int i = 0; i < firstMass.length; i++) {
                resMass = new Integer[firstMass.length + secondMass.length];
                resMass[x] = firstMass[i] / secondMass[i];
                System.out.print(resMass[x] + " ");
                x++;
            }
            return resMass;
        } catch (NullPointerException e){
            System.out.println("\033[1;31mNullPointerException - resMass не инициализирован\033[0m");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\033[1;31mArrayIndexOutOfBoundsException - разная длинна массивов пропробуй сгенерировать заново\033[0m");
        }
        catch (ArithmeticException e){
            System.out.println("\033[1;31mArrayIndexOutOfBoundsException - на 0 делить нельзя!!!\033[0m");}

        return null;
    }
}
