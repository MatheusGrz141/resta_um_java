/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resta_um;

/**
 *
 * @author Matheus
 */
public class TRABALHOresta1 {

    public static void PrintMatriz(int mat[][]) {

        int x, y;
        System.out.println("");
        System.out.println("##############################");
        for (x = 0; x < 7; ++x) {
            for (y = 0; y < 7; ++y) {
                if (mat[x][y] == 1) {
                    System.out.print(" " + mat[x][y]);
                }
                if (mat[x][y] == 0) {
                    System.out.print(" " + mat[x][y]);
                }
                if (mat[x][y] == 2) {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
        System.out.println("##############################");
    }

    public static int Jogadas(int mat[][], int x) {
        int i, j;

        if (x != 0) {
            for (i = 0; i < 7; ++i) {
                for (j = 0; j < 7; ++j) {

                    if (x == 0) {
                        return x;
                    }

                    if (i >= 2 && i <= 4 && j <= 4) {
                        if (x != 0) {

                            if ((mat[i][j] == 1) && (mat[i][(j + 1)] == 1) && (mat[i][(j + 2)] == 0)) {
                                mat[i][(j + 2)] = 1;
                                mat[i][(j + 1)] = 0;
                                mat[i][j] = 0;

                                x = Jogadas(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[i][(j + 2)] = 0;
                                    mat[i][(j + 1)] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                    System.out.println("Jogada feita da posição"+i +" "+j+" para direita");
                                    return x;
                                }
                                if (x > 0) {
                                    mat[i][(j + 2)] = 0;
                                    mat[i][(j + 1)] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;

                                }

                            }
                        }

                    }
                    if (i >= 2 && i <= 4 && j >= 2) {
                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[i][(j - 1)] == 1) && (mat[i][(j - 2)] == 0)) {
                                mat[i][(j - 2)] = 1;
                                mat[i][(j - 1)] = 0;
                                mat[i][j] = 0;

                                x = Jogadas(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[i][(j - 2)] = 0;
                                    mat[i][(j - 1)] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                     System.out.println("Jogada feita da posição"+i +" "+j+" para esquerda");
                                    return x;
                                }
                                if (x > 0) {
                                    mat[i][(j - 2)] = 0;
                                    mat[i][(j - 1)] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }

                    }
                    //#####
                    if (j >= 2 && j <= 4 && i <= 4) {

                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[(i + 1)][j] == 1) && (mat[(i + 2)][(j)] == 0)) {
                                mat[(i + 2)][j] = 1;
                                mat[(i + 1)][j] = 0;
                                mat[i][j] = 0;

                                x = Jogadas(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[(i + 2)][j] = 0;
                                    mat[(i + 1)][j] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                     System.out.println("Jogada feita da posição"+i +" "+j+" para baixo");
                                    return x;
                                }
                                if (x > 0) {
                                    mat[(i + 2)][(j)] = 0;
                                    mat[(i + 1)][j] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }

                    }
                    if (j >= 2 && j <= 4 && i >= 2) {
                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[(i - 1)][j] == 1) && (mat[(i - 2)][j] == 0)) {
                                mat[(i - 2)][j] = 1;
                                mat[(i - 1)][j] = 0;
                                mat[i][j] = 0;

                                x = Jogadas(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[(i - 2)][j] = 0;
                                    mat[(i - 1)][j] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                     System.out.println("Jogada feita da posição"+i +" "+j+" para cima");
                                    return x;
                                }
                                if (x > 0) {
                                    mat[(i - 2)][j] = 0;
                                    mat[(i - 1)][j] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }

                    }
                    //###jogadas fixa ############################
                    if (i == 2 && (j <= 1 || j >= 5)) {
                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[(i + 1)][j] == 1) && (mat[(i + 2)][j] == 0)) {
                                mat[(i + 2)][j] = 1;
                                mat[(i + 1)][j] = 0;
                                mat[i][j] = 0;

                                x = Jogadas(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[(i + 2)][j] = 0;
                                    mat[(i + 1)][j] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                     System.out.println("Jogada feita da posição"+i +" "+j+" para baixo");
                                    return x;
                                }
                                if (x > 0) {
                                    mat[(i + 2)][j] = 0;
                                    mat[(i + 1)][j] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }
                    }
                    if (i == 4 && (j <= 1 || j >= 5)) {
                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[(i - 1)][j] == 1) && (mat[(i - 2)][j] == 0)) {
                                mat[(i - 2)][j] = 1;
                                mat[(i - 1)][j] = 0;
                                mat[i][j] = 0;

                                x = Jogadas(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[(i - 2)][j] = 0;
                                    mat[(i - 1)][j] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                     System.out.println("Jogada feita da posição"+i +" "+j+" para cima");
                                    return x;
                                }
                                if (x > 0) {
                                    mat[(i - 2)][j] = 0;
                                    mat[(i - 1)][j] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }
                    }

                    if (j == 2 && (i <= 1 || i >= 5)) {
                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[i][(j + 1)] == 1) && (mat[(i)][(j + 2)] == 0)) {
                                mat[i][(j + 2)] = 1;
                                mat[i][(j + 1)] = 0;
                                mat[i][j] = 0;

                                x = Jogadas(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[i][(j + 2)] = 0;
                                    mat[i][(j + 1)] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                     System.out.println("Jogada feita da posição"+i +" "+j+" para direita");
                                    return x;
                                }
                                if (x > 0) {
                                    mat[i][(j + 2)] = 0;
                                    mat[i][(j + 1)] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }
                    }
                    if (j == 4 && (i <= 1 || i >= 5)) {
                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[i][(j - 1)] == 1) && (mat[(i)][(j - 2)] == 0)) {
                                mat[i][(j - 2)] = 1;
                                mat[i][(j - 1)] = 0;
                                mat[i][j] = 0;

                                x = Jogadas(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[i][(j - 2)] = 0;
                                    mat[i][(j - 1)] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                     System.out.println("Jogada feita da posição"+i +" "+j+" para esquerda");
                                    return x;
                                }
                                if (x > 0) {
                                    mat[i][(j - 2)] = 0;
                                    mat[i][(j - 1)] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }

                    }

                }

            }
        }
        if (x == 0) {
            PrintMatriz(mat);
        }
        return x;

    }

    public static int JogadasCentro(int mat[][], int x) {
        int i, j;

        if (x != 0) {
            for (i = 0; i < 7; ++i) {
                for (j = 0; j < 7; ++j) {

                    if (x == 0) {
                        return x;
                    }

                    if (i >= 2 && i <= 4 && j <= 4) {
                        if (x != 0) {

                            if ((mat[i][j] == 1) && (mat[i][(j + 1)] == 1) && (mat[i][(j + 2)] == 0)) {
                                mat[i][(j + 2)] = 1;
                                mat[i][(j + 1)] = 0;
                                mat[i][j] = 0;

                                x = JogadasCentro(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[i][(j + 2)] = 0;
                                    mat[i][(j + 1)] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                    return x;
                                }
                                if (x > 0) {
                                    mat[i][(j + 2)] = 0;
                                    mat[i][(j + 1)] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;

                                }

                            }
                        }

                    }
                    if (i >= 2 && i <= 4 && j >= 2) {
                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[i][(j - 1)] == 1) && (mat[i][(j - 2)] == 0)) {
                                mat[i][(j - 2)] = 1;
                                mat[i][(j - 1)] = 0;
                                mat[i][j] = 0;

                                x = JogadasCentro(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[i][(j - 2)] = 0;
                                    mat[i][(j - 1)] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                    return x;
                                }
                                if (x > 0) {
                                    mat[i][(j - 2)] = 0;
                                    mat[i][(j - 1)] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }

                    }

                    if (j >= 2 && j <= 4 && i >= 2) {
                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[(i - 1)][j] == 1) && (mat[(i - 2)][j] == 0)) {
                                mat[(i - 2)][j] = 1;
                                mat[(i - 1)][j] = 0;
                                mat[i][j] = 0;

                                x = JogadasCentro(mat, x = (x - 1));
                                if (x <= 0 && mat[3][3] == 1) {
                                    mat[(i - 2)][j] = 0;
                                    mat[(i - 1)][j] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                    return x;
                                } else {
                                    mat[(i - 2)][j] = 0;
                                    mat[(i - 1)][j] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }

                    }

                    if (j >= 2 && j <= 4 && i <= 4) {

                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[(i + 1)][j] == 1) && (mat[(i + 2)][(j)] == 0)) {
                                mat[(i + 2)][j] = 1;
                                mat[(i + 1)][j] = 0;
                                mat[i][j] = 0;

                                x = JogadasCentro(mat, x = (x - 1));
                                if (x <= 0 && mat[3][3] == 1) {
                                    mat[(i + 2)][j] = 0;
                                    mat[(i + 1)][j] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                    return x;
                                } else {
                                    mat[(i + 2)][(j)] = 0;
                                    mat[(i + 1)][j] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }

                    }
                    //#####

                    //###jogadas fixa ############################
                    if (i == 2 && (j <= 1 || j >= 5)) {
                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[(i + 1)][j] == 1) && (mat[(i + 2)][j] == 0)) {
                                mat[(i + 2)][j] = 1;
                                mat[(i + 1)][j] = 0;
                                mat[i][j] = 0;

                                x = JogadasCentro(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[(i + 2)][j] = 0;
                                    mat[(i + 1)][j] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                    return x;
                                }
                                if (x > 0) {
                                    mat[(i + 2)][j] = 0;
                                    mat[(i + 1)][j] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }
                    }
                    if (i == 4 && (j <= 1 || j >= 5)) {
                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[(i - 1)][j] == 1) && (mat[(i - 2)][j] == 0)) {
                                mat[(i - 2)][j] = 1;
                                mat[(i - 1)][j] = 0;
                                mat[i][j] = 0;

                                x = JogadasCentro(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[(i - 2)][j] = 0;
                                    mat[(i - 1)][j] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                    return x;
                                }
                                if (x > 0) {
                                    mat[(i - 2)][j] = 0;
                                    mat[(i - 1)][j] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }
                    }

                    if (j == 2 && (i <= 1 || i >= 5)) {
                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[i][(j + 1)] == 1) && (mat[(i)][(j + 2)] == 0)) {
                                mat[i][(j + 2)] = 1;
                                mat[i][(j + 1)] = 0;
                                mat[i][j] = 0;

                                x = JogadasCentro(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[i][(j + 2)] = 0;
                                    mat[i][(j + 1)] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                    return x;
                                }
                                if (x > 0) {
                                    mat[i][(j + 2)] = 0;
                                    mat[i][(j + 1)] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }
                    }
                    if (j == 4 && (i <= 1 || i >= 5)) {
                        if (x != 0) {
                            if ((mat[i][j] == 1) && (mat[i][(j - 1)] == 1) && (mat[(i)][(j - 2)] == 0)) {
                                mat[i][(j - 2)] = 1;
                                mat[i][(j - 1)] = 0;
                                mat[i][j] = 0;

                                x = JogadasCentro(mat, x = (x - 1));
                                if (x <= 0) {
                                    mat[i][(j - 2)] = 0;
                                    mat[i][(j - 1)] = 1;
                                    mat[i][j] = 1;
                                    PrintMatriz(mat);
                                    return x;
                                }
                                if (x > 0) {
                                    mat[i][(j - 2)] = 0;
                                    mat[i][(j - 1)] = 1;
                                    mat[i][j] = 1;
                                    x = x + 1;
                                }
                            }
                        }

                    }

                }
            }
        }
        if (x == 0 && mat[3][3] == 1) {
            PrintMatriz(mat);
        }
        return x;
    }

    public static void main(String arg[]) {

        int n, m, i, j, tab[][] = new int[7][7];

        for (i = 0; i < 7; i++) {
            for (j = 0; j < 7; j++) {

                if ((i < 2 && j < 2) || (i > 4 && j > 4) || (i < 2 && j > 4) || (j < 2 && i > 4)) {
                    tab[i][j] = 2;
                } else {
                    tab[i][j] = 1;
                }

            }
        }
        n = Input.readInt("Resta quanto: ");

        while (n > 32 || n < 1) {
            System.out.println("valor invalido!!!");
            n = Input.readInt("Resta quanto: ");
        }

        tab[3][3] = 0;

        n = (32 - n);
        //System.out.println(" N = " + n);

        if (n == 31) {
            m = Input.readInt("1-peça deslocada ,2 para sobrar no centro: ");
            if (m == 1) {
                Jogadas(tab, n);
            }
            if (m == 2) {
                JogadasCentro(tab, n);
            }
        } else {
            Jogadas(tab, n);
        }

        System.out.println("fim do processo!!! ");

    }
}
