package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] tictac;

    public Board(Character[][] tictac) {
        this.tictac = tictac;
    }


    public Boolean isInFavorOfX() {
        Character winner = 'X';
        Boolean result = true;



        for (int i = 0; i < tictac.length; i++) {
            for (int j = 0; j < tictac[0].length; j++) {
                if (tictac[0][0] == winner && tictac[0][1] == winner && tictac[0][2] == winner) {
                    result = true;
                } else if (tictac[1][0] == winner && tictac[1][1] == winner && tictac[1][2] == winner) {
                    result = true;
                } else if (tictac[2][0] == winner && tictac[2][1] == winner && tictac[2][2] == winner) {
                    result = true;
                } else if (tictac[0][0] == winner && tictac[1][0] == winner && tictac[2][0] == winner) {
                    result = true;
                } else if (tictac[0][1] == winner && tictac[1][1] == winner && tictac[2][1] == winner) {
                    result = true;
                } else if (tictac[0][2] == winner && tictac[1][2] == winner && tictac[2][2] == winner) {
                    result = true;
                } else if (tictac[0][0] == winner && tictac[1][1] == winner && tictac[2][2] == winner) {
                    result = true;
                } else if (tictac[2][0] == winner && tictac[1][1] == winner && tictac[0][2] == winner) {
                    result = true;
                } else {
                    result = false;
                }
            }

        }
        return result;
    }


        public Boolean isInFavorOfO () {
            Character winner = 'O';
            Boolean result = true;



            for (int i = 0; i < tictac.length; i++) {
                for (int j = 0; j < tictac[0].length; j++) {
                    if (tictac[0][0] == winner && tictac[0][1] == winner && tictac[0][2] == winner) {
                        result = true;
                    } else if (tictac[1][0] == winner && tictac[1][1] == winner && tictac[1][2] == winner) {
                        result = true;
                    } else if (tictac[2][0] == winner && tictac[2][1] == winner && tictac[2][2] == winner) {
                        result = true;
                    } else if (tictac[0][0] == winner && tictac[1][0] == winner && tictac[2][0] == winner) {
                        result = true;
                    } else if (tictac[0][1] == winner && tictac[1][1] == winner && tictac[2][1] == winner) {
                        result = true;
                    } else if (tictac[0][2] == winner && tictac[1][2] == winner && tictac[2][2] == winner) {
                        result = true;
                    } else if (tictac[0][0] == winner && tictac[1][1] == winner && tictac[2][2] == winner) {
                        result = true;
                    } else if (tictac[2][0] == winner && tictac[1][1] == winner && tictac[0][2] == winner) {
                        result = true;
                    } else {
                        result = false;
                    }
                }

            }
            return result;
        }

        public Boolean isTie () {
            Boolean result = true;
            if (isInFavorOfO() == false && isInFavorOfX() == false) {
                result = true;
            } else {
                result =  false;
                return result;
            }
            return result;
        }

        public String getWinner () {

        if(isInFavorOfX() == true){
            String resultX = "X";
            return resultX;
        } else if (isInFavorOfO() == true){
            String result0 = "O";
            return result0;
        } else{
            String result = "";
            return result;
        }
        }


}
