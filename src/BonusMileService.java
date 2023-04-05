public class BonusMileService {

    public int calculate(int ticetPrice) {
        int bonusMile;
        if (ticetPrice > 20) {
          bonusMile = ticetPrice / 20;
        } else {
            bonusMile = 0;
        }

        return bonusMile;
    }
}

