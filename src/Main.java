import figure.*;
import figure.Color;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final int SIZE = 9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// прорисовка координат поля--------------------------------------------------------------------------------------------
        DeskObjects[][] desk = new DeskObjects[SIZE][SIZE];
// первоначальная расстановка фигур на поле-----------------------------------------------------------------------------
        desk[1][1] = new Rook(Color.WHITE);
        desk[1][8] = new Rook(Color.WHITE);
        desk[1][2] = new Horse(Color.WHITE);
        desk[1][7] = new Horse(Color.WHITE);
        desk[1][3] = new Officer(Color.WHITE);
        desk[1][6] = new Officer(Color.WHITE);
        desk[1][4] = new King(Color.WHITE);
        desk[1][5] = new Queen(Color.WHITE);
        for (int i = 0; i < SIZE; i++) {
            desk[2][i] = new Pawn(Color.WHITE);
        }
        desk[8][1] = new Rook(Color.BLACK);
        desk[8][8] = new Rook(Color.BLACK);
        desk[8][2] = new Horse(Color.BLACK);
        desk[8][7] = new Horse(Color.BLACK);
        desk[8][3] = new Officer(Color.BLACK);
        desk[8][6] = new Officer(Color.BLACK);
        desk[8][5] = new King(Color.BLACK);
        desk[8][4] = new Queen(Color.BLACK);
        for (int i = 0; i < SIZE; i++) {
            desk[7][i] = new Pawn(Color.BLACK);
        }

        Enum<Color> colorMove = Color.WHITE;

        desk[0][1] = new Characters(Color.WHITE, Chars.A);
        desk[0][2] = new Characters(Color.WHITE, Chars.B);
        desk[0][3] = new Characters(Color.WHITE, Chars.C);
        desk[0][4] = new Characters(Color.WHITE, Chars.D);
        desk[0][5] = new Characters(Color.WHITE, Chars.E);
        desk[0][6] = new Characters(Color.WHITE, Chars.F);
        desk[0][7] = new Characters(Color.WHITE, Chars.G);
        desk[0][8] = new Characters(Color.WHITE, Chars.H);
        for (int i = 0; i < SIZE; i++) {
            desk[i][0] = new Numbers(Color.WHITE, i + " ");
        }
        boolean endGame = false;
        while (!endGame) {
// прорисовка доски-----------------------------------------------------------------------------------------------------
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (desk[i][j] == null) {
                        System.out.print("|__");
                    } else {
                        System.out.printf("%3s", desk[i][j]);
                    }
                }
                System.out.println();
            }
            System.out.println();

            while (true) {
// ввод координаты 1----------------------------------------------------------------------------------------------------
                System.out.println("Введите первую координату (например: Е2)");
                String[] firstCoordinate = (scanner.nextLine()).split("");
                int x0 = Chars.valueOf(firstCoordinate[0]).ordinal() + 1;
                int y0 = Integer.parseInt(firstCoordinate[1]);
// проверка на цвет и наличие фигуры на доске---------------------------------------------------------------------------
                if (desk[y0][x0] == null || (desk[y0][x0]).getClass() == Numbers.class || (desk[y0][x0]).getClass() == Characters.class) {
                    System.out.println("Фигура отсутствует на выбранной ячейке");
                } else {
                    if ((desk[y0][x0]).Color != colorMove) {
                        System.out.println("Выбрана фигура другого цвета");
                    } else {
// ввод координаты 1----------------------------------------------------------------------------------------------------
                        System.out.println("Введите вторую координату (например: Е4)");
                        String[] secondCoordinate = (scanner.nextLine()).split("");
                        int x1 = Chars.valueOf(secondCoordinate[0]).ordinal() + 1;
                        int y1 = Integer.parseInt(secondCoordinate[1]);
// передвижение фигуры--------------------------------------------------------------------------------------------------
                        desk[y1][x1] = desk[y0][x0];
                        desk[y0][x0] = null;
                        break;
                    }
                }
            }
// TODO: 22.02.2022
//            colorMove = Color.opposite();
        }
    }
}