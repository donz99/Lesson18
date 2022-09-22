package Lesson17;

public class Matrix {
    //*3. Класс Матрица
    //Создать класс "Матрица". Класс должен иметь следующие переменные:
    //
    //двумерный массив вещественных чисел;
    //количество строк и столбцов в матрице.
    //Класс должен иметь следующие методы:
    //
    //сложение с другой матрицей;
    //умножение на число;
    //вывод на печать;
    //умножение матриц - по желанию.

    private double[][] m;
    private int rowsQty;
    private int colQty;

    public Matrix() {}
    public Matrix(double[][] arr){
        rowsQty=arr.length;
        colQty=arr[0].length;
        m= new double[rowsQty][colQty];
        m = new double[arr.length][arr[0].length]; // m = arr - НЕПРАВИЛЬНО

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                m[i][j] = arr[i][j];
            }
        }
    }
    public Matrix(int n, int m) {
        rowsQty=n;
        colQty=m;
        this.m=new double[rowsQty][colQty];
    }

    public Matrix addMatrix(Matrix b){
        Matrix res = null;
        if (rowsQty == b.rowsQty && colQty == b.colQty){
            res = new Matrix(rowsQty, colQty);
            for (int i = 0; i < rowsQty; i++) {
                for (int j = 0; j < colQty; j++) {
                    res.m[i][j] = m[i][j] + b.m[i][j];
                }
            }
        }
        return res;
    }

    public void fillMatrix(int a) {
        for (int i = 0; i < rowsQty; i++) {
            for (int j = 0; j < colQty; j++) {
                m[i][j] = a;
            }
        }
    }

    public void print(){
        for (int i = 0; i < rowsQty; i++) {
            for (int j = 0; j < colQty; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    public double[][] getM(){return m;}

    public void umnMatrix(int u) {
        for (int i = 0; i < rowsQty; i++) {
            for (int j = 0; j < colQty; j++) {
                m[i][j] *=u;
            }
        }
    }

}
