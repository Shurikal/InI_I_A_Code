package aufgaben.backtracking;

public class KnightsTour {
    private static final int allowedX[] = { 2,  2,  1, -1, -2, -2, -1, 1 };
    private static final int allowedY[] = { 1, -1, -2, -2, -1,  1,  2, 2 };

//    private static final int allowedX[] = { 2, 1, -1, -2, -2, -1,  1,  2 };
//    private static final int allowedY[] = { 1, 2,  2,  1, -1, -2, -2, -1 };

    private int[][] m_board;
    private int m_size;

    public KnightsTour(int size) {
        m_size = size;
        m_board = new int[size][size];
    }

    public void reset() {
        for(int x = 0; x < m_size; ++x) {
            for(int y = 0; y < m_size; ++y) {
                m_board[x][y] = 0;
            }
        }
    }

    public void print() {
        System.out.print("──┬");
        for(int x = 0; x < m_size - 1; ++x) {
            System.out.print("────┬");
        }
        System.out.println("────┐");
        for(int y = m_size - 1; y >= 0; --y) {
            System.out.print(y + 1);
            System.out.print(" │");
            for(int x = 0; x < m_size; ++x) {
                System.out.print(String.format(" %02d |", m_board[x][y]));
            }
            System.out.println();
            System.out.print("──┼");
            for(int x = 0; x < m_size - 1; ++x) {
                System.out.print("────┼");
            }
            System.out.println("────┤");
        }
        System.out.print("  │");
        for(int x = 0; x < m_size; ++x) {
            System.out.print(String.format(" % 2d |", x + 1));
        }
        System.out.println();
        System.out.println("-------------------");
        System.out.println();
    }

    public boolean startAt(int x, int y) {
        return tryAt(x, y, 1);
    }

    private boolean tryAt(int x, int y, int n) {
        m_board[x][y] = n; // Feld als besetzt markieren
        if(n == m_size * m_size) {
            //Erweiterung
            print();
            m_board[x][y] = 0; // Feld zurücksetzten

            return false; // Alle felder wurden besucht
        }
        else {
            for(int i = 0; i < allowedX.length; ++i) {
                final int xNew = x + allowedX[i];
                final int yNew = y + allowedY[i];
                if(
                        xNew >= 0 && xNew < m_size &&
                                yNew >= 0 && yNew < m_size &&
                                m_board[xNew][yNew] == 0 &&
                                tryAt(xNew, yNew, n + 1)
                ) {
                    return true; }
            }
            // alle 8 Versuche waren erfolglos
            m_board[x][y] = 0; // Feld zurücksetzten
            return false;
        }
    }

    ////////////////////////////////////////////////////////////////

    public static void main(String args[]) {
        KnightsTour example = new KnightsTour(5); // 5x5
        example.startAt(0, 0);
    }
}
