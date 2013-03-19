import java.awt.*;

public class ProtoSquares extends EasyApp {
    public static void main(String[] args)
    { new ProtoSquares(); }
    
    Button[][] squares = new Button[3][3];
    Label lTurn = addLabel("Player",400,100,100,35,this);
    Label turn = addLabel("X",420,120,100,100,this);
    String[] questions =
    { "True/False : Pi is approximately 22/7",
        "What is the square root of 0.25?",
        "Who is a famous mathematician \n Eunice, Euclid, or Euyou?",
        "How many faces does a cube have?",
        "What nationality was Karl Friedrich Gauss?",
        "How many feet are there in one mile?",
        "Which is largest : \n(A)\u221a2 (B)1.2² (C)9/7 ",
        "What is the root of x² - 8x + 16 ?",
        "What does 0! equal?"
    };
    String[] answers =
    { "True","0.5","Euclid","6","German","5280","A","4","1" };
    int player = 1;
    public ProtoSquares()
    { Font thefont = new Font("Arial",0,64);
        turn.setFont(thefont);
        lTurn.setFont(new Font("Arial",0,24));
        for (int row = 0; row < 3; row = row+1)
        {
            for (int col = 0; col < 3; col = col + 1)
            {
                int x = 50 + 100*col;
                int y = 50 + 100*row;
                squares[row][col] = addButton("",x,y,100,100,this);
                squares[row][col].setFont(thefont);
            }
        }
    }
    public void actions(Object source, String command)
    { int qnum = -1;
        int rnum = -1;
        int cnum = -1;
        for (int row = 0; row < 3; row = row + 1)
        { for (int col = 0; col < 3; col = col + 1)
            {
                if (source == squares[row][col])
                {qnum = row*3 + col;
                    rnum = row;
                    cnum = col;
                }
            }
        }
        if (qnum >= 0)
        { if (squares[rnum][cnum].getLabel().equals(""))
            { String guess = input(questions[qnum]);
                if (guess.equalsIgnoreCase(answers[qnum]))
                {
                    if (player == 1)
                    { squares[rnum][cnum].setLabel("X"); }
                    else
                    { squares[rnum][cnum].setLabel("O"); }
                }
                checkWinner();
                player = -1*player;
                if (player==1)
                { turn.setText("X"); }
                else
                { turn.setText("O"); }
            }
            else
            { output("Choose an empty square"); }
        }
    }
    public void checkWinner()
    {
        for (int row = 0; row < 3; row = row + 1)
        {
            String a = squares[row][0].getLabel();
            String b = squares[row][1].getLabel();
            String c = squares[row][2].getLabel();
            if (!a.equals("") && a.equals(b) && b.equals(c))
            { output(a + " wins!");
                System.exit(0);
            }
        }
        for (int col = 0; col < 3; col = col + 1)
        {
            String a = squares[0][col].getLabel();
            String b = squares[1][col].getLabel();
            String c = squares[2][col].getLabel();
            if (!a.equals("") && a.equals(b) && b.equals(c))
            { output(a + " wins!");
                System.exit(0);
            }
        }
        String a = squares[0][0].getLabel();
        String b = squares[1][1].getLabel();
        String c = squares[2][2].getLabel();
        if (!a.equals("") && a.equals(b) && b.equals(c))
        { output(a + " wins!");
            System.exit(0);
        }
        String d = squares[0][2].getLabel();
        String e = squares[1][1].getLabel();
        String f = squares[2][0].getLabel();
        if (!d.equals("") && d.equals(e) && e.equals(f))
        { output(d + " wins!");
            System.exit(0);
        }
    }
}